/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
        System.out.println("OPCIONES 1, 2,3,4");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            default:
                System.out.println("opcion no valida");

        }
    }
    
    
    
    public static void ejercicio1(Scanner sc){     
      //codigo ejercicio 1
        int num=0;
        int num2=0;
        System.out.println("Introducir primer numero");
        num = sc.nextInt();
        System.out.println("Introducir primer numero");
        num2 = sc.nextInt();
    }

    public static void ejercicio2(Scanner sc){
        //codigo ejercicio 2
    }
    
}
    
