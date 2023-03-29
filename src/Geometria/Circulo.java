package Geometria;

import java.util.Scanner;

// se crea el exten para que esta clase pueda poder ser parte del metodo abstracto y esta se pueda ejecutar
public class Circulo extends Figura{
    //atributos 
    private double radio;
    //metodo constructor vacio
    public Circulo(){};
    //metodo constructor vacio con parametros
    public Circulo(double pi, double radio) {
        this.radio = radio;
    }
    //metodos accesores

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    //metodos 
    public void calcularArea(){
        Scanner leer=new Scanner(System.in);
        double area, pi=3.14;
        System.out.println(" por favor digite el radio del circulo");
            radio=leer.nextInt();

        area=pi*(radio*radio);
        System.out.println("el area del rectangulo es "+area);
    }
    
}
