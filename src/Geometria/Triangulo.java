package Geometria;

import java.util.Scanner;

// se crea el exten para que esta clase pueda poder ser parte del metodo abstracto y esta se pueda ejecutar
public class Triangulo extends Figura {
    //atributo
    private double base;
    private double altura;
    //metodo constructor vacio
    public Triangulo(){};
    //metodo constructor vacio con parametros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodos accesores
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
        //metodos
        public void calcularArea(){
            //procesos
            Scanner leer=new Scanner(System.in);
            System.out.println(" por favor digite la base del triangulo");
            base=leer.nextInt();
            System.out.println(" por favor digite la altura del triangulo");
            altura=leer.nextInt();
            double area;
            area=(base*altura)/2;
            System.out.println("el area del triangulo es es "+area);
}
}