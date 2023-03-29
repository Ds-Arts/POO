package Geometria;

import java.util.Scanner;

public class Ejecucion {
    //metodo de ejecucion
    public static void main(String[] args) {
        //instanciando variables con abse  alos atributos de cada una d elas sub clases
        double base, altura, pi=3.14, radio;
        String f;
        Circulo I= new Circulo();
        //se instnacia el metodo constructor de la  clase para poder usar esta misma
        Rectangulo R = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        Triangulo T=new Triangulo();
        System.out.println("digite figura la cual le sacara el area");
        f=leer.next();
         if (f.equalsIgnoreCase("rectangulo")){
        R.calcularArea();
        }else if (f.equalsIgnoreCase("circulo")){
        I.calcularArea();
        }else if(f.equalsIgnoreCase("triangulo")){
            T.calcularArea();
        }

/* 
        System.out.println(" por favor digite la base del rectangulo");
        base=leer.nextInt();
        System.out.println(" por favor digite la altura del rectangulo");
        altura=leer.nextInt();
        //se instnacia el metodo constructor de la  clase para poder usar esta misma
        Rectangulo R= new Rectangulo(base, altura);
        //con el metodo constructor se instancia el metodo procipo de la clase
        R.calcularArea();

        System.out.println(" por favor digite el radio del circulo");
        radio=leer.nextInt();
        //se instnacia el metodo constructor de la  clase para poder usar esta misma
        Circulo I= new Circulo(pi, radio);
        //con el metodo constructor se instancia el metodo procipo de la clase
        I.calcularArea();

        System.out.println(" por favor digite la base del triangulo");
        base=leer.nextInt();
        System.out.println(" por favor digite la altura del triangulo");
        altura=leer.nextInt();
        //se instnacia el metodo constructor de la  clase para poder usar esta misma
        Triangulo T=new Triangulo(base, altura);
        //con el metodo constructor se instancia el metodo procipo de la clase
        T.calcularArea();




        leer.close();*/
        //instanciando el objeto de cada clase

    }
}
