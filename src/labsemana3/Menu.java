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
        int vecesopcion1=0;
        int vecesopcion2=0;
        int vecesopcion3=0;
        int vecesopcion4=0;
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
                  vecesopcion1++;  
                   System.out.print("Ingrese cantidad de palabras: ");
        int totalPalabras = lea.nextInt();
        lea.nextLine();  

        int max = 0;
        String largo = "";
        int cuentalarga = 0;

        int rep = 1;
        while (rep <= totalPalabras) {
            System.out.print("Ingrese palabra " + rep + ": ");
            String palabra = lea.nextLine();
            int len = palabra.length();

           
            System.out.print("Palabra al revés: ");
            int j = len - 1;
            while (j >= 0) {
                System.out.print(palabra.charAt(j));
                j--;
            }
            System.out.println();

            
            if (len > max) {
                max = len;
                largo = palabra;
                cuentalarga = 1;
            } else if (len == max) {
        cuentalarga++;
            }

            rep++;
        }

        System.out.print("La palabra más larga tiene longitud " + max + ": " + largo);
        if (cuentalarga > 1) {
            System.out.print(" (y hubo " + (cuentalarga - 1) + " otra(s) de igual longitud)");
        }
        System.out.println();

        
        boolean espalin = true;
        int i = 0;
        while (i < max / 2) {
            if (largo.charAt(i) != largo.charAt(max - 1 - i)) {
                espalin = false;
                break;
            }
            i++;
        }

        if (espalin) {
            System.out.println(largo + " SÍ es palíndromo.");
        } else {
            System.out.println(largo+ " NO es palíndromo.");
        }
      break;

                        
                //Opcion 2 numero perfecto
                case 2:
                    vecesopcion2++;  
                    System.out.println("Ingrese un numero: ");
                    int num = lea.nextInt();
                    int sumadivisores = 0;
                    for (int divisor = 1; divisor < num; divisor++) {
                        if (num % divisor == 0) {
                            sumadivisores += divisor;
                        }
                    }
                    if (sumadivisores == num) {
                        System.out.println("El numero ingresado es perfecto");

                    } else {
                        System.out.println("El numero ingresado no es perfecto");

                    }
                    break;

//primos
                case 3:
                      vecesopcion3++;  
                    Random rnd = new Random();
                    int numero = rnd.nextInt(100) + 1;
                    System.out.println("Número generado: " + numero);

                    boolean primo = numero > 1;
                    for (int p = 2; p < numero && primo; p++) {
                        if (numero % p == 0) {
                            primo = false;
                        }
                    }

                    if (primo == true) {
                        System.out.println(numero + " es primo porque solo tiene dos divisores.");
                        System.out.println("Divisores de " + numero + " son: 1 y " + numero);
                    } else {
                        System.out.println(numero + " NO es primo.");
                    }
                    break;
                //
                case 4:
                         vecesopcion4++;  
                    int votosazul = 0;
                    int votosrojos = 0;
                    int votosamarillo = 0;
                    int votosnegro = 0;
                    int votosnulo = 0;
                    int votosvalidos;
                    int mayorvoto=votosazul;
                    String ganador="Azul";
                    
                    
                    System.out.println("Ingrese cuantos votantes hay en el pais: ");
                    int votantes = lea.nextInt();
                    lea.nextLine();
                    int repes = 1;
                    System.out.println("-------Boleta de votos-------");
                    System.out.println("AZUL");
                    System.out.println("ROJO");
                    System.out.println("NEGRO");
                    System.out.println("AMARILLO");

                    while (repes <= votantes) {
                        System.out.println("Numero de votante: " + repes + " ingrese su voto: ");
                        String voto = lea.nextLine();
                        voto = voto.toUpperCase();

                        switch (voto) {
                            case "AZUL":
                                votosazul++;
                                break;
                            case "ROJO":
                                votosrojos++;
                                break;
                            case "AMARILLO":
                                votosamarillo++;
                                break;
                            case "NEGRO":
                                votosnegro++;
                            break;
                            default:
                                votosnulo++;
                                break;
                        }
                        repes++;
                    }
                    int votostotales = votosazul + votosrojos + votosamarillo + votosnegro;
                    votosvalidos = votostotales - votosnulo;
                   

                   

// 
                    if (votosamarillo > mayorvoto) {
                        ganador="Amarillo";
                        mayorvoto=votosamarillo;
                    }
                    if (votosnegro > mayorvoto) {
                        ganador = "Negro";
                        mayorvoto=votosnegro;
                    }
                    if (votosrojos > mayorvoto) {
                        ganador = "Rojo";
                        mayorvoto=votosrojos;
                    }
                    

                    double votacionpromedio = (double)votosvalidos/votantes;
                    if (votacionpromedio >= 0.60) {
                        System.out.println("El ganador es: "+ganador);  
                    }else{
                        System.out.println("Votacion no valida");
                    }
                    
                   break;
                case 5:
                    System.out.println("A ingresado "+vecesopcion1+"veces a la opcion 1"); 
                    System.out.println("A ingresado "+vecesopcion2+"veces a la opcion 2");
            System.out.println("A ingresado "+vecesopcion3+"veces a la opcion 3"); 
                    System.out.println("A ingresado "+vecesopcion4+"veces a la opcion 4");
             break;
            }
      break;
        } 

    }
}
