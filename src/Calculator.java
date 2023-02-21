import java.util.Scanner;



public class Calculator {
   public static void main(String[] args) {
   Scanner lectura=new Scanner(System.in);
   double number1, number2, rest, rest2;
   int op;

   System.out.println("Ingrese un numero");
   number1= lectura.nextInt();
   System.out.println("Ingrese otro numero");
   number2= lectura.nextInt();

   System.out.println("1.suma  2.resta  3.multiplicacion  4.División 5.Potencia  6.Radicación");
   op= lectura.nextInt();

   switch (op) {
    case 1:
    rest=number1+number2;
    System.out.println("La suma entre los números"+number1+" "+number2+" es "+rest);
    break;

    case 2: 
    rest=number1-number2;
    System.out.println("La resta entre los números "+number1+" "+number2+" es "+rest);
    break;

    case 3:
    rest=number1*number2;
    System.out.println("La Multiplicación entre los números "+number1+" "+number2+" es "+rest);
    break;

    case 4:
    rest=number1/number2;
    System.out.println("La división entre los números "+number1+" "+number2+" es "+rest);
    break;

    case 5:
    rest=Math.pow(number1, number2);
    System.out.println(number1+"elevado al número"+number2+" es "+rest);
    break;

    case 6:
    rest=Math.sqrt(number1);
    rest2=Math.sqrt(number2);
    System.out.println("La raiz cuadrada de "+number1+" es "+rest);
    System.out.println("La raiz cuadrada de "+number2+" es "+rest);

    default:
    System.out.println("La opción no es valida");
    break;

   }
   lectura.close();

     }
     
     }
    

