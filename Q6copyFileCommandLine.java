/*Write a program that copies content of one file to another. Pass the names of 
the files through command-line arguments.  */

import java.io.*;
public class Q6copyFileCommandLine {
    public static void main(String[] args) {      
        int i;
        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])){
                do{
                    i= fin.read();
                    System.out.print((char)i);
                    fout.write(i);
                }while(i != -1);
        } catch(IOException e){
            System.out.println("exception caught : "+e);
        }
    }
}
