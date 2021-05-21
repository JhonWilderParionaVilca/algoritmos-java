package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int sum_pares = 0;
        int sum_impares = 0;
        int num_Ingresado = 0;
        int resultado = 0;
        
        Scanner entradaEscaner = new Scanner (System.in);
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un numero: ");
            num_Ingresado = Integer.parseInt(entradaEscaner.nextLine ());
            
            if (num_Ingresado % 2 == 0) {
                sum_pares = sum_pares + num_Ingresado;
            }else{
                sum_impares = sum_impares + num_Ingresado;
            }
        }
        
        resultado = Math.abs(sum_pares - sum_impares);
        
        System.out.println("La diferencia de las sumas de impares y pares es " + resultado);
       
    }
    
}
