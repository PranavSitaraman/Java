package Section5.ConditionalDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ChainedIf {

    public static void main(String args[]) {
        double income = 30000, tax;
        if (income <= 15000) {
            tax = 0;

        } else if (income <= 25000) {
            tax = 0.05 * (income - 15000);

        } else {
            tax = 0.05 * (income - (25000 - 15000));
            tax += 0.10 * (income - 25000);

        }
    }
}


