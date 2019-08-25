import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Starting Program...\nEnter in a letter or word.");

    //What we are searching for
    Scanner scan = new Scanner(System.in);
    String search = scan.next();
    int counter = 0;
    //An array of results for what we're searching for
    String[] result = (wordFinder(search));
    
    //Get the result length and then see what it says.
    for(int i = 0; i < result.length; i++){
      if(result[i] != null){
          System.out.println(result[i]);
          counter++;
        }
      else
        {
          //Continue over if the spot is empty
          continue;
        }         
    }
    System.out.println("================\nEnd of search.\nReturned " 
    + counter + " result(s).\n================");
  }

  static String[] wordFinder(String search){
    //Our list of words
    String[] words = {"Hello1", "Hi", "Yellow", "Gold", "Switch", "Controller", "Hello2", "Heck"};

    System.out.println("Searching for " + search + "\n");
    //What we're going to return
    String[] returns = new String[words.length];
    int i = 0;
    //Enhanced for loop, gotta check it!
    for(String a : words)
    {
      if(a.contains(search)){
        returns[i] = a; 
      }   
      i++;
    }
    //Return the array
    return returns;
  }
}