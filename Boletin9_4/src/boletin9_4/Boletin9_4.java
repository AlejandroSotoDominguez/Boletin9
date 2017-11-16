
package boletin9_4;

import java.util.Scanner;

public class Boletin9_4 {

    public static void main(String[] args) {
        int num=0,acumulador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        num = sc.nextInt();
        Multiplicar obj = new Multiplicar();
        obj.calcular(num);
         
    }
    
}
