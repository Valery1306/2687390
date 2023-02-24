import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int precio,cantidad, contador,subtotal, acumulador, pago, cambio;
        String telefonia;
        contador=0;
        for(int x=1; x<=5; x++)
        {
            System.out.println("Digite el precio del producto");
            precio=lectura.nextInt();

            System.out.println("Digite la cantidad del producto");
            cantidad=lectura.nextInt();

        contador= contador +1;
        subtotal=precio*cantidad;
        acumulador=acumulador+subtotal;

        System.out.println("El subtotal es "+acumulador);
        System.out.println("Ingrese el valor que va a pagar");
        pago=lectura.nextInt();
        cambio=pago-acumulador;

        System.out.println("Su cambio es de "+cambio);
        System.out.println("¿Usted cuenta con telefonia Movil Exito");
        telefonia=lectura.next();

        if (telefonia.equals("si")


        }
    }
    
}
