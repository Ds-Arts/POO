package Juegos;
//se instancia una insterfaz para estandarizar los juegos
public interface Juego {
    //en una unterfaz solo se implementan los metodos en comun de las clases publicos o abstractos
    //metodos para los juegos
    public void iniciar();
    public void Jugar();
    public void Finalizar();
}
