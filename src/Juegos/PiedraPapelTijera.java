package Juegos;

import java.util.*;
//se implementara en la interfaz
public class PiedraPapelTijera implements Juego {

    //atributos 
    private String nombre;
    private int dato;
    private int manos;
    
    //metodos que se desarrollaran para la interfaz
    //metodos de ejecucion con nuestro buffer
    Scanner leer=new Scanner(System.in);
    int aleatorio;
    public void iniciar() {
        System.out.println("ingrese su nombre como jugador ");
        nombre=leer.next();

    }
    public void Jugar() {
        System.out.println("digite si piensa\n 1 piedra\n 2 papel\n 3 tijera");
        dato=leer.nextInt();
        Random aleatorio = new Random();
        manos= aleatorio.nextInt(3)+1;
        System.out.println("el ganador entre la maquina y el jugador "+nombre+" es...");
    }
    public void Finalizar() {
            /*instnciar la condicion if con diferentes casos que puede haber*/
    if(dato==1 && aleatorio==0){
        System.out.println("empate"); 
    }else if (dato==2 && aleatorio==1){
        System.out.println("empate");
    }else if (dato==3 && aleatorio==2){
        System.out.println("empate");
    }else if (dato==1 && aleatorio==1){
        System.out.println("perdiste");
    }else if (dato==1 && aleatorio==2){
        System.out.println("ganaste");
    }else if (dato==2 && aleatorio==0){
        System.out.println("ganaste");
    }else if (dato==2 && aleatorio==2){
        System.out.println("perdiste");
    }else if (dato==3 && aleatorio==0){
        System.out.println("perdiste");
    }else if (dato==3 && aleatorio==1){
        System.out.println("perdiste");
    }else{
        System.out.println("ingreso datos incorrectos");

    }
    
}
}
