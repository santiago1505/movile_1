package ejerciciosdeclase;

import java.util.ArrayList;
import java.util.Scanner;

public class IngresosListas {

    public static void main(String[] args) {
        Ingresos();
    }

    public static void Ingresos() {
        Scanner leer = new Scanner(System.in);
        ArrayList<Double> valores = new ArrayList<Double>();
        int contador = 0;
        double suma = 0;
        System.out.println("cuantos valores quieres guardar");
        int val = leer.nextInt();

        while (contador < val){
            System.out.println("ingrese el valor que desea guardar");
            valores.add(leer.nextDouble());
            contador++;
        }
        for (int i = 0; i < valores.size(); i++){
             suma += valores.get(i);
                System.out.println("la actividad " + i + " es: " + valores.get(i));


        }
        System.out.println(suma);

    }
}
