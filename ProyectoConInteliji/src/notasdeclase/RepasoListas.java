package notasdeclase;

import java.util.ArrayList;
import java.util.Scanner;

public class RepasoListas {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<String>();
        Scanner leer = new Scanner(System.in);
        String id = "1";
        usuarios.add(id); //add,sirve para agregar datos a la lista
        String nombre = leer.next();
        usuarios.add(nombre);
        String correo = "santiago@gmail.com";
        usuarios.add(correo);
        String contraseña = "1234";
        usuarios.add(contraseña);

        //medir el tamaño de la lista
        System.out.println(usuarios.size());
        //para obtener un elemento de la lista
        System.out.println(usuarios.get(1));
        //actualizar un elemento de la lista
        usuarios.set(3,"xxx");
        //BORRAR UN ELEMENTO DE LA LISTA
        usuarios.remove(2);
        //buscar un elemento en la lista
         int A = usuarios.indexOf("santiago");
        System.out.println(A);
        //validar si el arraylist esta vacio
        System.out.println(usuarios.isEmpty());
        //imprimir
        for (int i = 0; i < usuarios.size(); i++){
            System.out.println("el dato " + i + " es: " + usuarios.get(i));
        }






    }
}
