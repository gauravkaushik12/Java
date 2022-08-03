/*Design a class Complex having a real part (x) and an imaginary part (y).
Provide methods to perform the following on complex numbers:
a)Add two complex numbers.
b)Multiply two complex numbers.
c)toString() method to display complex numbers in the form: x + i y  */

public class Q1ComplexNo{
    public static void main(String[] args) {
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(4,5);
        System.out.println("Complex Number 1: " + c1);
        System.out.println("Complex Number 2: " + c2);
        System.out.println("Sum of Complex Numbers: " + c1.add(c2));
        System.out.println("Product of Complex Numbers: " + c1.multiply(c2));
    }
}

class Complex{
    private int x,y;
    public Complex(int real, int imaginary) {
        x = real;
        y = imaginary;
    }

    public Complex add(Complex first){
        return new Complex(this.x + first.x, y + first.y);
    }
    
    public Complex multiply(Complex first){
        return new Complex(this.x * first.x-this.y* first.y, this.x*first.y+ this.y*first.x);
    }
    
    public String toString(){
        return x + " + i" + y;
    }
}