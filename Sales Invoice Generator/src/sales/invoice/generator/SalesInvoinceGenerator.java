/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package sales.invoice.generator;

/**
 *
 * @author note book
 */
import java.util.Scanner;
public class SalesInvoinceGenerator {
    double Donut = 7.5;
    double Chips = 1;
    double Soda = 3;
    String name;
    static int numberofDonuts;
    static int numberofChips;
    static int numberofSoda;
    double DonutTotal = Donut * numberofDonuts;
    double ChipsTotal = Chips * numberofChips;
    double SodaTotal = Soda * numberofSoda;
    double finalTotal = DonutTotal + ChipsTotal + SodaTotal;
    {
    }   

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Please enter the item name");
        String a= sc.nextLine();
        System.out.println("How many Do you want");
        int s = input.nextInt();

}

}