import java.util.Scanner;

public class Number {
    
    public static void main(String[] args) {
        
        
        int number;
        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrse un numero");
        number=lectura.nextInt();
        if(number>0){
            System.out.println("El numero es positivo");
        
        }
        else if(number==0){
            System.out.println("El numero es igual a 0");
        }
        else {
            System.out.println("El numero es negativo");
        }
    
    }
    
}
