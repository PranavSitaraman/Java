
package Section3;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        //byte val = 128;
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short a = 128;
        //val = (byte) a;
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again

        byte newval = 127;
        newval++;
        System.out.println(newval);
        newval++;
        System.out.println(newval);
        
        
    }    
}
