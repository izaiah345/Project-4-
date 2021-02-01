import java.util.Scanner;

class Main {
 public static void main(String[] args) 
 {
  Scanner scan = new Scanner(System.in);
// this takes in the costmers information and pass it through the code.
  System.out.println("What is your name");
  String name = scan.next();
  System.out.println("What year is it");
  int currentYear = scan.nextInt();
  System.out.println("What is your birth month?");
  int birthYear = scan.nextInt();
 
  int age = getAge(birthYear, currentYear);
// this takes a qoute and puts into an output 
  System.out.println(greeting(name));
  System.out.println("You enounterd true love in year was I right?" + age);
  
  

 }


  //This concpecpt makes sure that the person gets their couple 
 
}