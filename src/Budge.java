import java.util.Scanner;

public class Budge {
    
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

        double ancho, largo, presupuesto, area;
        System.out.println("Ingrese el ancho");
        ancho= lectura.nextDouble();
        System.out.println("Ingrese el largo");
        largo= lectura.nextDouble();

        area= largo*ancho;
        presupuesto=45000*area;



        System.out.println("La superficie a cubrir tiene "+ancho+" metros de ancho por "+largo+" metros de largo con "+area+" metros cuadrados. El presupuesto del proyecto es "+presupuesto);

lectura.close();


    
}
}