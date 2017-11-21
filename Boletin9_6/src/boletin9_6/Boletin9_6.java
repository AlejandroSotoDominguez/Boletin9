
package boletin9_6;

import java.util.Scanner;

public class Boletin9_6 {

    public static void main(String[] args) {
       int numTrabajadores, contadorTrabajadores = 0,sueldo, num = 0, numPorcentaje = 0; 
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("Inserta el sueldo:");
           sueldo = sc.nextInt();
           if(sueldo>0){
               contadorTrabajadores++;
               if(sueldo>=1000 && sueldo<=1750){
                   num++;
               }else{
                   numPorcentaje++;
               }
           }else{
               System.out.println("El sueldo no puede ser 0");
           }
       }while(sueldo>0);
        System.out.println(num+" empleados ganan entre 1000 e 1750 €");
        System.out.println(numPorcentaje*100/contadorTrabajadores+"% empleados ganan entre 1000 e 1750 €");
    }
    
}
