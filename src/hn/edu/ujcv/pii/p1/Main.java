package hn.edu.ujcv.pii.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        String respuesta;
        do{
            System.out.println("Do While");
        System.out.println("¿Desea seguir? s/n");
           respuesta = teclado.next();
        }while(respuesta.equalsIgnoreCase("s"));

    }
}
