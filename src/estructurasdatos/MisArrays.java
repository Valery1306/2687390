package estructurasdatos;

public class MisArrays {
    public static void main(String[] args) {
        //Declaración e inacialización de un array
        int [] vector1;
        vector1=new int[10];
        //int []vector1=new  int[10];
        //Rellenar vector
        int [] vector={30,50,25,85,12,6,32,41,23,63};
        vector1[6]=32;

        for(int p=0;p<vector.length;p++){
            System.out.print(vector[p]+" " );
        }
        //Mostrar datos del array con for mejorado
        for (int i : vector) {
            System.out.println(i);
        }
    }
    
}
