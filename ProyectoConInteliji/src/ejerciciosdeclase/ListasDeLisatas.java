package ejerciciosdeclase;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListasDeLisatas {
   static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Usuarios();
        List<List<String>> usuarios = new ArrayList<>();
        ArrayList<String> usuario1 = new ArrayList<>();
        ArrayList<String> usuario2 = new ArrayList<>();
        usuario1.add("maria");
        usuario1.add("12");
        usuario1.add("maria@gmail.lcom");

        usuario2.add("pepito");
        usuario2.add("15");
        usuario2.add("pepito@gmail.lcom");

        for (int i = 0; i < usuario1.size(); i++) {
            System.out.println(usuario1.get(i));
        }
        //podemos hacer busquedas dentro de los array
        System.out.println(usuario1.indexOf("12"));

        int resp = usuario2.indexOf("pepito@gmail.lcom");
        if (resp != -1) {
            System.out.println("usuario encontrado");
            System.out.println("la posicion es: " + usuario1.indexOf("pepito@gmail.lcom") + "el elemento es: " + usuario1.get(resp));
        }else{
            System.out.println("usuario no encontrado");
        }

        //adicional los arraylist a las listas

        usuarios.add(usuario1);
        usuarios.add(usuario2);

        int res = usuarios.indexOf(usuario2);
        System.out.println(res);

        for (List<String> usuario: usuarios) {
            for (String dato: usuario) {
                System.out.println("dato: " + dato);
            }
            System.out.println("\n");
        }
    }

    public static void Usuarios() {
        ArrayList<String> usuario1 = new ArrayList<>();
        System.out.println("cuantos elementos desea ingresar");
        int res = leer.nextInt();
        for (int i = 0; i < res ; i++) {
            System.out.println("ingrese el primer elemento");
            String elem = leer.next();
            usuario1.add(elem);
        }

        for (int i = 0; i < usuario1.size(); i++) {
            System.out.println(usuario1.get(i));
        }


    }
}
