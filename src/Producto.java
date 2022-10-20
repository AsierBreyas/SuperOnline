
import java.util.Scanner;

public abstract class Producto {
	private double iva;
	private int codigo;
	private String nombre;
	private double precio;
	private int cantidad;
	private double peso;
	
	Producto(int codigo, String nombre, double precio, int cantidad, double peso){
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.peso = peso;
	}
	
	Producto(Scanner in){
		System.out.println("Cual es su nombre:");
		nombre = in.nextLine();
		System.out.println("Cual es su precio:");
		precio = Double.parseDouble(in.nextLine());
		System.out.println("Cuantos productos hay:");
		cantidad = Integer.parseInt(in.nextLine());
		System.out.println("Cual es su peso:");
		peso = Double.parseDouble(in.nextLine());
	}
	
	Producto(){
		
	}
	
	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double calcularPrecioIVA() {
		return precio * (iva / 100);
	}

	public void imprimir() {
		System.out.printf("\n- Codigo: %d \n\t- Nombre: %s \n\t- Cantidad: %d \n\t- Precio: %f", codigo, nombre, cantidad, precio);
	}

	public void imprimirEnvio() {
		System.out.printf("\n- Codigo: %d \n\t- Nombre: %s \n\t- Peso: %f \n\t- IVA: %f", codigo, nombre, peso, iva);
	}

	public String volcar() {
		return codigo + " " + nombre + " " + precio + " " + cantidad + " " + peso + " ";
	}
}
