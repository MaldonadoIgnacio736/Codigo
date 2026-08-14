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
	
	public void usarCama() {
		public boolean siesta = false;
		System.out.println("¿Tomar una siesta o dormir?");
		if (siesta == true) {
			System.out.println("Me dormí zZzZzz");
			System.exit(0);
		} else return false;
		System.out.println("Siestita zZzZzz");
	}
}
