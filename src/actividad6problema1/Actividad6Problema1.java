/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6problema1;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Actividad6Problema1 {

    /**
     * Johanna Daniela Macias Martinez
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num=0, suma = 0;
     
        while(num>=0){
            try{
            suma= calcularsuma(num,suma);
            num=solicitardatos(); 
        }
            catch (Exception e){
                System.out.println("No ingresaste un número");
                
            }
        }
        System.out.println("La suma de los números positivos es: "+suma);
          
}
    static double solicitardatos(){
        Scanner key = new Scanner (System.in);
        double num;
        System.out.println("Teclea un número positivo: ");
        num=key.nextDouble();
        return num;
    }

    static double calcularsuma(double num, double suma){
        
        return suma=suma+num;
    }

}