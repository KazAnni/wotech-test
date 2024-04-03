
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suite, rain coat
    
  String season = "spring";

  if (season.equals("winter")) {
    System.out.println("Wear a warm jacket!");
  }
  else if (season.equals("spring")) {
    System.out.println("Wear a T-shirt!");
  }
  else if (season.equals("summer")) {
    System.out.println("Wear a swimming suite!");
  }
  else if (season.equals("autumn")) {
    System.out.println("Wear a rain coat!");
  }
    else {
      System.out.println("I do not reconignize this season");
    }
  
double temp = 15.0;
  
  
  if(temp <= 5) {
   System.out.println("wear super warm clothes");  
      } 
else if(temp <= 15) {
    System.out.println("wear warm clothes");
      } 
else if(temp <= 30) {
    System.out.println("wear light clothes");  
      } 
else  {
    System.out.println("wear super hot weather clothes");
      }
  }
