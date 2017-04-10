import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
    List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(everySecondElement(listOfIntegers));
    
  }
  
  public static List<Integer> everySecondElement (List<Integer> originalList) {
    List <Integer> secondList = new List<>();
    
    for (int i = 1; i < originalList.size(); i +=2 ) {
      secondList.add(originalList.get(i));
    }
    return secondList;
  }
  
  
}
