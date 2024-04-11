/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;

/**
 * Clase que hereda de la clase Empleado 
 * @author anaru
 */
public class PorHoras extends Empleado {
     private double costeHora; // 
    private double horas;

    /**
     *
     * @param nombre:Nombre del empleado
     * @param apellido :Apellido del empleado
     * @param NIF :NIF del empleado
     * @param costeHora :coste de las horas trabajadas del empleado
     * @param horas :horas trabajadas del empleado
     */
    public PorHoras(String nombre, String apellido, String NIF,double costeHora, double horas) {
        super(nombre, apellido, NIF);
        this.costeHora = costeHora;
        this.horas = horas;
    }

    /**
     * Es un metodo que permite obtener un valor , asi poder utilizar dicho valor en diferentes metodos
     * devuelve el coste de la hora @return
     */
    public double getCosteHora() {
        return costeHora;
    }

    /**
     *Es un metodo que permite obtener un valor , asi poder utilizar dicho valor en diferentes metodos
     *  Devuelve las horas trabajadas @return
     */
    public double getHoras() {
        return horas;
    }

    /**
     *Es un metodo modifica un valor.
     * @param costeHora
     */
    public void setCosteHora(double costeHora) {
        this.costeHora = costeHora;
    }

    /**
     *Es un metodo modifica un valor.
     * @param horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Es un metodo que sobreescribir de la clase  Empleado
     * @return devuelve un numero decimal que es las horas trabajadas por el coste de hora 
     */
    @Override
    public double ganancias() {
        return costeHora * horas;
    }



     /**
     *Metodo que es una cadena de texto de Empleado
     * @return donde devuelve el nombre, apellido, NIF, salario semanal, y lo que le deben pagar
     */
    @Override
    public String toString() {
       return "Empleado por horas: "+getNombre() +" "+getApellido()+"\n"
                + "N.I.F.: "+getNIF()+"\n"
                + "Salario por Horas: "+costeHora+"€;Horas trabajadas:"+horas+"\n"
                + "A pagar: "+ganancias()+"€\n"
                + "" ;
    
     
    }
}
