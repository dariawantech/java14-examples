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
import java.time.LocalDate;
import java.time.Month;

public class JEP359ProductExample {
 
    public static void main(String[] args) {
        Product prod = new Product(888L, "PRD888",
                "Amazing Vocal Microphone",
                LocalDate.of(2020, Month.MARCH, 25));
        // prod.setName("Amazing Subwoofer")  // will not work
        System.out.println(prod);
        System.out.println("Future release: " + prod.isFutureRelease());
        
        prod = new Product(999L, "PRD99",
                "Amazing Synthesizer",
                LocalDate.of(2027, Month.MAY, 7));
        System.out.println(prod);
        System.out.println("Future release: " + prod.isFutureRelease());
    }
    
    // java --enable-preview com.dariawan.jdk14.JEP359ProductExample
}
