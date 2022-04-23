/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.BreakContinueDemo;


public class UsingBreakWhile {
    public static void main(String[] args) {
        
        int i=0;
        while(i < 10)
            if (i == 4) {
                break;
            }
            System.out.println(i + "\t");
            i++;
        }

    }
    

