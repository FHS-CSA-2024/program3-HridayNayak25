//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner;
public class Program3{
    public static void main(String[] args){
        // make a scanner
        Scanner myScanner = new Scanner(System.in);
        
    
        
        // create my variables
        int length = 0;
        int width = 0;
        int area= 0;
        int perimeter = 0;
     
        //as for user input
    
        
        //Get input
        System.out.println("Length: ");
        length = myScanner.nextInt();
        System.out.println("Width: ");
        width = myScanner.nextInt();
        
        
        //calculate
        perimeter = (2*(length+width));
        area = (length*width);
        //output
        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);
    }
}//This imports the console scanner that reads user input

//Your code here:




//Paste console output below:
/*


*/
