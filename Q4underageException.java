/*Create an exception subclass UnderAge, which prints “Under Age” along with the 
age value when an object of UnderAge class is printed in the catch statement.
Write a class exceptionDemo in which the method test() throws UnderAge exception
if the variable age passed to it as argument is less than 18. Write main()method 
also to show working of the program.  */
import java.util.Scanner;
class UnderAge extends Exception{
    int a;
    UnderAge(int a){
        this.a=a;
    }
    public String toString(){
        return "UNDER AGE : "+a;
    }
}

public class Q4underageException {
    public static void test(int a)throws UnderAge{
        if(a<18){
            throw new UnderAge(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age : ");
        int a = sc.nextInt();
        try{
            test(a);
        }catch (UnderAge e){
            System.out.println(e);
        }
    }
}
