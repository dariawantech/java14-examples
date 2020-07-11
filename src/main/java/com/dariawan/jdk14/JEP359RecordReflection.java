/**
 * Java 14 Code Examples v1 (https://www.dariawan.com)
 * Copyright (C) 2020 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to:
 * # Share - copy and redistribute the material in any medium or format
 * # Adapt - remix, transform, and build upon the material for any purpose,
 *   even commercially.
 *
 * The licensor cannot revoke these freedoms
 * as long as you follow the license terms.
 *
 * License terms:
 * # Attribution - You must give appropriate credit, provide a link to the
 *   license, and indicate if changes were made. You may do so in any
 *   reasonable manner, but not in any way that suggests the licensor
 *   endorses you or your use.
 * # ShareAlike - If you remix, transform, or build upon the material, you must
 *   distribute your contributions under the same license as the original.
 * # No additional restrictions - You may not apply legal terms or
 *   technological measures that legally restrict others from doing anything the
 *   license permits.
 *
 * Notices:
 * # You do not have to comply with the license for elements of the material in
 *   the public domain or where your use is permitted by an applicable exception
 *   or limitation.
 * # No warranties are given. The license may not give you all of
 *   the permissions necessary for your intended use. For example, other rights
 *   such as publicity, privacy, or moral rights may limit how you use
 *   the material.
 *
 * You may obtain a copy of the License at
 *   https://creativecommons.org/licenses/by-sa/4.0/
 *   https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.jdk14;

import com.dariawan.jdk14.records.Product;
import java.lang.reflect.Field;
import java.lang.reflect.RecordComponent;
import java.time.LocalDate;
import java.time.Month;

public class JEP359RecordReflection {
 
    public static void main(String[] args) {
        Product prod = new Product(111L, "PRD111",
                "New Multiplayer Game",
                LocalDate.of(2020, Month.MARCH, 31));
        System.out.println(prod);
        System.out.println("Id         : " + prod.id());
        System.out.println("Code       : " + prod.code());
        System.out.println("Name       : " + prod.name());
        System.out.println("ReleaseDate: " + prod.releaseDate());
        
        Field fld = null;
        try {
            fld = prod.getClass().getDeclaredField("code");
            fld.setAccessible(true);
            fld.set(prod, "PRO111");
            System.out.println("New code: " + prod.code());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (Product.class.isRecord()) {
            System.out.println("Product is a record, and record's components are:");
            RecordComponent[] cs = Product.class.getRecordComponents();
            for (RecordComponent c : cs) {
                System.out.println(" >> " + c);
            }
        }
    }
    
    // java --enable-preview com.dariawan.jdk14.JEP359RecordReflection
}
