
import java.util.Scanner;

public abstract class NoPerecedero extends Producto{
	NoPerecedero(int codigo, String nombre, double precio, int cantidad, double peso){
		super(codigo, nombre, precio, cantidad, peso);
	}
	NoPerecedero(Scanner in){
		super(in);
	}
	public void imprimir() {
		super.imprimir();
		System.out.printf("\n\t- No Perecedero");
	}
}
