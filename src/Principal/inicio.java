package Principal;
//importa otro paquete con la clase necesaria para poder ser ejecutada en este paquete
import Salud.Persona;
import Salud.Empleado;
/*import java.util.Scanner;*/
public class inicio {
    public static void main(String[] args) {
        /*variables para llamar a los metodos con parametros o con valor de retornno */
        int peso, edad,horastrabajadas;
        double estatura, resultado,valorhora, calcular;
        //instanciar el metodo constructor de la super clase     
    Persona person=new Persona();
        //instanciar el metodo constructor de la sub clase 
        /*  
    Empleado em=new Empleado();
    */

        //procedimientos para llamara un metodo con parametros

    /*Scanner leer = new Scanner (System.in);
     */
         //llamar a un metodo sin parametros
    person.pedirDatos();
    /* 
    em.cosultarDatos();
    */
    //procedimientos para llamara un metodo con parametros
    
    /* 
    System.out.println("digite su peso en kg"); 
    peso=leer.nextInt();
    System.out.println("digite su estatura en metros"); 
    estatura=leer.nextInt();
    System.out.println("digite su edad"); 
       edad=leer.nextInt();
       */

        //llamar a un metodo sin parametros
        person.mostrarPersona();
        //llamar a un metodo de retorno por medio de los metodos accesore spara que este otro paquete pueda acceder a ellos
        /* 
        em.calcularHonorarios (em.getValorhora(), em.getHorastrabajadas());   
        
        //lamar al metodo con parametros
    
    /*resultado=calcularImc(peso,estatura);*/

        //llamar a un metodo con valor de retorono y sus metodos de acceso
    resultado=person.calcularImc(person.getPeso(),person.getEstatura());

    person.mayorEdad(person.getEdad());



}
}