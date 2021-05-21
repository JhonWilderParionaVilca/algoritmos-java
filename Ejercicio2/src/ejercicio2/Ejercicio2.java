package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaEscaner = new Scanner (System.in);
        int dia = 0;
        int mes = 0;
        int anio = 0;
        int sum_total = 0;
        int sum_digitos = 0;
        
        System.out.print("Ingrese un dia: ");
        dia = Integer.parseInt(entradaEscaner.nextLine());
        
        System.out.print("Ingrese un mes: ");
        mes = Integer.parseInt(entradaEscaner.nextLine());
        
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(entradaEscaner.nextLine());
        
        sum_total = dia + mes + anio;
        System.out.println(sum_total);
        
//        String sum_total_String = Integer.toString(sum_total);
//        
//        for (int i = 0; i < sum_total_String.length(); i++) {
//            int num_convertido = Integer.parseInt(String.valueOf(sum_total_String.charAt(i)));
//            sum_digitos = sum_digitos + num_convertido;
//        }
//        
//        System.out.println("La suma de dígitos es " + sum_digitos);
        
        while(sum_total > 0) {
            sum_digitos = sum_digitos + (sum_total % 10);
            sum_total = sum_total / 10;
        }
        
        System.out.println("la suma de digitos es " + sum_digitos);
        
        
    }
    
}
