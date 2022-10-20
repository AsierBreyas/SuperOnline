
import java.util.Scanner;

public abstract class Perecedero extends Producto implements Enviable{
	
	private String fechacad;
	
	Perecedero(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad){
		super(codigo, nombre, precio, cantidad, peso);
		this.fechacad = fechacad;
	}
	
	Perecedero(Scanner in){
		super(in);
		System.out.println("Fecha de caducidad:");
		fechacad = in.nextLine();
	}
	
	public double tarifaEnvio() {
		return 0;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.printf("\n\t- Fecha caducidad: %s", fechacad);
	}
	
	public String volcar() {
		return super.volcar() + fechacad + " ";
	}
	//To Do
	public void imprimirEnvio() {
		super.imprimirEnvio();
		System.out.printf("\n\t- Tarifa de envio: %f \n\t- Precio total: %f", tarifaEnvio(), (super.getPrecio() * super.getIva()) * tarifaEnvio() );
	}
	
	public boolean envioFragil() {
		return false;
	}
}
