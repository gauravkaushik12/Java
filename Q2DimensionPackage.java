/*Create  a  class  TwoDim  which  contains  private  members  as  x  and  y
coordinates  in package P1. Define the default constructor, 
a parameterized constructor and override toString() method to display the co-ordinates.
Now reuse this class and in package P2 create another class ThreeDim,
adding a new dimension as z as its private member. Define the constructors for 
the subclass and override toString() method in the subclass also. 
Write appropriate methods to show dynamic method dispatch. The main() function 
should be in a package P.*/

// Creating P1 package.

package P1;
public class TwoDim {
    private int x;
    private int y;
    public TwoDim(int a,int b){
        this.x=a;
        this.y=b;
    }
    public String toString(){
        return "a : "+this.x+" b : "+this.y;
    }
}
package P2;
import P1.TwoDim;
public class ThreeDim extends TwoDim {
    private int z;
    public ThreeDim(int a,int b,int c){
        super(a,b);
        this.z=c;
    }
    public String toString(){
        return super.toString()+" z : "+z;
    }
}
package P;
import P1.TwoDim;
import P2.ThreeDim;
public class Main {
    public static void main(String[] args) {
        TwoDim base = new TwoDim(12,34);
        System.out.println(base);
        base = new ThreeDim(12,34,56); //subclass
        System.out.println(base);  //dynamic dispatch
    }
}
