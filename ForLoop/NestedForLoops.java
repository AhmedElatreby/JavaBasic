package ForLoop;

public class NestedForLoops 
{
    public static void main(String[] args) 
    {
        // normal for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Java is fun!");
        } 
        System.out.println("______________ For loop Array ____________________");
        // for loop to print array
        String[] colors = {"Red","Blue","Green"};
        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);            
        }
        System.out.println("___________ 2D Array _______________________");
        // 2D array
        String[][] moreColors = {{"Red","Blue","Green"},
                                {"Black","White", "Orang"}};
                                for (int row = 0; row < 2; row++) {
                                    for (int column = 0; column < 3; column++) {
                                        System.out.println(moreColors[row][column]);
                                        
                                    }                                    
                                }
        System.out.println("___________ Nested For Loop_______________________");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.println("Row: " + row + ", column: " + column);
                
            }
            
        }


    }    
}
