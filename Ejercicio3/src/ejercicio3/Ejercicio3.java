package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        int numeroIngresado = 0;
        String numero_invertido = "";
        int sum_digitos = 0;
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.print("Ingrese un numero: ");
        numeroIngresado = entradaEscaner.nextInt();
        
        while(numeroIngresado > 0) {
            sum_digitos = sum_digitos + (numeroIngresado % 10);
            
            String digito = Integer.toString(numeroIngresado % 10);
            numero_invertido = numero_invertido + digito;
            
            
            numeroIngresado = numeroIngresado / 10;
        }
        
        System.out.println("La suma de digitos es: " + sum_digitos );
        System.out.println("El numero invertido es: "+ numero_invertido);
        
    }
    
}
