/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruben_garcia;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Ruben_Garcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicios de 1-17");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
    }
    
}
    public static void ejercicio1(Scanner sc){
        //ejericio1
        int [] leer = new int [5];
        for (int i=0;i<leer.length;i++){
            System.out.println("Introduce un numero");
            leer[i] = sc.nextInt();
            
        }
        System.out.println(leer);
    }
}
