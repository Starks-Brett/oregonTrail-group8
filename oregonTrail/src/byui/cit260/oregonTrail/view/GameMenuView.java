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
package byui.cit260.oregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Brett Starks, Jason Quibilan, JR Basham
 */
public class GameMenuView {
    
    private String menu;
    
    public GameMenuView() {
        this.menu =   "\n"
                    + "\n-----------------------------------------------------"
                    + "\n| Game Menu                                         |"
                    + "\n-----------------------------------------------------"
                    + "\n|D - View Date & Day of the Week                    |"
                    + "\n|N - Check Distance Traveled from Missouri          |"
                    + "\n|O - Check Distance Remaining to Oregon             |"
                    + "\n|A - Check Surrounding Area                         |"
                    + "\n|E - Check for any Events that Occured last Night   |"
                    + "\n|W - View Current Weather                           |"
                    + "\n|S - View Team Status                               |"
                    + "\n|I - View Current Inventory                         |"
                    + "\n|P - Set Team Pace                                  |"
                    + "\n|G - Go to Scene Menu                               |"
                    + "\n|M - View the Map                                   |"
                    + "\n|H - Help Menu                                      |"
                    + "\n|Q - Main Menu                                      |"
                    + "\n-----------------------------------------------------";
    }

    public void displayMenu() {
        boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q")) return;
            
            done = this.doAction(menuOption);
            
            
        } while(!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() <1) {
                System.out.println("\n*** Value cannot be blank ***");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String menuOption) {      
        
        menuOption = menuOption.toUpperCase();
        
        switch(menuOption) {
            case "D":
                this.viewDate();
                break;
            case "N":
                this.checkDistanceFromMissouri();
                break;
            case "O":
                this.checkDistanceToOregon();
                break;
            case "A":
                this.checkSurroundings();
                break;
            case "E":
                this.viewEventLog();
                break;
            case "W":
                this.viewWeather();
                break;
            case "S":
                this.viewTeamStatus();
                break;
            case "I":
                this.displayItemMenu();
                break;
            case "P":
                this.displayPaceMenu();
                break;
            case "G":
                this.displayGameMenu();
                break;
            case "M":
                this.displayMapMenu();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        }
        return false;
    }

    private void viewDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void checkDistanceFromMissouri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void checkDistanceToOregon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMapMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayGameMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayPaceMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayItemMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewTeamStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewWeather() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewEventLog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void checkSurroundings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
