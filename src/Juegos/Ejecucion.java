package Juegos;
import java.util.Scanner;

import Salud.*;
//instancia la clase
public class Ejecucion {
    public static void main(String[] args) {
        CaraSello cara=new CaraSello();
        PiedraPapelTijera pct=new PiedraPapelTijera();
        int f;
        Scanner leer= new Scanner(System.in);      
        //instancias metodos constructores y con esto metodos que se llevaran a acabo
        System.out.println("seleccione el juego el cual quiere jugar:\n 1 cara y sello\n 2 piedra papel o tijera");
        f=leer.nextInt();
        if (f==1){
        cara.iniciar();
        cara.Jugar();
        cara.Finalizar();
        }else if (f==2){
        pct.iniciar();
        pct.Jugar();
        pct.Finalizar();
        }

    }
}
