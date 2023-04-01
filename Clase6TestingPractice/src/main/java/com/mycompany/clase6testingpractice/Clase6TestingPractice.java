
package com.mycompany.clase6testingpractice;
import java.util.Scanner;

public class Clase6TestingPractice {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many toes do you have?");
        try {
            int toes = scanner.nextInt();
            System.out.println("You have " +toes +" toes");
        } catch (Exception e){
            System.out.println("thine input is incorrect");
        }
    }
}
