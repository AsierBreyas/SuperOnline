
import java.util.Scanner;

public class Bebida extends Perecedero{
	private String graduacion;
	private double valor_iva = 0.16;
	
	Bebida(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad, String graduacion){
		super(codigo, nombre, precio, cantidad, peso, fechacad);
		super.setIva(valor_iva);
		this.graduacion = graduacion;
	}
	Bebida(Scanner in){
		super(in);
		super.setIva(valor_iva);
		System.out.println("Que graduacion tiene:");
		graduacion = in.nextLine();
	}
	public void imprimir() {
		super.imprimir();
		System.out.printf("\n\t- Graduacion: %s", graduacion);
		
	}
	public String volcar() {
		return super.volcar() + graduacion + " Bebida";
	}
	public boolean envioFragil() {
		return false;
	}
}
