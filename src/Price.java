import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        int precio, cantidad;
        Scanner leer=new Scanner(System.in);
        for( int x=1; x<=5; x++)
        
        {
            System.out.println("Digite el precio del producto");
            precio=leer.nextInt();
            
            System.out.println("Digite la cantidad del producto");
            cantidad=leer.nextInt();
        }
    }
}
