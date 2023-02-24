import java.util.Scanner;

public class Budget {
    
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int spent, budget, totals, op;

        op=1; 
        budget=100000;
        
        while(op==1){

    


        System.out.println("Ingrese el gasto");
        spent=lectura.nextInt();
        budget=budget-spent;
        System.out.println("Desea registrar otro gasto 1.si  2.no");
        op=lectura.nextInt();

        System.out.println("Su presupuesto es "+budget);




    }
    lectura.close();

}
}
