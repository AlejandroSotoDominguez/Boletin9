
package boletin9_4;

public class Multiplicar {
    
    public void calcular(int num){
        if(num>0){        
            for(int i=1;i<=10;i++){
                int multiplicacion = num*i;
                System.out.println(num+"*"+i+"="+multiplicacion);      
            }        
        } 
    }
}
