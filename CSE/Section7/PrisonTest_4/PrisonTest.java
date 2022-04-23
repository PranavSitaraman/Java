package Section7.PrisonTest_4;

public class PrisonTest {
    public static void main(String[] args){
        Prisoner p01 = new Prisoner("Bubba", 2.08, 4);
        Prisoner p02 = new Prisoner();
        p01.print();
        p02.print(true);
    }
}
