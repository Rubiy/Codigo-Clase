/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import static java.lang.Math.sqrt;
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
        }

    }
 
    public static void ejercicio3(Scanner sc){
        //codigo ejercicio 3
        int num=0;
        int num2=0;
        for (int i=0; i<15; i++){
            System.out.println("Introduce un numer");
            num=sc.nextInt();
            num2=num;
        }
            
    }
    
    public static void ejercicio4(Scanner sc){
        //codigo ejercicio 4
        System.out.println ("Introduce valores");
        int numval = sc.nextInt();
        int contador = 0;
        int sumatorio = 0;
        do {
            contador ++;
            System.out.println("Introduce un numero");
            int nuevonum = sc.nextInt();
            sumatorio = sumatorio + nuevonum;
        }while (contador != numval);
        int media= (sumatorio/numval);
        System.out.println("La media es " +media); 
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
        int mayor = 0;
        int menor = 0;
        for(int i=10; i>0; i--){
            System.out.println("Introduce numero");
            int num = sc.nextInt();
            if (i > 9){
                mayor= num;
                menor= num;
            }
            else if (i < 10){
                if (num > mayor){
                    mayor = num;}
                else if (num < menor){
                    menor = num;}
            }
        }
        System.out.println("el numero mayor es " + mayor + " y el menor es " + menor) ;
    }
    
    public static void ejercicio8(Scanner sc){
        //codigo ejercicio 8
        Scanner leer=new Scanner(System.in);
        int n,fact = 1,i;
        System.out.println("dame el numero que quieras y sacare su factorial");
        n=leer.nextInt();
        for (i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("el factorial de tu numero es -> "+ fact);
        }
    
    public static void ejercicio9(Scanner sc){
        //codigo ejercicio 9
        int a,b,c,Mayor,Medio,Menor;

        System.out.println("Ingresa el primer numero");
        a=sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        b=sc.nextInt();
        System.out.println("ingresa el tercer numeero");
        c=sc.nextInt();

        if(a>b&&a>c)
            Mayor=a;
        else
            if(b>a&&b>c)
            Mayor=b;
        else
            Mayor=c;

        if(a<b&&a<c)
        Menor=a;
        else
        if(b<a&&b<c)
        Menor=b;
        else
        Menor=c;
        Medio=(a+b+c)-(Mayor+Menor);
        System.out.println("el de los numeros ingresados es: ");
        System.out.println(Mayor+" "+Medio+" "+Menor);
        }
    
    public static void ejercicio10(Scanner sc){
        //codigo ejercicio 10
        int nota=0;
        System.out.println("Introduce la nota");
        nota=sc.nextInt();
        switch (nota) {
            case 0:
                System.out.println("La nota es Cero");
                break;
            case 1:
                System.out.println("La nota es Uno");
                break;
            case 2:
                System.out.println("La nota es Dos");
                break;
            case 3:
                System.out.println("La nota es Tres");
                break;
            case 4:
                System.out.println("La nota es Cuatro"); 
                break;
            case 5:
                System.out.println("La nota es Cinco");
                break;
            case 6: 
                System.out.println("La nota es Seis"); 
                break;
            case 7:
                System.out.println("La nota es Siete");
                break;
            case 8: 
                System.out.println("La nota es Ocho"); 
                break;
            case 9:
                System.out.println("La nota es Nueve");
            case 10: 
                System.out.println("La nota es Diez"); 
                break;
            default: System.out.println("Error al introducir la nota");
        }
    }
    
    public static void ejercicio11(Scanner sc){
        //codigo ejercicio 11
        int nota=0;
        System.out.println("Introduce la nota");
        nota=sc.nextInt();
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso"); 
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6: 
                System.out.println("Bien"); 
                break;
            case 7:
            case 8: 
                System.out.println("Notable"); 
                break;
            case 9:
            case 10: 
                System.out.println("Sobresaliente"); 
                break;
            default: System.out.println("Error al introducir la nota");
        }
    }
    
    public static void ejercicio12(Scanner sc){
        //codigo ejercicio 12
        int alumnos;
        double nota = 0;
        double aprobados = 0;
        double suspensos = 0;
        double media;
        double suma = 0;

        System.out.println("Introduce el numero de alumnos");
        alumnos = sc.nextInt();

        for (int i=0; i<alumnos; i++){
            System.out.println("Introduce la nota: ");
            nota = sc.nextInt();
            suma = suma + nota;
            if (nota < 5){
              suspensos++;
            } else {
                aprobados++;
            }

        }
            media = suma / alumnos;
            System.out.println("La media de las notas es: " + media);
            System.out.println("El numero de aprobados es: " + aprobados);
            System.out.println("El numero de suspensos es: " + suspensos);
    }
    
    public static void ejercicio13(Scanner sc){
        //codigo ejercicio 13
        int i=0, j=0, div=0,raiz=0;
        for (i=1;i<101;i++){ 
            div=0; 
            raiz=(int)sqrt(i);
            for (j=1;j<=raiz;j++){ 
                if (i%j==0)
                div++;
            }
        if (div<=1)
        System.out.println (i + " es numero primo" );
        }
    }
}