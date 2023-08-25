package notasdeclase;

public class Variables {
    public static void main(String[] args) {
        //tipos de datos:String,float,char,byte,boolean,int,double.
        //variables se declaran y se inicializan

        String nombre; //declarar variable

        nombre = "santiago"; //variable inicializada

        int id = 15422441; //variable declarada e inicializada

        //acop o ambito de las variables corresponde a si esta puede ser alcanzada por todas las estruturas que componen la clase o si solo funciona para una estrutura deterninada

        String global = "soy globa";
        if (global.equals("soy global")){
            System.out.println("es una variable global");
            String local = "pero yo no ";
            System.out.printf(local);
        }else{
            System.out.println("no es global");
        }

        //las variables del mismo tipo se pueden castear sin perdida de informacion
        //las de distinto tipo, hay perdida de informacion

        byte numByte = 120;
        short numShort = (short)numByte;
        System.out.println(numShort);

        //parseo se da entre String y datos numericos
        String numDouble = "4.56";
        double numDecimal = Double.parseDouble(numDouble);
        System.out.println(Double.parseDouble(numDouble));

        double suma = numDecimal + 4.26;

    }
}
