/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsemana3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author elkin
 */
public class Menu {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        //ciclo principal del menu
        while (true) {
            System.out.println("----------Bienvenido---------");
            System.out.println("1.Palabra al reves");
            System.out.println("2.Numero perfecto");
            System.out.println("3.Primos");
            System.out.println("4.Votaciones");
            System.out.println("5.Salir");
            System.out.print("Ingrese opcion: ");
            int opcion = lea.nextInt();
            lea.nextLine();
            // Dependiendo la opcion
            switch (opcion) {
                //Opcion 1 palabra al reves          
                case 1:
                    int i = 1;
                    int cantidadmax = 0;
                    System.out.print("Ingrese cantidad de plabras: ");
                    int palabras = lea.nextInt();
                    lea.nextLine();
                    while (i >= palabras) {
                        System.out.print("Ingrese palabra que desea imprimir al reves: ");
                        String palabra = lea.nextLine();
                        int cantidad = palabra.length();
                        int j = palabra.length() - 1;
                        System.out.print("Palabra al reves: ");
                        if (cantidad > cantidadmax) {
                            cantidadmax = cantidad;
                        }

                        while (j >= 0) {
                            char letra = palabra.charAt(j);
                            j--;
                        }

                        System.out.println("");
                        StringBuilder modificar = new StringBuilder();
                        int k = palabra.length() - 1;
                        while (k >= 0) {
                            modificar.append(palabra.charAt(k));
                            k--;
                        }
                        String alreves = modificar.toString();
                        System.out.println("La palabra mas larga: " + cantidadmax);

                        if (palabra.equals(alreves)) {
                            System.out.println("La palabra NO es un palíndromo.");
                        } else {
                            System.out.println("La palabra SÍ es un palíndromo.");
                        }

                        break;
                    }
                    i++;
                //Opcion 2 numero perfecto
                case 2:

                    System.out.println("Ingrese un numero: ");
                    int num = lea.nextInt();
                    int sumadivisores = 0;
                    for (int divisor = 1; divisor < num; divisor++) {
                        if (num % divisor == 0) {
                         sumadivisores += divisor;
                        }
                    }
                        if(sumadivisores==num){
                        System.out.println("El numero ingresado es perfecto");
                           
                        } else {
                            System.out.println("El numero ingresado no es perfecto");
                            
                       }break;
                    
                    

//primos
                case 3:

                    Random rnd = new Random();
                    int numero = rnd.nextInt(100) + 1;
                    System.out.println("Número generado: " + numero);

                    boolean primo = numero > 1;
                    for (int p = 2; p < numero && primo; p++) {
                        if (numero % p == 0) {
                            primo = false;
                        }
                    }

                    if (primo==true) {
                        System.out.println(numero+" es primo porque solo tiene dos divisores.");
                        System.out.println("Divisores de " + numero + " son: 1 y " + numero);
                    } else {
                        System.out.println(numero + " NO es primo.");
                    }
                    break;
               //
                case 4:
                    System.out.println("Ingrese cuantos votantes hay en el pais: ");
                    int votantes=lea.nextInt();
                     
            }
            
        }

    }
}
