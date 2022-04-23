package Section7.PrisonTest_5;

public class PrisonTest
{
    public static void main(String[] args)
    {
        Cell cell = new Cell("Cell #5", false);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cell);
        bubba.getName();
        bubba.getOpen();
        bubba.display();
        bubba.openDoor();
        bubba.openDoor();
        bubba.openDoor();
    }
}
