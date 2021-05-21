package ejercio5;

import java.util.Scanner;

public class Ejercio5 {

    public static void main(String[] args) {
        Scanner ingreso_usuario = new Scanner(System.in);
        int perimetro = 0;
        int area = 0;
        
        int base = 0;
        int altura = 0;
        
        System.out.println("Ingrese el valor de la base: ");
        base = ingreso_usuario.nextInt();
        System.out.println("Ingrese el valor de la altura: ");
        altura = ingreso_usuario.nextInt();
        
        perimetro = (2*base) + (2*altura);
        System.out.println("El perimetro mide: " + perimetro);
        
        area = base * altura;
        System.out.println("El area mide: " + area);
        
        
    }
    
}
