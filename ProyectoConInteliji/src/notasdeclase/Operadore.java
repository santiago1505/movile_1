package notasdeclase;

public class Operadore {
    public static void main(String[] args) {
        int sumaInterna = 4+5;
        int operacion = (4+3*5)*((10-2)/2)/4+3;
        boolean compNun = 4>5;
        boolean conConp = 3>2 || 4!=5;
        boolean conconp = false && true;
        int edad = 18;
        edad += 1;
        System.out.println(sumaInterna);
        System.out.println(edad);

        int array [][] = {{5,4},{8,4},{5,7},{6,22}};
        for (int [] n:array) {
            for (int j:n) {
                System.out.print(j+",");
            }
            System.out.println();
        }



    }
}
