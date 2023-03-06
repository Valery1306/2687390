import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int precio, cantidad, descuento, bolita, total, op, contador, acumulador,pago, cambio;

        bolita=(int)(Math.random()*4+1);

        contador=0;
        acumulador=0;
        op=0;
        descuento=0;
        pago=0;
        cambio=0;

        do{
            System.out.println("Ingrese el precio del producto que va a registrar");
            precio=lectura.nextInt();
            System.out.println("Ingrese la cantidad del producto que va a registrar");
            cantidad=lectura.nextInt();
            System.out.println("¿Desea registrar otro producto? 1.si 2.no");
            op=lectura.nextInt();
            contador=contador+1;
            acumulador=acumulador+(precio*cantidad);

        }while (op==1);
        System.out.println("El precio total de los productos es "+acumulador);

        if (acumulador>50000 && bolita==1)
        {descuento=(10*acumulador)/100; total=acumulador-descuento;
            System.out.println("Felicidades ha ganado el 10% de descuento en su compra por sacar la bolita roja, el total de su compra ahora es "+total);
            System.out.println("Ingrese el valor con el que va a pagar");
            pago=lectura.nextInt();
            cambio=pago-total;
            System.out.println("Su cambio es "+cambio);
        
        }else if (acumulador>50000 && bolita==2)
        {descuento=(30*acumulador)/100; total=acumulador-descuento;
            System.out.println("Felicidades ha ganado el 30% de descuento en su compra por sacar la bolita azul, el total de su compra ahora es "+total);
            System.out.println("Ingrese el valor con el que va a pagar");
            pago=lectura.nextInt();
            cambio=pago-total;
            System.out.println("Su cambio es "+cambio);

        }else if (acumulador>50000 && bolita==3)
        {descuento=(50*acumulador)/100; total=acumulador-descuento;
            System.out.println("Felicidades ha ganado el 50% de descuento en su compra por sacar la bolita amarilla, el total de su compra ahora es "+total);
            System.out.println("Ingrese el valor con el que va a pagar");
            pago=lectura.nextInt();
            cambio=pago-total;
            System.out.println("Su cambio es "+cambio);

        }else if (acumulador>50000 && bolita==4)
        {descuento=(100*acumulador)/100; total=acumulador-descuento;
            System.out.println("Felicidades ha ganado el 100% de descuento en su compra por sacar la bolita blancaazul, el total de su compra ahora es "+total);
            System.out.println("Ingrese el valor con el que va a pagar");
            pago=lectura.nextInt();
            cambio=pago-total;
            System.out.println("Su cambio es "+cambio);

        }else {
            System.out.println("Lo lamentamos su compra no es superior a 50000");
        }

        lectura.close();
    }
    
}
