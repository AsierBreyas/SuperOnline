
import java.util.Scanner;

public class FrutaHortaliza extends Perecedero{
	private String origen;
	private double valor_iva = 0.16;
	
	FrutaHortaliza(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad, String origen){
		super(codigo, nombre, precio, cantidad, peso, fechacad);
		super.setIva(valor_iva);
		this.origen = origen;
	}
	FrutaHortaliza (Scanner in){
		super(in);
		super.setIva(valor_iva);
		System.out.println("Cual es su origen:");
		origen = in.nextLine();
	}
	public String volcar() {
		return super.volcar()+ origen + " FrutaHortaliza";
	}
	public void imprimir() {
		super.imprimir();
		System.out.printf("\n\t- Origen: %s", origen);
	}
	public boolean envioFragil() {
		return false;
	}
	public void calculaPrecioEnvio() {
		
	}
}
