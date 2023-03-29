package Salud;

import java.util.Scanner;
    //se crea la subclase gracias a la funcion estends
public class Empleado extends Persona {
    //atributos
    private String cargo;
    private double valorhora;
    private int horastrabajadas;
    private String departamento;
    //metodo constructor vacio
    public Empleado(){}
    //metodo constructor con parametros iguales a los atributos con la herencia de la superClase persona
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, int peso, double estatura, int edad,
    String sexo, String cargo, double valorhora, int horastrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
    }
    //metodos accesores
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //metodos
    public void cosultarDatos() {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Digite su cargo como empleado");
        cargo=leer.next();
        System.out.println("digite sus ganancias por hora");
        valorhora=leer.nextInt();
        System.out.println("digite las horas trabajadas");
        horastrabajadas=leer.nextInt();
        System.out.println("digite el departamento en el que traba");
        departamento=leer.next();
        leer.close();
    }
    //metodo con retorno
    public double calcularHonorarios (Double valorhora, int horastrabajadas) {
        double totalPagar, reteica;
        reteica=(horastrabajadas*valorhora)*0.0966;
        totalPagar=(horastrabajadas*valorhora)-reteica;
        System.out.println("los datos del empleado son "+"cargo "+cargo+"\n"
                                                        +"valor por hora "+valorhora+"\n"
                                                        +"horas tranajadas "+horastrabajadas+"\n"
                                                        +"departamento en el cual trabaja "+departamento+"n"
                                                        +"su sueldo total es "+totalPagar);
        return totalPagar;

}
     
    }
