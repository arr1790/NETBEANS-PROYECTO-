/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 * Es una clase abstracta para un conjunto de clases que van a heredar de ella 
 * @author anaru
 */
public abstract class Empleado {

private String nombre; //para el nombre del empleado
private String apellido;// para el nif del empleado
private String NIF ;// para el apellido del empleado
		     
    /**
     *Constructor parametrizado para inicializar los campos del objeto empleado
     * @param nombre :Nombre empleado
     * @param apellido :Apellido empleado
     * @param NIF :NIF empleado
     */
    public Empleado(String nombre, String apellido, String NIF) { // constructor parametrizado para inicializar 
     this.nombre = nombre;
     this.apellido = apellido;
       this.NIF = NIF;
		       
   }
 //quiero añadir esto
    /**
     * Es un metodo que permite obtener un valor , asi poder utilizar dicho valor en diferentes metodos
     * que devuelve @return (nombre)
     */
    public String getNombre() {
     return nombre;
 }

    /**
     *Es un metodo que permite obtener un valor , asi poder utilizar dicho valor en diferentes metodos
     *  que devuelve @return (NIF)
     */
    public String getNIF() {
   return NIF;
  }

    /**
     *Es un metodo que permite obtener un valor , asi poder utilizar dicho valor en diferentes metodos
     * Que devuelve @return (apellido)
     */
    public String getApellido() {
    return apellido;
}
		    
    /**
     * Es un metodo abstrato que despues sera implementado por las subclases
     * @return
     */
    public abstract  double ganancias();
		    
}

    
