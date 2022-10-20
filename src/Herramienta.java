
import java.util.Scanner;

public class Herramienta extends NoPerecedero implements Enviable{
	private double valor_iva = 0.4;
	
	Herramienta(int codigo, String nombre, double precio, int cantidad, double peso){
		super(codigo, nombre, precio, cantidad, peso);
		super.setIva(valor_iva);
	}
	Herramienta (Scanner in){
		super(in);
		super.setIva(valor_iva);
	}
	
	public boolean envioFragil() {
		return false;
	}
	public double tarifaEnvio() {
		return 12;
	}
	public String volcar() {
		return super.volcar() + " Herramienta";

	}
	public void imprimir() {
		super.imprimir();
		System.out.printf("\n\t- Herramienta");
	}
	public void imprimirEnvio() {
		super.imprimirEnvio();
		System.out.printf("\n\t- Tarifa de envio: %f \n\t- Precio total: %f", tarifaEnvio(), (super.getPrecio() * super.getIva()) * tarifaEnvio() );
	}
}
