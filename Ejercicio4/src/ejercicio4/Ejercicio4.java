package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        int sum_pares = 0;
        
        for (int i = 0; i <= 100; i++) {
            if (i < 50 || i > 76) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    sum_pares = sum_pares + i;
                }
            }
        }
        System.out.println("suma de pares es: " + sum_pares);
    }
    
}
