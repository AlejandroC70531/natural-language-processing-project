import java.util.ArrayList;
import java.util.Scanner;

public class NBAnalyzer {
  private ArrayList<String> teams;
  private ArrayList<String> locations;
  private ArrayList<String> chosenLocations;
  private ArrayList<Integer> locationCounts;
  private ArrayList<String> rivalries;
  private ArrayList<String> chosenRivalries;
  private ArrayList<Integer> rivalryCounts;
  private ArrayList<String> conference;
  private ArrayList<Double> averageScores;

/**
 * Constructs the analyzer and its data
 * Creates brand new lists for more data to come as a result of the program
 *
 * Precondition: All argument lists are created and instantiated properly
 * Postcondition: Lists are properly added to the analyzer; Those ending in a new ArrayList are empty
 * 
 * @param		ArrayList<String> teams: An ArrayList of all NBA teams
 * @param		ArrayList<String> locations: An ArrayList of each NBA team's location
 * @param   ArrayList<String> rivalries: An ArrayList of every NBA team's rivalries
 * @param   ArrayList<String> conferences: An ArrayList of the conference each team is in
 * @param   ArrayList<String> averageScores: An ArrayList of each team's average points scored per game
 */
  public NBAnalyzer(ArrayList<String> teams, ArrayList<String> locations, ArrayList<String> rivalries, ArrayList<String> conference, ArrayList<Double> averageScores){
    this.teams = teams;
    this.locations = locations;
    this.chosenLocations = new ArrayList<String>();
    this.locationCounts = new ArrayList<Integer>();
    this.rivalries = rivalries;
    this.chosenRivalries = new ArrayList<String>();
    this.rivalryCounts = new ArrayList<Integer>();
    this.conference = conference;
    this.averageScores = averageScores;
  }
  
/**
 * Student Developed; Takes user input and executes certain methods based off the input
 *
 * Precondition: N/A
 * Postcondition: N/A
 * 
 */
  public void prompt(){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to NBAnalyzer! I'm Michael! How can I help you? Please choose a data range below: ");
    System.out.println("1. NBA");
    System.out.println("2. Conference");
    System.out.println("3. Team");
    System.out.println("4. Simulate a Match");
    String choice = input.nextLine();
    choice.toLowerCase();
        
    while(choice.equals("nba")){
      System.out.println("Cool! Pick what data you'd like to explore: ");
      System.out.println("1. Locations");
      System.out.println("2. Rivalries");
      System.out.println("3. Average Points Scored");
      choice = input.nextLine();
      choice.toLowerCase();
      if(choice.equals("locations")){
        System.out.println(locationsToString("NBA", "N/A", "N/A"));
      } else if(choice.equals("rivalries")){
        System.out.println(rivalriesToString("NBA", "N/A", "N/A"));
      } else if(choice.equals("average points scored")){
        System.out.println(findAverageScoresAverage("NBA", "N/A", "N/A"));      
      } else{
        System.out.println("I'm sorry. I didn't understand that. Please try again.");
      }
      System.out.println("Would you like to access any other data in this category, yes or no: ");
      choice = input.nextLine();
      choice.toLowerCase();
      if(choice.equals("yes")){
        choice = "nba";
      } else {
        System.out.println("Would you like to choose a new category, yes or no: ");
        choice = input.nextLine();
        choice.toLowerCase();
        if(choice.equals("yes")){
          System.out.println("1. Conference");
          System.out.println("2. Team");
          System.out.println("3. Simulate a Match");
          System.out.println("Choose from these options: ");
          choice = input.nextLine();
          choice.toLowerCase();
        } else {
          System.out.println("Okay then. See you next time.");
        }
      }
    }
    
    
    while(choice.equals("conference")){
      System.out.println("Which conference would you like to explore, East or West: ");
      String chosenConference = input.nextLine();
      System.out.println("Cool! Pick what data you'd like to explore: ");
      System.out.println("1. Locations");
      System.out.println("2. Rivalries");
      System.out.println("3. Average Points Scored");
      choice = input.nextLine();
      choice.toLowerCase();
      if(choice.equals("locations")){
        System.out.println(locationsToString("Conference", chosenConference, "N/A"));
      } else if(choice.equals("rivalries")){
        System.out.println(rivalriesToString("Conference", chosenConference, "N/A"));
      } else if(choice.equals("average points scored")){
        System.out.println(findAverageScoresAverage("Conference", chosenConference, "N/A"));      
      } else{
        System.out.println("I'm sorry. I didn't understand that. Please try again.");
      }
      System.out.println("Would you like to access any other data in this category, yes or no: ");
      choice = input.nextLine();
      choice.toLowerCase();
      if(choice.equals("yes")){
        choice = "conference";
      } else {
        System.out.println("Would you like to choose a new category, yes or no: ");
        choice = input.nextLine();
        choice.toLowerCase();
        if(choice.equals("yes")){
          System.out.println("1. NBA");
          System.out.println("2. Team");
          System.out.println("3. Simulate a Match");
          System.out.println("Choose from these options: ");
          choice = input.nextLine();
          choice.toLowerCase();
        } else {
          System.out.println("Okay then. See you next time.");
        }
      }
    }
    
    while(choice.equals("team")){
      System.out.println("Which team would you like to explore: ");
      String chosenTeam = input.nextLine();
      System.out.println("Cool! Pick what data you'd like to explore: ");
      System.out.println("1. Location");
      System.out.println("2. Rivalries");
      System.out.println("3. Average Points Scored");
      choice = input.nextLine();
      choice.toLowerCase();
      if(choice.equals("location")){
        System.out.println(locationsToString("Team", "N/A", chosenTeam));
      } else if(choice.equals("rivalries")){
        System.out.println(rivalriesToString("Team", "N/A", chosenTeam));
      } else if(choice.equals("average points scored")){
        System.out.println(findAverageScoresAverage("Team", "N/A", chosenTeam));      
      } else{
        System.out.println("I'm sorry. I didn't understand that. Please try again.");
      }
      System.out.println("Would you like to access any other data in this category, yes or no: ");
      choice = input.nextLine();
      choice.toLowerCase();
      if(choice.equals("yes")){
        choice = "team";
      } else {
        System.out.println("Would you like to choose a new category, yes or no: ");
        choice = input.nextLine();
        choice.toLowerCase();
        if(choice.equals("yes")){
          System.out.println("1. NBA");
          System.out.println("2. Conference");
          System.out.println("3. Simulate a Match");
          System.out.println("Choose from these options: ");
          choice = input.nextLine();
          choice.toLowerCase();
        } else {
          System.out.println("Okay then. See you next time.");
        }
      }
    }
    
    while(choice.equals("simulate a match")){
      System.out.println("Cool! Pick your first team: ");
      String firstTeam = input.nextLine();
      System.out.println("Nice choice! Pick your second team: ");
      String secondTeam = input.nextLine();
      System.out.println(simulate(firstTeam, secondTeam));
      System.out.println("Would you like to simulate another match, yes or no: ");
      choice = input.nextLine();
      choice.toLowerCase();
      if(choice.equals("yes")){
        choice = "simulate a match";
      } else {
        System.out.println("Would you like to choose a new category, yes or no: ");
        choice = input.nextLine();
        choice.toLowerCase();
        if(choice.equals("yes")){
          System.out.println("1. NBA");
          System.out.println("2. Conference");
          System.out.println("3. Team");
          System.out.println("Choose from these options: ");
          choice = input.nextLine();
          choice.toLowerCase();
        } else{
          System.out.println("Okay then. See you next time.");
        }
      }
    }
    System.out.println("Goodbye!"); 
    input.close();
  }

/**
 * Student Developed; Finds the locations of teams based off what team(s) to look for
 *
 * Precondition: category, conference, and teamName are != null and are expected arguments
 * Postcondition: The chosenLocations and locationCounts instance variables now have values within them.
 * 
 * @param		String category: The category of teams that should be parsed through (ex. NBA checks all teams)
 * @param   String conference: The conference of teams to parse through (is N/A if category isn't conference)
 * @param   String teamName: The name of the team to be parsed through (is N/A if category isn't team)
 */

