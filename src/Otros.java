
import java.util.Scanner;

public class Otros extends NoPerecedero{

	private String categoria;
	private double valor_iva = 0.16;
	
	Otros(int codigo, String nombre, double precio, int cantidad, double peso, String categoria){
		super(codigo, nombre, precio, cantidad, peso);
		super.setIva(valor_iva);
		this.categoria = categoria;
	}
	
	Otros(Scanner in){
		super(in);
	}
	
	public String volcar() {
		return super.volcar() + categoria + " Otros";
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.printf("\n\t- Categoria: %s", categoria);
	}
}
