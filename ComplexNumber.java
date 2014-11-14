
/**
 * This is a class that represents a complex number with real and imaginary parts
 * 
 * @author (ananya) 
 */
public class ComplexNumber
{
    // instance variables - replace the example below with your own
    double real_part;
    double imaginary_part;

    /**
     * Constructor for objects of class ComplexNumber
     */
    public ComplexNumber()
    {
       real_part = 0;
       imaginary_part = 0;
    }
     public ComplexNumber(double a, double b)
    {
       real_part = a;
       imaginary_part = b;
    }

    /**
     * @param  c   the complex number to add to this complex number
     * @return     the sum of the complex numbers 
     */
    public ComplexNumber add(ComplexNumber c)
    {
        double a = real_part + c.real_part;
        double b = imaginary_part + c.imaginary_part;
        return new ComplexNumber(a,b);
    }
    
    /**
     * @param  c   the complex number to multiply with this complex number
     * @return     the product of the complex numbers 
     */
    public ComplexNumber multiply(ComplexNumber c)
    {
        double real = (real_part * c.real_part) + (imaginary_part * c.imaginary_part * -1);
        double imaginary = (real_part * c.imaginary_part) + (c.real_part * imaginary_part);
        return new ComplexNumber(real,imaginary);
    }
    
    /**
     * @param  c   the complex number to be returned as a string
     * @return     none
     */
    public String toString()
    {
        if(imaginary_part < 0){
            return "This complex number is " + real_part  + imaginary_part + "i";
        }
        else{
            return "This complex number is " + real_part + "+" + imaginary_part + "i";
        }
    }
}
