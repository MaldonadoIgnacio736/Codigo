package MObiliario;

public class Sillon extends muebleDescanso{

	public muebleDescanso m;
	public Sillon(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad, Material materiall,
			Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);
	}

	int limite = 80;
	public void romperExcesoCarga() {
		m.romperExcesoCarga();
	}
	
}
