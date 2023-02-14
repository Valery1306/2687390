import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int number1, number2, resultados;
        System.out.println("Ingrese un numero");
        number1= lectura.nextInt();
        System.out.println("Ingrese el segundo numero");
        number2: lectura.nextInt();

        resultado= number1+number2;
        System.out.println("la suma entre "+number1+"y "+number2 +" es:"resultado);
        String name;
        lectura.nextline();//LIMPIEZA DE BUFFER
        
        System.out.println("Ingrese su nombre");
        name = lectura.nextLine();
        System.out.print("El nombre ingresado fue:"+name);

    







        lectura.close();
    }
}

