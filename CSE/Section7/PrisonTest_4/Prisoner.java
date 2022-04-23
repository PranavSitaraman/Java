package Section7.PrisonTest_4;

public class Prisoner
{
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner(String name, double height, int sentence)
    {
 	    this.name = name;
 	    this.height = height;
 	    this.sentence = sentence;
    }
    public Prisoner()
    {
        this("null", 0.0, 0);
    }
    
    //Methods
    public void print()
    {
        print(false);
    }
    public void print(boolean a)
    {
        System.out.println("My name is " + name + ", I am " + height + " meters tall, and my sentence is " + sentence + " years.");
        if (a)
        {
            think();
        }
    }
    public void think()
    {
        System.out.println("I'll have my revenge.");
    }
}