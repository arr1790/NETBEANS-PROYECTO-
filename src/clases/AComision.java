/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;



/**
 * Es una clase que hereda de Empleado
 * @author anaru
 */
public class AComision  extends Empleado{
	    private double porcentajeComision;
	    private double ventasBrutas;

    /**
     *
     * @param nombre :Nombre empleado
     * @param apellido :Apellido empleado
     * @param NIF :NIF empleado 
     * @param porcentajeComision :porcentaje de comision por las ventas
     * @param ventasBrutas :ventas brutas
     */
    public AComision(String nombre, String apellido, String NIF, double porcentajeComision, double ventasBrutas) {
	        super(nombre, apellido, NIF); 
	        this.porcentajeComision = porcentajeComision;
	        this.ventasBrutas = ventasBrutas;
	    }

    /**
     *Es un metodo asigna un valor.
     * @param porcentajeComision
     */
    public void setPorcentajeComision(double porcentajeComision) {
	        this.porcentajeComision = porcentajeComision;
	    }

    /**
     * Es un metodo asigna un valor.
     * @param ventasBrutas
     */
    public void setVentasBrutas(double ventasBrutas) {
	        this.ventasBrutas = ventasBrutas;
	    }

    /**
     *Es un metodo que permite obtener un valor , asi poder utilizar dicho valor en diferentes metodos
     * @return devuelve el porcentaje de comision de ventas
     */
    public double getPorcentajeComision() {
	        return porcentajeComision;
	    }

    /**
     *Es un metodo que permite obtener un valor , asi poder utilizar dicho valor en diferentes metodos
     * @return devuelve las ventas brutas
     */
        public double getVentasBrutas() {
	        return ventasBrutas;
	    }
	    
	

    /**
     * Es un metodo que implementa de la clase Empleado que calcula las ganancias multiplicando el porcentaje de comision por las ventas brutas.
     * @return
     */
	    @Override
	    public double ganancias() {
	        return porcentajeComision * ventasBrutas;
	    }

	  
     /**
     *Metodo que es una cadena de texto de Empleado
     * @return donde devuelve el nombre, apellido, NIF, ventas brutas,comision de ventas y lo que le deben pagar
     */
	    @Override
	    public String toString() {
	    	return "Empleado por comisión: "+getNombre()+ " " +getApellido()+"\n"
	                + "N.I.F.: "+getNIF()+"\n"
	                + "Ventas Brutas: "+ventasBrutas+"€;% comision:"+porcentajeComision+"\n"
	                + "A pagar: "+ganancias()+"€\n"
	                + " " ;
	    
	}

}


