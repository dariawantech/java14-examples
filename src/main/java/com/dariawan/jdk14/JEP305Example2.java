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
import java.util.Arrays;
import java.util.List;

public class JEP305Example2 {

    private void hiRobot(Robot robot) {
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
    
    private void listRobot(Object o) {
        if (o instanceof List l && !l.isEmpty()) {
            for (Object obj : l) {
                if (obj instanceof Robot robot) {
                    hiRobot(robot);
                }
            }
        }
        else {
            System.out.println("Not a List or List is empty");
        }
    }

    public static void main(String[] args) {        
        JEP305Example2 sample = new JEP305Example2();
        
        List l = null;
        sample.listRobot(l);
        
        l = Arrays.asList();
        sample.listRobot(l);
        
        l = Arrays.asList(new RobotVacuumCleaner(), new RobotLawnMower(), new RobotVendingMachine("hot coffee"));
        sample.listRobot(l);
    }
}
