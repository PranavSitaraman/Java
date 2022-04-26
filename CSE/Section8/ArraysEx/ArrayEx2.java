/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Section8.ArraysEx;
public class ArrayEx2
{
    public static void main(String args[])
    {
        String[] browsers = new String[4];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        System.out.println("The number of browsers is " + browsers.length + ". The browsers are:");
        for (String browser : browsers)
        {
            System.out.println(browser);
        }
    }
}
