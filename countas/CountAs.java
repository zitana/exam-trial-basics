import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class CountAs {
  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
    System.out.println(countAs("afile"));
    
  }
  
  public static int countAs(String filename) {
    Path filePath = Paths.get(filename);
    int numberOfA = 0;
    
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        char[] letters = lines.get(i).toCharArray();
        for (int j = 0;  j < letters.length; j++) {
          if (letters[j] == 'a') {
            numberOfA++;
          }
        }
      }
  
    } catch (IOException e) {
      System.out.println("An error happened");
    }
    return numberOfA;
  }
}
