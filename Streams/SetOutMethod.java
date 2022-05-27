/**
 * SetOutMethod
 */
import java.io.*;
public class SetOutMethod {

    public static void main(String[] args) throws Exception { 
        // Create a PrintStream for file stdout.txt 
        File outFile = new File("stdout.txt"); 
        //PrintStream ps = new PrintStream(new FileOutputStream(outFile)); 
        PrintStream ps = new PrintStream(new FileOutputStream(outFile)); 
        //Print a message on console 
        System.out.println("Messages will be redirected to " 
                + outFile.getCanonicalPath()); 
                
        
        // Set the standard out to the file 
        System.setOut(ps); /*  w w w  .  d   e  m   o 2   s  . c o  m  */
        // The following messages will be sent to the stdout.txt file 
        System.out.println("Hello world!"); 
        System.out.println("Java I/O is cool!"); 
    } 
}