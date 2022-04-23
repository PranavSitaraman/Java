/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Section4.StringsEx;
import java.util.*;
import java.io.*;
public class NameMaker
{    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        String fullName = new String(firstName);
        fullName = fullName.concat(" ");
        fullName = fullName.concat(middleName);
        fullName = fullName.concat(" ");
        fullName = fullName.concat(lastName);
        System.out.println(fullName);
    }   
}