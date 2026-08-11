package MObiliario;

public class Cama extends muebleDescanso {

	public muebleDescanso m;
	public Cama(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad, Material materiall,
			Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);
	}

	int limite = 100;
	public void romperExcesoCarga() {
		m.romperExcesoCarga();
	}
}
