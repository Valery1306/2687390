import java.util.Scanner;

public class Challenge9 {


    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int apuesta, apuesta2, apuesta3, ganador, op, numero1, numero2, acumulador, contador;
        
        op=0;
        acumulador=0;
        ganador=0;
        contador=0;
        numero1=(int)(Math.random()*2+1);

        System.out.println("Ingrese el valor de la apuesta inicial");
        apuesta=lectura.nextInt();

        do {
            System.out.println("¿Cuanto va a apostar esta vez?");
            apuesta2=lectura.nextInt();
            System.out.println("Ingrese un numero del 1 al 2, 1 siendo cara y 2 siendo cruz");
            numero2=lectura.nextInt();

            switch (numero2) {
                case 1:
                if (numero1==1 && numero1==numero2 && apuesta2<=apuesta){
                    System.out.println("Usted ha elegido cara y es el ganador");
                    ganador=apuesta2*2;
                    System.out.println("usted ha ganado con esta apuesta un total de "+ganador);

                }else if (numero1==2 && apuesta2<=apuesta) {
                    System.out.println("Usted ha elegido cara y ha perdido");
                    ganador=-apuesta2;
                    System.out.println("usted ha ganado con esta apuesta un total de "+ganador);
                }
                break;
                case 2:
                if (numero1==2 && numero1==numero2 && apuesta2<=apuesta){
                    System.out.println("Usted ha elegido cruz y es el ganador");
                    ganador=apuesta2*2;
                    System.out.println("usted ha ganado con esta apuesta un total de "+ganador);

            }else if (numero1==1 && apuesta2<=apuesta) {
               System.out.println("Usted ha elegido cruz y ha perdido");
                    ganador=-apuesta2;
                    System.out.println("usted ha ganado con esta apuesta un total de "+ganador);
            }else if (apuesta2>apuesta) {
                System.out.println("La apuesta que usted desea realizar es superior a su apuesta inicial, por favor apueste otra cantida o reinicie");
            }
            break;
            default: System.out.println("numero invalido elija 1 0 2");
            break;
         }

            acumulador=acumulador+ganador;
            apuesta3=apuesta+acumulador;
            contador=contador+1;
            System.out.println("Su apuesta inicial ahora es de "+apuesta3);
            System.out.println("deseea seguir jugando 1. si 2. no");
            op=lectura.nextInt();

        } while (op==1);
        System.out.println("Usted ha jugado un total de "+contador+" veces y ha ganado un total de "+acumulador+" su apuesta inicial era de "+apuesta+" y su apuesta final es "+apuesta3+" gracias");


        lectura.close();

    }
    
}



