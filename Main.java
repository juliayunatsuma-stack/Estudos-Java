package org.example;

import javax.print.attribute.standard.Media;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
                 //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         Scanner scanner= new Scanner(System.in);
         int n;
         System.out.println("Escolha um numero?");
         n=scanner.nextInt();
         if (n<0){
             System.out.println("Numero negativo");


         } else if (n==0) {
             System.out.println("Numero é zero");


         } else {
             System.out.println("Numero positivo");

         }


     }
}