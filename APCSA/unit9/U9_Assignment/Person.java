package unit9.U9_Assignment;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int throwDisc(int pow) {
        if(pow > 10) pow = 10;
        else if(pow < 1) pow = 1;
        
        return pow * 2;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
}
