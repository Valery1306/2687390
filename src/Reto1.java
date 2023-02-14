import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double temperatura1, temperatura2;
        System.out.println("Ingrese la temperatura en grados centigrados(c°)");
        temperatura1=lectura.nextDouble();
        temperatura2= (temperatura1-32)/1.8 ;
        System.out.println("La temperatura en grados Fahrenheit(F°) es "+temperatura2+"(F°)");

        lectura.close();
    
    }
    

}
