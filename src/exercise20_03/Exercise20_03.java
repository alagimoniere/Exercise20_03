package exercise20_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise20_03 {

    public static void main(String[] args) {
       
        /** Declare variables */
        int correctAnswers = 0;
        String guess = "";
        Scanner keyboard = new Scanner(System.in);
        String[][] list = {
            {"Alabama",  "Montgomery"},
            {"Alaska",  "Juneau"},
            {"Arizona",  "Phoenix"},
            {"Arkansas",  "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado",  "Denver"},
            {"Connecticut",  "Hartford"},
            {"Delaware",  "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia",  "Atlanta"},
            {"Hawaii",  "Honolulu"},
            {"Idaho",  "Boise"},
            {"Illinois",  "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa",  "Des Monies"},
            {"Kansas",  "Topeka"},
            {"Kentucky",  "Frankfort"},
            {"Louisiana",  "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland",  "Annapolis"},
            {"Massachusetts",  "Boston"},
            {"Michigan",  "Lansing"},
            {"Minnesota", "St. Paul"},
            {"Mississippi",  "Jackson"},
            {"Missouri",  "Jefferson City"},
            {"Montana",  "Helena"},
            {"Nebraska",  "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire",  "Concord"},
            {"New Jersey",  "Trenton"},
            {"New Mexico",  "Santa Fe"},
            {"New York", "Albany"},
            {"North Carolina",  "Raleigh"},
            {"North Dakota", "Bismark"},
            {"Ohio",  "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon",  "Salem"},
            {"Pennsylvania",  "Harrisburg"},
            {"Rhode Island",  "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin","Madison"},
            {"Wyoming", "Cheyenne"}
        };
               
        /** Create 2D array of capitals and states */
        List<List<String>> statesAndCapitals = new ArrayList<>(list.length);
        
        for (String[] array : list) {
            statesAndCapitals.add(Arrays.asList(array));
        }
        
        /** Shuffle array */
        Collections.shuffle(statesAndCapitals, new Random());
               
        int i = 0;
        for (i = 0; i < 50; i++) {
            System.out.println("What is the capital of " + statesAndCapitals.get(i).get(0) + "?");
            guess = keyboard.next();
                if (statesAndCapitals.get(i).get(1).equalsIgnoreCase(guess)) {
                    correctAnswers++;
                    System.out.println("That is correct!");
                } else {
                    System.out.println("That is incorrect.");
                    i++;
                }
        }
 
        System.out.println("Correct answers: " + correctAnswers);
    }
    
}