package Section11.Vigenere;
import java.util.*;
import java.io.*;
public class Vigenere
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input : Plaintext : ");
		String plaintext = in.nextLine();
		System.out.print("Input : Keyword : ");
		String key = in.nextLine().toUpperCase();
		String ciphertext = "";
		for (int i = 0, j = 0; i < plaintext.length(); i++, j++)
		{
			if (plaintext.charAt(i) >= 'A' && plaintext.charAt(i) <= 'Z') ciphertext += (char) ('A' + (plaintext.charAt(i) - 'A' + key.charAt(j % key.length()) - 'A') % 26);
			else if (plaintext.charAt(i) >= 'a' && plaintext.charAt(i) <= 'z') ciphertext += (char) ('a' + (plaintext.charAt(i) - 'a' + key.charAt(j % key.length()) - 'A') % 26);
			else { ciphertext += plaintext.charAt(i); j--; }
		}
		System.out.println("Output : Ciphertext : " + ciphertext);
		System.out.print("Input : Ciphertext : ");
		ciphertext = in.nextLine();
		System.out.print("Input : Keyword : ");
		key = in.nextLine().toUpperCase();
		plaintext = "";
		for (int i = 0, j = 0; i < ciphertext.length(); i++, j++)
		{
			if (ciphertext.charAt(i) >= 'A' && ciphertext.charAt(i) <= 'Z') plaintext += (char) ('A' + (ciphertext.charAt(i) - 'A' - key.charAt(j % key.length()) + 'A' + 26) % 26);
			else if (ciphertext.charAt(i) >= 'a' && ciphertext.charAt(i) <= 'z') plaintext += (char) ('a' + (ciphertext.charAt(i) - 'a' - key.charAt(j % key.length()) + 'A' + 26) % 26);
			else { plaintext += ciphertext.charAt(i); j--; }
		}
		System.out.println("Output : Plaintext : " + plaintext);
	}
}