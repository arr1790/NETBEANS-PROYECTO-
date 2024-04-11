/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;



/**
 * Es una clase que hereda de la clase Comision
 * @author anaru
 */
public class BaseConComision extends AComision {
	private double salarioBase;

    /**
     *
     * @param nombre :Nombre del empleado
     * @param apellido :Apellido del empleado
     * @param NIF :NIF del empleado
     * @param porcentajeComision :porcentaje de la comision de las ventas 
     * @param ventasBrutas : Ventas
     * @param salarioBase : salario base del empleado
     */
    public BaseConComision(String nombre, String apellido, String NIF, double porcentajeComision, double ventasBrutas,
		double salarioBase) {
		super(nombre, apellido, NIF, porcentajeComision, ventasBrutas);
		this.salarioBase = salarioBase;
	}

    /**
     *  *Es un metodo modifica un valor.
     * @return
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     *  *Es un metodo modifica un valor.
     * @param salarioBase
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Es un metodo que implementa de la clase comision 
     * @return las ganancias que multiplica las ventas brutas por el porcentaje de comision mas el resultado de la (salario base por el incremento 10%)
     */
   
  @Override
    public double ganancias() {
	double ganancias= (super.getVentasBrutas()*super.getPorcentajeComision())+(salarioBase*110/100);//es 110 por el incremento de 10%
	return ganancias;
    }



     /**
     *Metodo que es una cadena de texto de Empleado
     * @return donde devuelve el nombre, apellido, NIF, ventas brutas,salario base,Nuevo salario mas el incremento y lo que le deben pagar
     */
    @Override
    public String toString() {
    	 return "Empleado por Comision: "+getNombre()+" " +getApellido()+"\n"
                 + "N.I.F.: "+getNIF()+"\n"
                 + "Ventas Brutas: "+super.getVentasBrutas()+"€ % comisión:"+super.getPorcentajeComision()+"\n"
                 + "Con salario Base: " +salarioBase+ "€\n"
                 +"Nuevo salario base con 10% de incremento: "+(salarioBase*110/100)+"€\n"
                 + "A pagar: "+ganancias()+"€\n"
                 + "" ; 
    }

   
}




 
