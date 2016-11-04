
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pawel
 */
public class InputOutput {

    public InputOutput() throws IOException {
    
      // IO stream
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //
        String input, reinBottom, reinCorners, sealTop;
        int width, length, height, color, grade, qty;
        
         // Input/Output (I/O)
         //1 width
        System.out.print("\n Enter width of the box: ");
        input = br.readLine();
        width = Integer.valueOf(input).intValue();
        
        //2 length
        System.out.print("\n Enter length of the box: ");
        input = br.readLine();
        length = Integer.valueOf(input).intValue();
        
        //3 height
        System.out.print("\n Enter height of the box: ");
        input = br.readLine();
        height = Integer.valueOf(input).intValue();
        
        //4  grade
        System.out.println("\n Enter grade: ");
        input = br.readLine();
        grade = Integer.valueOf(input).intValue();
        
        //5 color
        System.out.println("\n How many colors whould you like to have, please enter value from 0 to 2: ");
        input = br.readLine();
        color = Integer.valueOf(input).intValue();
        
        //6 reinforced bottom
        System.out.println("\n Would you like to have reinforced bottom? (Please answer: yes/no):  ");
        reinBottom = br.readLine();
       // input = br.readLine();
       // reinBottom = Boolean.valueOf(input);
        
        //7 reinforced corners
        System.out.println("\n Would you like to have reinforced corners? (Please answer: yes/no): ");
        reinCorners = br.readLine();
        
        //8 sealable tops
        System.out.println("\n Would you like to have sealable top? (Please answer: yes/no): ");
        sealTop = br.readLine();
        
        //9 quantity
        System.out.print("\n Product quantity: ");
        input = br.readLine();
        qty = Integer.valueOf(input).intValue();
        
        //objects
        Box flexBox = new Box(width, length, height, grade, color, reinBottom, reinCorners, sealTop);
        Type1 flexBoxType1 = new Type1(width, length, height, grade, qty, sealTop);
        
        
        //Output
        if(grade >= 1 && grade < 4 && color == 0) {
            flexBoxType1.totalBoxArea();
            flexBoxType1.cost();
        }
    }
    
}
