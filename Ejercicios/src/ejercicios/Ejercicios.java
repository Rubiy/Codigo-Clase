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
        System.out.println("OPCIONES 1,2,3,4,5,6,7,8,9,10,11,12,13");
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
                ejercicio6(sc);
                break;
            case 7:
                ejercicio7(sc);
                break;
            case 8:
                ejercicio8(sc);
                break;
            case 9:
                ejercicio9(sc);
                break;
            case 10:
                ejercicio10(sc);
                break;
            case 11:
                ejercicio11(sc);
                break;
            case 12:
                ejercicio12(sc);
                break;
            case 13:
                ejercicio13(sc);
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
        for (int i=num; i<num2; i++)
            System.out.println(i);
    }

    public static void ejercicio2(Scanner sc){
        //codigo ejercicio 2
        int resul;
        for (int i=1; i<=20; i++) {
            resul =5*i;
            System.out.println(resul); 
        };

    }
 
    public static void ejercicio3(Scanner sc){
        //codigo ejercicio 3
        
    
    }
    public static void ejercicio4(Scanner sc){
        //codigo ejercicio 4
    }
    public static void ejercicio5(Scanner sc){
        //codigo ejercicio 5
        int num,hor,min,seg;
        System.out.println("ingrese las horas ");
        int num1 = sc.nextInt();
                System.out.println("ingrese los minutos ");
        int num2 = sc.nextInt();
        System.out.println("ingrese los segundos ");
        int num3 = sc.nextInt();
        hor=num1*3600;
        min=num2*60;
        seg=num3;
        int total = seg + min + hor;
        System.out.println(total + "s");
    }
    public static void ejercicio6(Scanner sc){
        //codigo ejercicio 6
        int num,hor,min,seg;
        System.out.println("ingrese los segundos ");
        num=sc.nextInt();
        hor=num/3600;
        min=(num-(3600*hor))/60;
        seg=num-((hor*3600)+(min*60));
        System.out.println(hor+"h "+min+"m "+seg+"s");
    }
    public static void ejercicio7(Scanner sc){
        //codigo ejercicio 7
    }
    public static void ejercicio8(Scanner sc){
        //codigo ejercicio 8
    }
    public static void ejercicio9(Scanner sc){
        //codigo ejercicio 9
    }
    public static void ejercicio10(Scanner sc){
        //codigo ejercicio 10
    }
    public static void ejercicio11(Scanner sc){
        //codigo ejercicio 11
    }
    public static void ejercicio12(Scanner sc){
        //codigo ejercicio 12
    }
    public static void ejercicio13(Scanner sc){
        //codigo ejercicio 13
    }
}