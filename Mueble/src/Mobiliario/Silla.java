package MObiliario;

import javax.print.attribute.SetOfIntegerSyntax;

public class Silla extends muebleDescanso {
	
	public Mueble mu;
	public muebleDescanso m;
	public Silla(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad, Material materiall,
			Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);

	}
	
	int limite = 40;
	public void romperExcesoCarga() {
		m.romperExcesoCarga();
	}
	
	public void usarSilla() {
		System.out.println("Me senté");
	}
}
