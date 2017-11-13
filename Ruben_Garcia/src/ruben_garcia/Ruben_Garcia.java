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
                ejercicio4(sc);
                break;
            case 5:
                ejercicio5(sc);
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
            case 14:
                //ejercicio14(sc);
                break;
            case 15:
                //ejercicio15(sc);
                break;
            case 16:
                //ejercicio16(sc);
                break;
            case 17:
                //ejercicio17(sc);
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
        System.out.println("El orden es:");
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
        System.out.println("El orden es:");
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
            System.out.println("Introduce un numero");
            numeros[i] = sc.nextInt();
        }
        //recorrer array buscando cero
        int ceros=0;
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]==0){
                ceros++;
            }   
        }
        //recorrer array buscando los positivos y negativos
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
        int [] positivos = new int[numPositivo];
        int [] negativos = new int[numNegativo];
        //recorrer array para meter los positivos y negativos en su array
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
        //recorrer array de positivos dar media
        double mediaPositivo = 0;
        for (int i = 0; i < positivos.length; i++) {
            mediaPositivo += positivos[i];
        }
        //recorrer array de negativos dar media   
        double mediaNegativo = 0;
        for (int i = 0; i < negativos.length; i++) {
            mediaNegativo += negativos[i];
        }
        System.out.println("La media de positivos es " + mediaPositivo / numPositivo);
        System.out.println("La media de negativos es " + mediaNegativo / numNegativo);
        System.out.println("Los ceros que hay son " +ceros);
    }

    public static void ejercicio4(Scanner sc) {
        //ejercicio4
        int [] leer = new int [10];
        for (int i=0;i<leer.length;i++){
            System.out.println("Introduce un numero");
            leer[i] = sc.nextInt();
        }
        System.out.println("el orden es:");
        for (int i=0, y=9 ;i<5; i++, y--){
            System.out.println(leer[i]+"\n"+leer[y]);
        }
    }
    
    public static void ejercicio5(Scanner sc) {
        //ejercicio5
        int [] tabla1 = new int [10];
        int [] tabla2 = new int [10];
        for (int i=0; i<tabla1.length;i++){
            System.out.println("Introducir un valor para la tabla1");
            tabla1[i] = sc.nextInt();
        }
        for (int i=0; i<tabla2.length; i++){
            System.out.println("Introducir un valor para la tabla2");
            tabla2[i] =sc.nextInt();
        }
        int [] tabla3 = new int [20];
        int contador=0;
        for (int i=0; i<tabla3.length; i=i+2){
            tabla3[i]=tabla1[contador];
            tabla3[i+1]=tabla2[contador];
            contador++;
        }
        for (int i=0; i<tabla3.length; i++){
            System.out.println(tabla3[i]+"");
        }
    }
}