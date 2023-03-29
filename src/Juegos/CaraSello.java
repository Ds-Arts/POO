package Juegos;

import java.util.Random;
import java.util.Scanner;
//se implementara en la interfaz
public class CaraSello implements Juego {
    //atributos
    private int moneda;
    private String jugador;
    private int eleccion;

    Scanner leer=new Scanner(System.in);


    public void iniciar() {
        System.out.println("ingrese el nombre del jugador");
        jugador=leer.next();

    }
    public void Jugar() {
        System.out.println(jugador+ "realice su eleccion\n 1 cara\n 2 sello");
        eleccion=leer.nextInt();
        Random aleatorio = new Random();
        moneda= aleatorio.nextInt(2)+1;
        System.out.println("la moneda callo en...");
    }
    public void Finalizar() {
        if(moneda==1 && eleccion==1){
            System.out.println("cayo cara, ganaste "+jugador);
        }else if (moneda==1 && eleccion==1){
            System.out.println("cayo sello, ganaste "+jugador);
        }else if (moneda==1 && eleccion==2){
            System.out.println("cayo cara, perdicte "+jugador);
        }else if(moneda==2 && eleccion==1){
            System.out.println("cayo sello, perdicte "+jugador);
        }
    
}
}
