/*Write  a  program  to  read  a  file  and  display  only  those  lines  that  
have  the  first  two characters as '//' (Use try with resources).  */

import java.io.*;
public class Q7FileHandling {
    public static void main(String[] args) {
        try(FileReader fl = new FileReader("prac.txt"); BufferedReader br = new BufferedReader(fl)){
            String str;
            do{
               str=br.readLine();
               if(str != null && str.length()>1) {
                   if (str.charAt(0) == '/' && str.charAt(1) == '/')
                   System.out.println(str);
               }
            }while(str != null);
        }catch (IOException e){
            System.out.println("caught exception "+e);
        }
    }
}
