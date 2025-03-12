import java.util.ArrayList;
public class NLPRunner {
  public static void main(String[] args) {
    
ArrayList<String> teams = FileReader.toStringList("teams.txt");
ArrayList<String> locations = FileReader.toStringList("locations.txt");
ArrayList<String> rivalries = FileReader.toStringList("rivalries.txt");
ArrayList<String> conferences = FileReader.toStringList("conferences.txt");
ArrayList<Double> averageScores = FileReader.toDoubleList("averagescore.txt");
    
NBAnalyzer nba = new NBAnalyzer(teams, locations, rivalries, conferences, averageScores);
    
nba.prompt();

    
    
    
    
  }
}
