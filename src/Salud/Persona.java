package Salud;

import java.util.Scanner;

public class Persona {
    //atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int peso;
    private double estatura;
    private int edad;
    private String sexo;
    //metodo constructor sin parametros
    public Persona(){};
    //metodo constructor con parametros iguales a los atributos
    public Persona(String tipoDoc, int documento, String nombre, String apellido, int peso, double estatura, int edad,
            String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }
    //metodo constructor con parametros diferentes a los atributos

    /*public Persona(String tipoDoc, int _documento, _String nombre, String _apellido, int _peso, double _estatura, int _edad,
    String sexo) {
    tipoDoc = _tipoDoc;
    documento = _documento;
    nombre = _nombre;
    apellido = _apellido;
    peso = :peso;
    estatura = _estatura;
    edad = _edad;
    sexo = _sexo;*/

        //se crean metodos accesores para poder modificar los atributos o consultarlos en otros paquetes
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //metodos
    public  void pedirDatos() {
        Scanner leer = new Scanner (System.in);
       System.out.println("digite su tipo de documento"); 
       tipoDoc=leer.next();
       System.out.println("digite su numero de documento"); 
        documento=leer.nextInt();
       System.out.println("digite su nombre"); 
       nombre=leer.next();
       System.out.println("digite su apellido"); 
       apellido=leer.next();
       System.out.println("digite su peso en kg"); 
       peso=leer.nextInt();
       System.out.println("digite su estatura en metros"); 
       estatura=leer.nextInt();
       System.out.println("digite su edad"); 
       edad=leer.nextInt();
       System.out.println("digite su sexo"); 
       sexo=leer.next();
    
       leer.close();    
    }
    public void mostrarPersona() {
       System.out.println("sus datos son los siguientes "+tipoDoc+"\n"
                                        +"documendo "+documento+"\n"
                                        +"nombre "+nombre+" "+apellido+"\n"
                                        +"peso "+peso+"\n"
                                        +"estatura "+estatura+" '\n"
                                        +"edad "+edad+"\n"
                                        +"sexo "+sexo+"\n"); 
        
    }
    
    /*public void calcularImc(int peso, double estatura) {
        double imc=0;
        imc=peso/(estatura*estatura);
        if (20>=imc && imc<=25){
            System.out.println("su imc es "+imc+"el peso es ideal");
        }else if(26>imc){
            System.out.println("su imc es "+imc+"“el peso está por encima de lo ideal");
        }else if(imc>20){
            System.out.println("su imc es "+imc+"“el peso está por debajo de lo ideal");
        }
    }*/
        //metodo con parametros
    public double calcularImc(int peso, double estatura){
        double imc=0;
        imc=peso/(estatura*estatura);
        if (20>=imc && imc<=25){
            System.out.println("su imc es "+imc+" el peso es ideal");
        }else if(26>imc){
            System.out.println("su imc es "+imc+"“ el peso está por encima de lo ideal");
        }else if(imc>20){
            System.out.println("su imc es "+imc+"“ el peso está por debajo de lo ideal");
        }
        return imc;
    }
        //metodo con retorno
    public void mayorEdad(int edad){
        if(edad>=18){
            System.out.println("usted es mayor de edad");
        }else{
            System.out.println("usted es menor de edad");
        }

    }
    
}
