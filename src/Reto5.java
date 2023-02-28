import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        String name, lastname, fullname;

        System.out.println("Ingrese su nombre");
        name=lectura.next();
        System.out.println("Ingrese el apellido");
        lastname=lectura.next();
        fullname=name+lastname;

        System.out.println("El largo de su nombre es "+name.length()+"  y el largo de su apellido es "+lastname.length());
        System.out.println("Su nombre completo es "+fullname);
        System.out.println("Su nombre es "+name.toUpperCase()+" y su apellido es "+lastname.toLowerCase());
        System.out.println(name.substring(0, 2)+lastname);
    }
    
}
