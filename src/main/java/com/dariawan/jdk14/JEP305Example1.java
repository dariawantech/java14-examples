/**
 * Java 14 Code Examples v1 (https://www.dariawan.com)
 * Copyright (C) 2020 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to: # Share - copy and redistribute the
 * material in any medium or format # Adapt - remix, transform, and build upon
 * the material for any purpose, even commercially.
 *
 * The licensor cannot revoke these freedoms as long as you follow the license
 * terms.
 *
 * License terms: # Attribution - You must give appropriate credit, provide a
 * link to the license, and indicate if changes were made. You may do so in any
 * reasonable manner, but not in any way that suggests the licensor endorses you
 * or your use. # ShareAlike - If you remix, transform, or build upon the
 * material, you must distribute your contributions under the same license as
 * the original. # No additional restrictions - You may not apply legal terms or
 * technological measures that legally restrict others from doing anything the
 * license permits.
 *
 * Notices: # You do not have to comply with the license for elements of the
 * material in the public domain or where your use is permitted by an applicable
 * exception or limitation. # No warranties are given. The license may not give
 * you all of the permissions necessary for your intended use. For example,
 * other rights such as publicity, privacy, or moral rights may limit how you
 * use the material.
 *
 * You may obtain a copy of the License at
 * https://creativecommons.org/licenses/by-sa/4.0/
 * https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.jdk14;

import com.dariawan.jdk14.dto.Robot;
import com.dariawan.jdk14.dto.RobotLawnMower;
import com.dariawan.jdk14.dto.RobotVacuumCleaner;
import com.dariawan.jdk14.dto.RobotVendingMachine;

public class JEP305Example1 {

    public void hiRobot(Robot robot) {
        if (robot instanceof RobotVacuumCleaner vc) {
            vc.clean();
        } 
        else if (robot instanceof RobotLawnMower lw) {
            lw.mow();
        } 
        else if (robot instanceof RobotVendingMachine vm) {
            vm.serve();
        }
        else {
            System.out.println("Unregistered robot...");
        }
    }
    
    public static void main(String[] args) {
        // After JDK 14
        
        Object obj1 = "1";
        if (obj1 instanceof String str) {
            System.out.printf("String: %s\n", str);
        } else {
            System.out.printf("Not a string\n");
        }

        Object obj2 = 1;
        if (obj2 instanceof Integer i) {
            System.out.printf("Integer: %s\n", i);
        } else {
            System.out.printf("Not an Integer\n");
        }
        
        JEP305Example1 sample = new JEP305Example1();
        sample.hiRobot(new RobotVacuumCleaner());
        sample.hiRobot(new RobotLawnMower());
        sample.hiRobot(new RobotVendingMachine("instant noodle"));
    }
}
