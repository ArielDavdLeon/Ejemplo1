/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;
public class Ejercicio8 {
        private int num;
        
        private static int invertir(int num){
            int aux = num; 
            int digito;
            int numeroInvertido=0;
            int cont = 0;

//            do {
//                aux = aux/10;
//                cont++;
//            }while (aux>0);
//            
//            aux = num;
//            for (int i = 0; i<cont; i++) {
//                digito =(int) ((aux % 10) * Math.pow(10,cont-1-i));
//                numeroInvertido = numeroInvertido + digito;
//                aux = aux/10;
//            }
            
            do{
                digito =aux % 10;
                numeroInvertido = numeroInvertido*10 + digito;
                aux = aux/10;
            }while (aux>0);
            
            return numeroInvertido;
        }
    

    public static void main(String[] args) {
        Fecha fecha1= new Fecha(5,1,2024);
        Fecha fecha2= new Fecha(6,12,1996);
        
        System.out.println(fecha1.calcularAniosPasados(fecha2));
        System.out.println(fecha1.esBisiesto());
        
        System.out.println(Ejercicio8.invertir(123456));
        
       
    }
    
}
