/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Es una clase que hereda de la clase padre Empleado
 * @author anaru
 */
public class Asalariado extends Empleado {
    private double salarioSemanal;

    /**
     * llamamos al constructor padre de la clase empleado
     * @param nombre :Nombre empleado
     * @param apellido :Apellido empleado
     * @param NIF :NIF empleado 
     * @param salarioSemanal :Salario semanal de empleado
     */
    public Asalariado(String nombre, String apellido, String NIF, double salarioSemanal) {
    super(nombre, apellido, NIF); // Llamada al constructor de la clase Empleado
    this.salarioSemanal = salarioSemanal;
	     }

    /**
     *Es un metodo que permite obtener un valor , asi poder utilizar dicho valor en diferentes metodos
     *  Devuelve @return (salarioSemanal)
     */
    public double getSalarioSemanal() {
	         return salarioSemanal;
	     }

    /**
     *Es un metodo asigna un valor.
     * @param salarioSemanal
     */
    public void setSalarioSemanal(double salarioSemanal) {
	         this.salarioSemanal = salarioSemanal;
	    }
	 
    /**
     *Metodo que implementa de la clase Empleado (que esta definido en la clase padre Empleado)
     * @return Devuelve el salario Semanal
     */
    @Override
      public double ganancias() {
	         return salarioSemanal; // Retorna el salario semanal del empleado asalariado
	     }
	  
    /**
     *Metodo que es una cadena de texto de Empleado
     * @return donde devuelve el nombre, apellido, NIF, salario semanal, y lo que le deben pagar
     */
    @Override
     public String toString() {
	    	 return "Asalariado: "+getNombre()+" "+getApellido()+"\n"
	                 + "N.I.F.: "+getNIF()+"\n"
	                 + "Salario semanal: "+salarioSemanal+"€\n"
	                 + "A pagar:"+salarioSemanal+ "€\n"
	                 + "" ;
	     }
	  
 }