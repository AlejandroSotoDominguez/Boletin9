
package boletin9_2;

public class Boletin9_2 {

    public static void main(String[] args) {
        int i,acumSuma=0,sumProd,totalSuma,totalProd;
        double acumProd=1;
        for(i=10;i<91;i++){
            acumSuma = i+acumSuma;
            acumProd = i*acumProd; 
        }
        totalSuma = acumSuma;
        System.out.print("Total suma = "+totalSuma+"\n"+"Total producto = "+acumProd+"\n");        
    } 
}
