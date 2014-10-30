/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.ArrayList;

/**
 *
 * @author student1
 */
public class dataGame {

    public class Player {
        // Player Name
        String Name = null;

        public String getName() {
            return Name;
        }
        // Historical List of Scores
        ArrayList<Integer> HighScores = new ArrayList();

        public ArrayList<Integer> getHighScores() {
            return HighScores;
        }
        
        public void newScore(Integer newHighScore)
        {
            // add to list
            
            // re-sort list
            
            // push new stats? or have game stats pull them
        }
    }
}
