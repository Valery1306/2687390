import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int bolita, buy, total, discount;
        System.out.println("Ingrese el valor de su compra");
        buy=lectura.nextInt();
        bolita=(int)Math.random()*4+1;
        discount=0;

        if (buy>50000 && bolita==1) {discount=(10*buy)/100; total=buy-discount;
             System.out.println("Felicitaciones ha obtenido un 10% de descuento en su compra por sacar la bolita roja, el total de su compra ahora es de "+total);
            }else
             if (buy>50000 && bolita==2) {discount=(30*buy)/100; total=buy-discount;
                System.out.println("Felicitaciones ha obtenido un 30% de descuento en su compra por sacar la bolita azul, el total de su compra ahora es de "+total);
            }else
                if (buy>50000 && bolita==3) {discount=(50*buy)/100; total=buy-discount;
                    System.out.println("Felicitaciones ha obtenido un 50% de descuento en su compra por sacar la bolita roja, el total de su compra ahora es de "+total);
                }else
                    if (buy>50000 && bolita==4) {discount=(100*buy)/100; total=buy-discount;
                        System.out.println("Felicitaciones ha obtenido su compra totalmente gratis por sacar la bolita blanca");
                    }
                        else {
                            System.out.println("No obtienes un descuento ya que tu compra tu compra no es mayor a 50.000");
                        }

                        lectura.close();




    }
    
}


