package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWinsApp {

    public static void main(String[] args) {

        //we need a scanner store the answer to questions we ask folks
        Scanner inputScanner = new Scanner(System.in);

        //aske them the question
        System.out.println("Please enter the game score (Home:Visitor|21:9): ");

        //store the answer to the question in a variable add .trim to remove wierd spaces on the left and right side
        String gameScore = inputScanner.nextLine().trim();

        //split the gameScore info on the |
        String[] gameParts = gameScore.split(Pattern.quote("|"));

        String teamNames = gameParts[0];
        String teamScores = gameParts[1];

        System.out.println("Team Names: " + teamNames);
        System.out.println("Team Scores: " + teamScores);

        //get the individual team names in their own array
        String[] teamNamesArray = teamNames.split(":");

        //get the individual team scores in their own array
        String[] teamScoresArray = teamScores.split(":");

        //store the first team name in its own variable
        String homeTeam = teamNamesArray[0];
        String visitorTeam = teamNamesArray[1];

        //store the individual teams scores in their own variables
        int homeScore = Integer.parseInt(teamScoresArray[0]);
        int visitorScore = Integer.parseInt(teamScoresArray[1]);

        //display the name of the winning team
        //which teams score is higher
        //display the team name who has the highest score
        //BONUS: what do we do if there is a tie?

        if(homeScore > visitorScore){
            System.out.println("the winner is : " + homeTeam);

        }else if(homeScore < visitorScore){
            System.out.println("the winner is : " + visitorTeam);
        } else {
            System.out.println("tie");
        }

    }

}
