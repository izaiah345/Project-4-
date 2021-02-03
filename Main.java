import java.util.Scanner;

 public class Main {
 public static void main(String[] args){ 
 

 
 Scanner scan = new Scanner(System.in);

// this takes in the costmers information and pass it through the code.
  
  System.out.println("What is your name");
  String name = scan.next();
  System.out.println("What year is it");
  int currentYear = scan.nextInt();
  System.out.println("What is your birth month?");
  int birthYear = scan.nextInt();
 
  int age = getLove(birthYear, currentYear);
  
  System.out.println("You enounterd true love in year was I right?" + age);
  
 thank(name);

 }


  //This concpecpt makes sure that the person gets their couple 
 static int getLove(int birthMonth, int currentYear)
 {
 int love = birthMonth - currentYear;
 return love;
 }
  

   static String thank(String name){
   String you = "Thank you for trying out my love guesser app! " + name;
   return you; 
   
  } 
}