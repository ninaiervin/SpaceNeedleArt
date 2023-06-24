//Nina Ervin
//redo because i forgot to take user input
//1/18/2023
import java.util.*;
public class AssignedAsciiArt {
    public static void main(String [] args){
        System.out.println("What size space needle would you like to see? ");
        Scanner console = new Scanner(System.in);
        int scalar = console.nextInt();
        //this calls all the methods that make the shape
        Stick(scalar);
        upTriangle(scalar);
        downTriangle(scalar);
        Stick(scalar);
        middle(scalar);
        upTriangle(scalar);
    }

    //this is used to make both the top and the middle part of the space needle
    public static void Stick(int scalar) {
        //the first for loop defines the number of lines that it wants to print out
            // the number is is dedendint on the scalor number
        for(int row = 1; row <= scalar; row++){
            //this for loop puts the number of right spaces needed to aline the center
            for(int space = 1; space <=3*scalar; space++){
                System.out.print(" ");
            }
            //this is the print that actully prints the shape and move to the next line
            System.out.println("||");
        }
    }
    // this method is the one used to make the bottom and the top part of the space needle
    public static void upTriangle(int scalar){
        // the first for loop is there to make the right number of rows
        for(int row = 1;row <= scalar; row++){
            //the second for loop is to put the right number of spaces so that the figure lines up proberly
            for(int space = 1; space <= (-3*row+(3*scalar)); space++){
                System.out.print(" ");
            }
            //this print is to get the outline on the left hand side
            System.out.print ("__/");
            //this for statment is here to get the right number of dots on each line BEFORE THE MIDPOINT    
            for(int dots = 1; dots <= (3*row-3); dots++){
                System.out.print(":");
            }
            //this print statment is to get the middle beam
            System.out.print("||");
            ////this for statment is here to get the right number of dots on each line AFTER THE MIDPOINT 
            for(int dots = 1; dots <= (3*row-3); dots++){
                System.out.print(":");
            }
            //this print is to get the outline on the right hand side
            System.out.print ("\\__");
            System.out.println();
        }
        // this cunch of code is to make the last bar at the bottom of the triangle
        System.out.print("|");
        for(int quotes = 1; quotes <= (scalar*6); quotes++){
            System.out.print("\"");
        }
        System.out.println("|");
    }
    // this method is only used once to be the under part of the disc near the top
    public static void downTriangle(int scalar){
        // this for loop is to make the right about of rows for the shape
        for(int row = 1; row <= scalar; row++){
            //the second for loop is here to get the right number of spaces before each line
            for(int space = 1;space <= (-2+2*row);space++){
                System.out.print(" ");
            }
            //this print is the left hand deatiling
            System.out.print("\\_");
            //this for loop is for the inside pattern
            for(int slash = 1; slash <= (-2*row+((scalar*6)/2+1));slash++){
                System.out.print("/\\");
            }
            //this print is the right hand deatiling
            System.out.println("_/");
        }

    }
    //this method is used once to make up most of the hight
    public static void middle(int scalar){
        //this for loop controls the amount of rows required
        for(int row = 1; row <= (scalar*scalar); row++){
            //this for loop is to create the amount of spaces that is required
            for(int space = 1; space <= (scalar*2+1); space++){
                System.out.print(" ");
            }
            //this for loop repeats twice so that each time it only makes one half of each line. this is because they are compleatly the same on each side
            for(int collom = 1; collom <= 2; collom++){
                System.out.print("|");
                //thid for statment is for printing the % inside each collom
                for(int precent = 1; precent <= (scalar-2); precent++){
                System.out.print("%");
            }
            System.out.print("|");
            }
            //im using an emply println statment because i chose to repeat so that means I need this println outside of the for statement relating to colloms.
            System.out.println();
        }
    }
}
