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
package com.dariawan.jdk14.dto;

import java.util.Objects;

public class RobotVendingMachine extends Robot {
    
    private String item;
    
    public RobotVendingMachine(String item) {
        this.item = item;
    }
    
    public void serve() {
        System.out.println(this.getName() + " serving " + this.item);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.item);
        return hash;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (obj instanceof RobotVendingMachine) {            
//            final RobotVendingMachine other = (RobotVendingMachine) obj;
//            if (!Objects.equals(this.item, other.item)) {
//                return false;
//            }
//        }
//        else {
//            return false;
//        }
//        return true;
//    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof RobotVendingMachine other) {
            if (!Objects.equals(this.item, other.item)) {
                return false;
            }
        }
        else {
            return false;
        }

        return true;
    }
    
}
