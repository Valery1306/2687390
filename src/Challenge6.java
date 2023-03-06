
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int given1, given2, totals;
        given1=(int)Math.random()*6+1;
        given2=(int)Math.random()*6+1;
        totals=given1+given2;

        if (given1==1 && given2==1){System.out.println("El resultado del primer dador es "+given1+" y el resultado del segundo dado es "+given2+" usted ha obtenido un par de dados y es el ganador");}

        if (totals==3) {System.out.println("El resultado del primer dado es "+given1+" el resultado del segundo dado es "+given2+" y su total es "+totals+" por lo tando es el ganador");}

        if (totals==11) {System.out.println("El resultado del primer dado es "+given1+" el resultado del segundo dado es "+given2+" y su total es "+totals+" por lo tando es el ganador");}

        if (totals==7) {System.out.println("El resultado del primer dado es "+given1+" el resultado del segundo dado es "+given2+" y su total es "+totals+" por lo tando es el ganador");}

        if (totals==12 || totals==2) {System.out.println("El resultado del primer dado es "+given1+" el resultado del segundo dado es "+given2+" y su total es "+totals+" por lo tando es el ganador");}

        else{
            System.out.println("No cumplio con las condiciones y ha perdido");
        }
        lectura.close();

    

    


         

         



    }
    
}
