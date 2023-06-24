public class FreeFormAsciiArt {
    public static void main(String[] args){
        //all these methods together prints a tree!
        TopT();
        MiddleT();
        BaseT();
    }


    public static void TopT() {
        //the first for loop is incharge of the amount of rows in the first part of the tree.
        for(int row = 1; row <= 5; row++) {
            // the secod for loop is there to print the amount of spaces before the x's start. for this step it is importand to lay out the table
                //line  Spaces  X's
                //  1     4      1
                //  2     3      3
                //  3     2      5
                //  4     1      7
                //  5     0      9

                //equation for spaces = -1*row+5
            for(int space = 1; space <= (-1*row+5); space++) {
                System.out.print(" ");
            }
            //this for loop prints the amount of X's that you need to make the tree
            //refer to the table but the euation for the X's is 2*row-1
            for(int x = 1; x<= (2*row-1); x++){
                System.out.print("X");
            }
            //this println goes at the end of all the nested for loops to compleate the line and make sure that the next time throught the 1st for statment is on a new line
            System.out.println();
        }
    }
    
    //this method has a lot of similarties from the last one
    public static void MiddleT(){
        for(int row = 1; row <= 3; row++){
            // line Space  X's
            //  1     2    5
            //  2     1    7
            //  3     0    9
            
            //equation: Space = -1*row+3
            for(int space = 1; space <= (-1*row+3); space++){
                System.out.print(" ");
            }
            //equation: X's = 2*row+3
            for(int x = 1; x<=(2*row+3);x++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
    // this method is here to print the trunk of the tree
    public static void BaseT() {
        //the first for statment is there to create the amount of rows that i wanted
        for(int row = 1; row <= 2; row++){
            // thes nested for statment prints the right about of spaces that i wanted
            for(int space = 1; space <= 3; space++){
                System.out.print(" ");
            }
            //this print statment prints the actual pattern of the trunk
            System.out.print("| |");
            System.out.println();
        }
    }
}