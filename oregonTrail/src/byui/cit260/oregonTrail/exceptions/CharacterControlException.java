/*
 * Copyright (C) 2017 Cece's
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
package byui.cit260.oregonTrail.exceptions;

/**
 *
 * @author J.R. Basham, Brett Starks, Jason Q
 */
public class CharacterControlException extends Exception{

    public CharacterControlException() {
    }

    public CharacterControlException(String message) {
        super(message);
    }

    public CharacterControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CharacterControlException(Throwable cause) {
        super(cause);
    }

    public CharacterControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
   
    
}