  public void findLocations(String category, String conference, String teamName){
    for(int g = 0; g < chosenLocations.size(); g++){
      chosenLocations.remove(g);
      g--;
    }
    for(int h = 0; h < locationCounts.size(); h++){
      locationCounts.remove(h);
      h--;
    }
    
    if(category.equals("NBA")){
      for(int i = 0; i < teams.size(); i++){
        String currentLocation = locations.get(i);
        int commaIndex = currentLocation.indexOf(",");
        if(commaIndex != -1){
          addLocations(currentLocation.substring(commaIndex + 1));
        } else {
          addLocations(currentLocation);
        }
      }
    } else if(category.equals("Conference")){
      for(int j = 0; j < teams.size(); j++){
        boolean isInConference = findConference(teams.get(j), conference);
        if(isInConference == true){
        String currentLocation = locations.get(j);
        int commaIndex = currentLocation.indexOf(",");
        if(commaIndex != -1){
          addLocations(currentLocation.substring(commaIndex + 1));
        } else {
          addLocations(currentLocation);
        }
       }
      }
    } else {
      int chosenIndex = 0;
      for(int k = 0; k < teams.size(); k++){
        if(teams.get(k).equals(teamName)){
          chosenIndex = k;
        }
      }
      int commaIndex = locations.get(chosenIndex).indexOf(",");
      if(commaIndex != 1){
        addLocations(locations.get(chosenIndex).substring(commaIndex + 1));
      } else {
        addLocations(locations.get(chosenIndex));
      }
    }
  }

/**
 * Student Developed; Adds the location passed from the findLocations method and records its appearance amount
 * If it was already added, the count recording how many times it appears increases by 1
 *
 * Precondition: location is a valid and expected location from the locations list
 * Postcondition: location is added to the chosenLocations list, otherwise one of the counts is increased in the locationCounts list
 * 
 * @param		String location: The location of the team at its respective index in the locations list
 */
  public void addLocations(String location){
    boolean found = false;
    
    for(int i = 0; i < chosenLocations.size(); i++){
      String currentLocation = chosenLocations.get(i);
      if(currentLocation.equals(location) && !found){
        locationCounts.set(i, locationCounts.get(i) + 1);
        found = true;
      }
    }
      if(!found){
        chosenLocations.add(location);
        locationCounts.add(1);
      }
  }
  
/**
 * Student Developed; Checks to see if the team passed into the method is in the requested conference
 *
 * Precondition: team is a valid team in the NBA and the desiredConference is located in the NBA
 * Postcondition: A boolean of true or false is returned
 * 
 * @param		String team: The name of the team to check
 * @param	  String desiredConference: The name of the conference to compare with team's conference
 * @return  A boolean describing whether or not the team is in the conference
 */
  public boolean findConference(String team, String desiredConference){
    int foundIndex = 0;
    for(int i = 0; i < teams.size(); i++){
      if(teams.get(i).equals(team)){
        foundIndex = i;
      }
    }
    if(conference.get(foundIndex).equals(desiredConference)){
      return true;
    }
    return false;
  }

/**
 * Student Developed; Finds the rivalries of teams based off what team(s) to look for
 *
 * Precondition: category, conference, and teamName are != null and are expected arguments
 * Postcondition: The chosenRivalries and rivalryCounts instance variables now have values within them.
 * 
 * @param		String category: The category of teams that should be parsed through (ex. NBA checks all teams)
 * @param   String conference: The conference of teams to parse through (is N/A if category isn't conference)
 * @param   String teamName: The name of the team to be parsed through (is N/A if category isn't team)
 */
public void findRivalries(String category, String conference, String teamName) {
    for(int g = 0; g < chosenRivalries.size(); g++){
      chosenRivalries.remove(g);
      g--;
    }
    for(int h = 0; h < rivalryCounts.size(); h++){
      rivalryCounts.remove(h);
      h--;
    }
    if (category.equals("NBA")) {
      findRivalriesByLeague();
    } else if (category.equals("Conference")){
      findRivalriesByConference(conference);
    } else {
      findRivalriesByTeam(teamName);
    }
  }

/**
 * Adds the rival teams of every team passed from the findRivalries method and records its appearance amount
 * If it was already added, the count recording how many times it appears increases by 1
 *
 * Precondition: chosenRivalries and rivalryCounts are currently empty
 * Postcondition: Each count in rivalryCounts is representative of the location in chosenRivalries at the corresponding index
 * 
 */
  public void findRivalriesByLeague() {
    // Iterate over the teams
    for (int i = 0; i < teams.size(); i++) {
      String currentTeam = teams.get(i);
      chosenRivalries.add(currentTeam);
      rivalryCounts.add(0);
      for (int j = 0; j < rivalries.size(); j++) {
        
        String currentRivals = rivalries.get(j);
        String[] rivalsArray = currentRivals.split(",");
        
        for (String rival : rivalsArray) {
          if (rival.equals(currentTeam)) {
            rivalryCounts.set(i, rivalryCounts.get(i) + 1);
          }
        }
      }
    }
  }

/**
 * Adds the rival teams of every team in the conference passed from the findRivalries method and records its appearance amount
 * If it was already added, the count recording how many times it appears increases by 1
 *
 * Precondition: chosenRivalries and rivalryCounts are currently empty
 * Postcondition: Each count in rivalryCounts is representative of the location in chosenRivalries at the corresponding index
 * 
 * @param   String conferences: The conference to search for rivalries in
 */
  public void findRivalriesByConference(String conferences) {
    for (int i = 0; i < conference.size(); i++) {
      String currentConferences = conference.get(i);
      if (currentConferences.equals(conferences)) {
        String[] currentRivals = rivalries.get(i).split(",");
        for (String rival : currentRivals) {
          if (chosenRivalries.contains(rival)) {
            int index = chosenRivalries.indexOf(rival);
            rivalryCounts.set(index, rivalryCounts.get(index) + 1);
          } else {
            chosenRivalries.add(rival);
            rivalryCounts.add(1);
          }
        }
    
      }
    }
    
  }

/**
 * Adds the rival teams of the chosen team passed from the findRivalries method and records its appearance amount
 * If it was already added, the count recording how many times it appears increases by 1
 *
 * Precondition: chosenRivalries and rivalryCounts are currently empty
 * Postcondition: Each count in rivalryCounts is representative of the location in chosenRivalries at the corresponding index
 * 
 * @param   String conferences: The conference to search for rivalries in
 */
  public void findRivalriesByTeam(String teamName){
    int foundIndex = 0;
    for(int i = 0; i < teams.size(); i++){
      if(teams.get(i).equals(teamName)){
        foundIndex = i;
      }
    }
        
        String currentRivals = rivalries.get(foundIndex);
        String[] rivalsArray = currentRivals.split(",");
        
        for (int j = 0; j < rivalsArray.length; j++) {
          chosenRivalries.add(rivalsArray[j]);
          rivalryCounts.add(1);
        } 
  }

/**
 * Student Developed; Adds the average score of every requested team together and divides it by the number of teams before returning it
 *
 * Precondition: category, conference, and teamName are != null and are expected arguments
 * Postcondition: The chosenRivalries and rivalryCounts instance variables now have values within them.
 * 
 * @param		String category: The category of teams that should be parsed through (ex. NBA checks all teams)
 * @param   String conference: The conference of teams to parse through (is N/A if category isn't conference)
 * @param   String teamName: The name of the team to be parsed through (is N/A if category isn't team)
 *
 * @return	An integer containing the average scores between all of the chosent team 
 */
  public int findAverageScoresAverage(String category, String conference, String team){
    double sum = 0.0;
    if(category.equals("NBA")){
      for(int i = 0; i < teams.size(); i++){
        sum += averageScores.get(i);
      }
      sum = sum / teams.size();
      return (int) sum;
    } else if(category.equals("Conference")){
      ArrayList<String> teamsInConference = new ArrayList<String>();
      for(int j = 0; j < teams.size(); j++){
        boolean isInConference = findConference(teams.get(j), conference);
        if(isInConference == true){
        teamsInConference.add(teams.get(j));
    }
   }
      for(int out = 0; out < teamsInConference.size(); out++){
        for(int in = 0; in < teams.size(); in++){
          if(teams.get(in).equals(teamsInConference.get(out))){
            sum += averageScores.get(in);
          }
        }
      }
    sum = sum / teamsInConference.size();
    return (int) sum;
  } else {
    for(int l = 0; l < teams.size(); l++){
      if(teams.get(l).equals(team)){
        return (int) averageScores.get(l).doubleValue();
      }
    }
  }
  return 0;
 }

/**
 * Student Developed; Predicts and simulates what result a match between two chosen teams would have and possible fluctuations
 * between the prediction and what could happen in real life
 *
 * Precondition: team1 and team2 are valid teams in the NBA
 * Postcondition: A String containing the scoreboard and the fluctuation is returned
 * 
 * @param		String team1: The first team to be simulated with
 * @param   String team2: The second team to be simulated with
 
 * @return	A String containing the score for both teams and the point fluctuation
 */
  public String simulate(String team1, String team2){
    String lowerTeam = "";
    String higherTeam = "";
    double lowerScore = 0.0;
    double higherScore = 0.0;
    String temp1 = "";
    String temp2 = "";
    int location1 = 0;
    int location2 = 0;
    for(int i = 0; i < teams.size(); i++){
      if(teams.get(i).equals(team1)){
        temp1 = teams.get(i);
        location1 = i;
      }
      if(teams.get(i).equals(team2)){
        temp2 = teams.get(i);
        location2 = i;
      }
    }
    if(averageScores.get(location1) > averageScores.get(location2)){
      lowerTeam = temp2;
      higherTeam = temp1;
      lowerScore = averageScores.get(location2).doubleValue();
      higherScore = averageScores.get(location1).doubleValue();
    } else {
      lowerTeam = temp1;
      higherTeam = temp2;
      lowerScore = averageScores.get(location1).doubleValue();
      higherScore = averageScores.get(location2).doubleValue();
    }
    
    double percentDifference = ((higherScore - lowerScore) / lowerScore) * 100;
    higherScore = (int) higherScore * (1.0 + (percentDifference / 100));
    lowerScore = (int) lowerScore * (1.0 + (percentDifference / 100));
    double pointFluctuation = ((higherScore + lowerScore) / 100) * 5;
    higherScore = cleanDouble(higherScore);
    lowerScore = cleanDouble(lowerScore);
    pointFluctuation = cleanDouble(pointFluctuation);
    if(lowerTeam.equals(team1)){
      return "Average predicted outcome of a match between " + team1 + " and " + team2 + ": \n" + team1 + " " + lowerScore + " - " + higherScore + " " + team2 + "\n" + "Potential point fluctuation for both teams: 0 - " + pointFluctuation;
    } 
    return "Average predicted outcome of a match between " + team1 + " and " + team2 + ": \n" + team1 + " " + higherScore + " - " + lowerScore + " " + team2 + "\n" + "Potential point fluctuation for both teams: 0 - " + pointFluctuation;
  }

/**
 * Student Developed; Compiles the contents of the chosenLocations and locationCounts lists and places each corresponding pair of elements
 * together to be returned as a count of all locations and its amount of mentions
 *
 * Precondition: chosenLocations and locationCounts are filled with the same amount of non-null elements
 * Postcondition: The two lists are unchanged, and each element at its index is paired with its corresponding element in 
 * the other list
 * 
 * @param		String category: The category of teams that should be parsed through (ex. NBA checks all teams)
 * @param   String conference: The conference of teams to parse through (is N/A if category isn't conference)
 * @param   String teamName: The name of the team to be parsed through (is N/A if category isn't team)
 *
 * @return	A String listing every location and its respective number of mentions
 */
  public String locationsToString(String category, String conference, String teamName){
    findLocations(category, conference, teamName);
    String result = "";
    for(int i = 0; i < chosenLocations.size(); i++){
      if(category.equals("Team")){
        result += chosenLocations.get(i);
      } else {
        result += chosenLocations.get(i) + ": " + locationCounts.get(i) + " team(s) share this location." + "\n";
      }
    }
    return result;
  }

/**
 * Student Developed; Compiles the contents of the chosenRivalries and rivalryCounts lists and places each corresponding pair of elements
 * together to be returned as a count of all rivalries and its amount of mentions
 *
 * Precondition: chosenRivalries and rivalryCounts are filled with the same amount of non-null elements
 * Postcondition: The two lists are unchanged, and each element at its index is paired with its corresponding element in 
 * the other list
 * 
 * @param		String category: The category of teams that should be parsed through (ex. NBA checks all teams)
 * @param   String conference: The conference of teams to parse through (is N/A if category isn't conference)
 * @param   String teamName: The name of the team to be parsed through (is N/A if category isn't team)
 *
 * @return	A String listing every team and its respective number of rivalry mentions
 */
  public String rivalriesToString(String category, String conference, String teamName){
    findRivalries(category, conference, teamName);
    String result = "";
    for(int i = 0; i < chosenRivalries.size(); i++){
        result += chosenRivalries.get(i) + ": " + rivalryCounts.get(i) + " rivalries within this team/conference." + "\n";
    }
    return result;
  }

/**
 * Student Developed; Takes a given value and edits the value to end in 0.0 in order to prevent really long decimal values
 *
 * Precondition: value is a double with a decimal value greater than 0.0 
 * Postcondition: value is returned with a decimal value of 0.0
 * 
 * @param		double value: The number to be cleaned and returned
 * @return	A double based off of value that ends with .0
 */
  public double cleanDouble(double value){
    double negative = value - (value * 2);
    int intForm = (int) value;
    double subtrahend = negative + intForm;
    return value + subtrahend;
  }
}
