package Geometria;

import java.util.Scanner;

// se crea el exten para que esta clase pueda poder ser parte del metodo abstracto y esta se pueda ejecutar
public class Rectangulo extends Figura {
    //atributos
    private double base;
    private double altura;
    //metodo constructor vacio
    public Rectangulo(){};
    //metodo constructor vacio con parametros
    public Rectangulo(double base, double altura) {
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
        Scanner leer=new Scanner(System.in);
        System.out.println(" por favor digite la base del rectangulo");
        base=leer.nextInt();
        System.out.println(" por favor digite la altura del rectangulo");
        altura=leer.nextInt();
        double area;
        area=base*altura;
        System.out.println("el area del rectangulo es "+area);
        
}
}