
package boletin9_1;

import java.util.Scanner;

public class Comprobar {
    
    public void ComprobarNumeros(){
        int i,num,acumuladorPos=0,acumuladorNeg=0,acumuladorCero=0,totalPos=0,totalNeg=0,totalCero=0;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++){
            num = sc.nextInt();           
            if(num>0){ 
                acumuladorPos++;
                totalPos = acumuladorPos;
            }else if(num<0){
                acumuladorNeg++;
                totalNeg = acumuladorNeg;               
            }else if(num==0){
                acumuladorCero++;
                totalCero = acumuladorCero;
            }      
        }
        System.out.println(totalPos+" números son positivos");
        System.out.println(totalNeg+" números son negativos");
        System.out.println(totalCero+" números son ceros");
    }
}
