import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int number1, number2, number3;

        System.out.println("Ingrese el primer numero");
        number1= lectura.nextInt();
        System.out.println("Ingrese el segundo numero");
        number2= lectura.nextInt();

        if(number1>number2){ number3= number1+number2; System.out.println("El numero  "+number1+" es mayor que el numero "+number2+"y la suma entre estos numeros es "+number3);

        }else{
            number3= number1-number2; System.out.println("El numero "+number1+" es menor que el numero 2"+number2+" y la resta entre estos numeros es "+number3);

        
        }

        lectura.close();

    
}
    

}