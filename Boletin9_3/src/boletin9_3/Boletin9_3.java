
package boletin9_3;

import java.util.Scanner;

public class Boletin9_3 {

    public static void main(String[] args) {
        double base,altura,num;
        Scanner sc = new Scanner(System.in);
        Area area1 = new Area();
        System.out.println("Base:");
        num = sc.nextDouble();
        while(num<0){
            num = sc.nextDouble();
            System.out.println("La base no es positiva");
        }
        base = num;
        num = 0;
        System.out.println("Altura:");
        num = sc.nextDouble();
        while(num<0){
            num = sc.nextDouble();
            System.out.println("La altura no es positiva");
        }
        altura = num;
        area1.areaRectangulo(base,altura);
    }
    
}
