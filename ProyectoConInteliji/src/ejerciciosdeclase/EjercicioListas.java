package ejerciciosdeclase;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioListas {

    public static void main(String[] args) {
        AgregarElementos();

    }

    public static void AgregarElementos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantas actividades vas a guardar");
        int act = leer.nextInt();
        int contador = 0;
        ArrayList<String> favoritos = new ArrayList<String>();

        while (contador < act){

            System.out.println("ingrese su actividad favorita");
            favoritos.add(leer.next());
            contador++;
        }
        for (int i = 0; i < favoritos.size(); i++){
            System.out.println("la actividad " + i + " es: " + favoritos.get(i));
        }
    }
}
