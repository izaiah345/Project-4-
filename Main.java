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
// Thank is a return type that gives back a thank you.
 thank(name);

 }


  //This concpecpt makes sure that the person gets their couple 
 static int getLove(int birthMonth, int currentYear)
 {
 int love = birthMonth - currentYear;
 return love;
 }
  
// This returns my thank you from within my code
   static String thank(String name){
   String you = "Thank you for trying out my love guesser app! " + name;
   return you; 
   
  } 
}