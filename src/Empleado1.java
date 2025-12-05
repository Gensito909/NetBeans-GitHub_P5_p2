/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 * @version 1.0
 */
public class Empleado1 {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    /**
     * Si edad es mayor a 40 y la comprobación del nombre es True
     * @param sueldoPlus cantidad adicional sumada al salario
     * @return aumento es verdadero en caso de sumar salario y falso en caso contrario
     */
    //Metodos publicos
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }
    /**
     * Constructor Vacio
     * Comprobara si el nombre es valido
     * @return true si el nombre esta vacio y false en caso de poner algo
     */

    //Metodos privados
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }

    //Constructores
    public Empleado1() {
        this("", "", 0, 0);
    }
    
    /**
     * Constructor con parametros
     * @param nombre el nombre del empleado
     * @param apellido el apelldo del empleado
     * @param edad la edad del empleado
     * @param salario el salario del empleado
     */
    public Empleado1(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}

