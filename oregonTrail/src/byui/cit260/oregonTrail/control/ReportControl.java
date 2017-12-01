/*
 * Copyright (C) 2017 Brett Starks
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.exceptions.ReportControlException;
import byui.cit260.oregonTrail.model.Location;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Brett Starks
 */
public class ReportControl {

    public static void saveLocationReport(Location[] locations, String filePath) throws ReportControlException {
        try(PrintWriter output = new PrintWriter(filePath)) {
            output.println("\n\n                   Location Report                  ");
            output.printf("%n%-25s%-20s%-15s", "Name", "Location Type", "Dist. to Oregon");
            output.printf("%n%-25s%-20s%-15s", "---------------", "---------------", "---------------");
            for(Location location : locations) {
                output.printf("%n%-25s%-20s%-15s", location.getDesc(), location.getSceneType(), location.getDistanceToOregon() + " miles");
            }
            output.println("\n\n");
        } catch(Exception e) {
            throw new ReportControlException(e.getMessage());
        }
    }
    
    
    // Not sure how to get this to work.
//    public static void readLocationReport(String filePath) throws ReportControlException {
//
//        try(BufferedReader br = new BufferedReader(new FileReader(filePath + ".txt"))) {
//            String str;
//            while((str = br.readLine()) !=null ) {
//                this.console.println(str);
//            }
//        } catch(Exception e) {
//            throw new ReportControlException(e.getMessage());
//        }
//    }
    
    
    
}