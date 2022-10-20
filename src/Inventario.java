import java.io.*;
import java.util.ArrayList;

public class Inventario {
	private static ArrayList<Producto> listaProductos;
	private static  String ficheroInventario ="productos.txt";
	private static Inventario single;
	
	private Inventario() {
		listaProductos = new ArrayList<Producto>();
	}
	public static Inventario getInstance() {
		if(single == null) 
			single = new Inventario();
		return single;
	}
	public static void cargarProductos() {
		try{
			File archivo = new File(ficheroInventario);
			FileReader fr = new FileReader (archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea = br.readLine()) != null) {
				String[] datos = linea.split(" ");
				switch(datos[datos.length - 1]) {
				case "Bebida":
					Bebida bebida = new Bebida(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3]), Double.parseDouble(datos[4]), datos[5], datos[6]);
					listaProductos.add(bebida);
					break;
				case "FrutaHortaliza":
					FrutaHortaliza frutaHortaliza = new FrutaHortaliza(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3]), Double.parseDouble(datos[4]), datos[5], datos[6]);
					listaProductos.add(frutaHortaliza);
					break;
				case "Herramienta" :
					Herramienta herramienta = new Herramienta(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3]), Double.parseDouble(datos[4]));
					listaProductos.add(herramienta);
					break;
				case "Lacteo" :
					Lacteo lacteo = new Lacteo(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3]), Double.parseDouble(datos[4]), datos[5], datos[6]);
					listaProductos.add(lacteo);
					break;
				case "Otros" :
					Otros otros = new Otros(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3]), Double.parseDouble(datos[4]), datos[5]);
					listaProductos.add(otros);
					break;
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void guardarProductos() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroInventario));
			listaProductos.forEach(producto -> {	
				try {
					bw.write(producto.volcar() + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			bw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
	}
	public static void addNuevoProducto(Producto tipo) {
		tipo.setCodigo(listaProductos.size() + 1);
		System.out.println(listaProductos.size());
		listaProductos.add(tipo);
		System.out.println(listaProductos.size());
	}
	public static void mostrarProductos() {
		listaProductos.forEach(producto -> {
			producto.imprimir();
		});
	}
	public static  Producto getProducto(int id) {
		return listaProductos.get(id - 1);
	}
	public void actualizarCantidad(int codigo, int cantidad) {
		listaProductos.get(codigo).setCantidad(cantidad);
	}
	public static int tamaño() {
		return listaProductos.size();
	}
	public static void mostrarProductosEnviables() {
		listaProductos.forEach(producto -> {
			if(producto instanceof Enviable)
			producto.imprimirEnvio();

		});
	}
	public void eliminarProducto(int id) {
		listaProductos.remove(id);
	}
}
