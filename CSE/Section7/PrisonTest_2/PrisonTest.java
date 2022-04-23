package Section7.PrisonTest_2;

public class PrisonTest
{
	public static void main(String[] args)
	{
		Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
		Prisoner twitch = new Prisoner("Twitch", 1.73, 3);
		bubba.think();
		twitch.think();
		System.out.println(bubba == twitch);
		bubba = new Prisoner("Bubba", 2.08, 4);
		twitch = new Prisoner("Bubba", 2.08, 4);
		System.out.println(bubba == twitch);
		bubba.name = "name";
		twitch.name = "name";
		System.out.println(bubba.name == twitch.name);
		bubba.name = new String("name");
		twitch.name = new String("name");
		System.out.println(bubba.name == twitch.name);
		bubba = twitch;
		System.out.println(bubba == twitch);
	}
}
