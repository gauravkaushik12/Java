/*Write a program to implement stack. Use exception handling to manage underflow
and overflow conditions.  */

public class Q5StackUnderflowOverflow {
    private int stack[] = new int[10];                  
    private   int topStackOf;
    Q5StackUnderflowOverflow(){
        topStackOf = -1;
    }
    public void push(int item) throws MyException {
        if(topStackOf==9){
            throw new MyException(topStackOf);
        }
        else{
            stack[++topStackOf]=item;
        }
    }
    public int pop() throws MyException{
        if(topStackOf<0){
            throw new MyException(topStackOf);
        }
        else{
            return stack[topStackOf--];
        }
    }
  
    public static void main(String[] args) {
        Q5StackUnderflowOverflow stk1 = new Q5StackUnderflowOverflow();
            try {
                stk1.push(90);
                stk1.pop();
                stk1.pop();
            }
            catch (MyException e){
                System.out.println(e);
            }
        }
}
  
class MyException extends Exception{
    int a;
    MyException(int c){
        a=c;
    }
    public String toString(){
        if(a>=9){
            return "OVERFLOW";
        }
        else{
            return "UNDERFLOW";
        }
    }
}
  