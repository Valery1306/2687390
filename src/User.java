import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        String user, pass;

        System.out.println("Ingrese su usuario");
        user=lectura.next();
        System.out.println("Ingrese su contraseña");
        pass=lectura.next();

        if (user.equals("valery123") && pass.equals("1019988247")){ System.out.println("Bienvenido al sistema");

        }else if (user.equals("valery123")) {System.out.println("Parece que olvidaste tus credenciales de acceso");

         } else if (pass.equals("1019988247")) {System.out.println("Algo sucede con tus datos de acceso");

         }else{
            System.out.println("Acceso denegado");
         }
         lectura.close();

    }
    
}
