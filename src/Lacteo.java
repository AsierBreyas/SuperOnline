
import java.util.Scanner;

public class Lacteo extends Perecedero{
	private String lote;
	private double valor_iva = 0.04;
	
	Lacteo(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad, String lote){
		super(codigo, nombre, precio, cantidad, peso, fechacad);
		super.setIva(valor_iva);
		this.lote = lote;
	}
	
	Lacteo(Scanner in){
		super(in);
		super.setIva(valor_iva);
		System.out.println("A que lote pertenece origen:");
		lote = in.nextLine();
	}
	
	public String volcar() {
		return super.volcar() + lote + " Lacteo";
	}
	
	public boolean envioFragil() {
		return false;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.printf("\n\t- Producto Lacteo \n\t- Lote: %s", lote);
		}
	}
