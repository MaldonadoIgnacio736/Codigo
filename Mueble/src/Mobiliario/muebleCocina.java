package MObiliario;

public abstract class muebleCocina extends Mueble {
	public muebleCocina(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad,
			Material materiall, Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);
	}

	public int temperatura; 
	public boolean destruccion;
	
	public void cocinar() {
		System.out.println("cocinando");
	}
	
	public void romperQuemaduraElectrica(){
		 if (temperatura >= 100) {
			 System.out.println("Se rompio por quemadura eléctrica");
		 }
	}
	
	public Boolean romperDanioFisico() {
		return destruccion == true;
	}
	
	
}
