
import java.util.Scanner;


public class Guessnumber {
public static void main(String [] args){
Scanner input = new Scanner(System.in);
    
    
int number = (int)(Math.random() * 101);

System.out.println("Guess number is beetwen 0 - 100");

int answer = -1;
while (answer != number) {
System.out.println("Enter your guess number");
answer = input.nextInt();

if  (answer == number)
    System.out.println("Yes you got right number! It is " + number);
    
else if(answer > number) 
    System.out.println("Your answer is too high, try again!");
    
else 
    System.out.println("Your answer is too low, try again!");
}    //End of loop
}
}
