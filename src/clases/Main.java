

package clases;

/**
 * Clase que comprueba las clases
 * @author anaru
 */
public class Main {
   
    /**
     * Es un metodo que muestra por pantalla 
     * @param args
     */
    public static void main(String[] args) {
		Asalariado juan = new Asalariado("Juan", "Gómez", "11111111A", 800.00);
	        PorHoras carolina = new PorHoras("Carolina", "Marín", "22222222B", 16.75, 40);
	        AComision marcos = new AComision("Marcos", "Guerra", "33333333C", 0.06, 10000.00);
	       BaseConComision roberto = new BaseConComision ("Roberto","Jiménez","44444444D",0.04,5000,300);

	        System.out.println("EMPLEADOS PROCESADOS INDIVIDUALMENTE");
	        System.out.println("------------------------------------");
	        System.out.println(juan.toString());
	        System.out.println(carolina.toString());
	        System.out.println(marcos.toString());
	        System.out.println(roberto.toString());
	        
	        
	        
	        System.out.println("EMPLEADOS PROCESADOS CON POLIMORFISMO");
	        System.out.println("------------------------------------");
                 Empleado empleado;
                empleado = new Asalariado("Juan", "Gómez", "11111111A", 800.00);
                System.out.println(empleado.toString());

                empleado = new PorHoras("Carolina", "Marín", "22222222B", 16.75, 40);
                System.out.println(empleado.toString());

                empleado  = new AComision("Marcos", "Guerra", "33333333C", 0.06, 10000.00);
                 System.out.println(empleado.toString());

                empleado = new BaseConComision ("Roberto","Jiménez","44444444D",0.04,5000,300);
                System.out.println(empleado.toString());

                
                  System.out.println("Empleado 0 es del tipo:"+juan.getClass());
                  System.out.println("Empleado 1 es del tipo:"+ carolina.getClass());
                  System.out.println("Empleado 2 es del tipo:"+marcos.getClass());
                  System.out.println("Empleado 3 es del tipo:"+roberto.getClass());
               
	    }
	
 // es una muestra de git

	}
