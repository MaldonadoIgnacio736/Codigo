package MObiliario;

public class Silla extends muebleDescanso {
	
	public Mueble mu;
	public muebleDescanso m;
	public Silla(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad, Material materiall,
			Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);

	}
	
	void mu.setCantidadPersonas(3);
	int limite = 40;
	public void romperExcesoCarga() {
		m.romperExcesoCarga();
	}
	
}
