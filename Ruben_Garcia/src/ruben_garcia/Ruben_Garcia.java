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
                break;
                case 2:
                ejercicio2(sc);
                break;
            case 3:
                ejercicio3(sc);
                break;
            case 4:
                //ejercicio4(sc);
                break;
            case 5:
                //ejercicio5(sc);
                break;
            case 6:
                //ejercicio6(sc);
                break;
            case 7:
                //ejercicio7(sc);
                break;
            case 8:
                //ejercicio8(sc);
                break;
            case 9:
                //ejercicio9(sc);
                break;
            case 10:
                //ejercicio10(sc);
                break;
            case 11:
                //ejercicio11(sc);
                break;
            case 12:
                //ejercicio12(sc);
                break;
            case 13:
                //ejercicio13(sc);
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
    
    public static void ejercicio1(Scanner sc){
        //ejericio1
        int [] leer = new int [5];
        for (int i=0;i<leer.length;i++){
            System.out.println("Introduce un numero");
            leer[i] = sc.nextInt();
        }
        for (int i=0;i<leer.length;i++)
            System.out.println(leer[i]);
    }
    
    public static void ejercicio2(Scanner sc){
        //ejercicio2
        int [] leer = new int [5];
        for (int i=0;i<leer.length;i++){
            System.out.println("Introduce un numero");
            leer[i] = sc.nextInt();
        }
        for (int i=4;i>=0;i--)
            System.out.println(leer[i]);
    }
    
    public static void ejercicio3(Scanner sc) {
        //ejercicio3
        int numerosleer = 5;
        //delarar arrayde numeros a leer
        int [] numeros = new int[numerosleer];
        //pedir numeros y meterlos en el array
        for (int i=0; i<numeros.length;i++){
            System.out.println("Introduce numero");
            numeros[i] = sc.nextInt();
        }
        //recorrer array buscando cero
        int ceros=0;
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]==0){
                ceros++;
            }
            
        }
        
        //recorrer array buscando los pares e impares
        int numPositivo=0;
        int numNegativo=0;
        for (int i=0;i<numeros.length; i++){
            if (numeros[i]>0){
                numPositivo++;                
            }
            else {
                numNegativo++;
            }
        }
        //declarar array pares e impares
        int [] positivos = new int[numPositivo];
        int [] negativos = new int[numNegativo];
        //recorrer array para meter los pares e impares en su array
        int indicePositivo=0;
        int indiceNegativo=0;
        for (int i=0;i<numeros.length; i++){
            if (numeros[i]>0){
                positivos[indicePositivo]= numeros[i];
                indicePositivo++;                
            }
            else {
                negativos[indiceNegativo]= numeros[i];
                indiceNegativo++;        
            }
        }
        //recorrer array de pares dar media
        double mediaPositivo = 0;
        for (int i = 0; i < positivos.length; i++) {
            mediaPositivo += positivos[i];
        }
        //recorrer array de impares dar media   
        double mediaNegativo = 0;
        for (int i = 0; i < negativos.length; i++) {
            mediaNegativo += negativos[i];
        }
        System.out.println("La media de positivos es " + mediaPositivo / numPositivo);
        System.out.println("La media de negativos es " + mediaNegativo / numNegativo);
        System.out.println("Los ceros que hay son " +ceros);
    }
}
