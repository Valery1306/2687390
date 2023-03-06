import java.util.Scanner;

public class Challenge4 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int aleatorio=3, numero ;
        System.out.println("elige 1.tijera 2.piedra 3.papel ");
        numero=lectura.nextInt();
        
        aleatorio=(int)(Math.random()*3+1);
        if (aleatorio==1 && numero==2) {System.out.println("Usted ha elegido piedra y ha ganado ");
            } else
        if (aleatorio==1 && numero==3) {System.out.println("Usted ha elegido papel y ha perdido");
        } else 
        if (aleatorio==3 && numero==1) {System.out.println("Usted ha elegido tijera y ha ganado");
        } else 
     if (aleatorio==2 && numero==1) {System.out.println("Usted ha elegido tijera y ha perdido ");
        } else 
    if (aleatorio==2 && numero==3)  {System.out.println("Usted ha elegido papel y ha ganado ");
        }else 
    if (aleatorio==3 && numero==2)  {System.out.println("Usted ha elegido piedra y ha perdido ");
        } else 
    if (aleatorio==1 && numero==1)  {System.out.println("Usted ha quedado en empate ");
        } else 
        if (aleatorio==2 && numero==2)  {System.out.println("ha quedado en empate ");
        } else 
        if (aleatorio==3 && numero==3)  {System.out.println("ha quedado en empate ");
        }
      }
}