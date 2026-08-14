
public abstract class Cocina extends muebleCocina{
	public Cocina(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad,
			Material materiall, Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);
	}
	
	public Horno ho;
	public Heladera h;
	public Microondas mr;
	public boolean irCocina;
	
	
	public Cocina(){
	h = new Heladera();
	ho = new Horno();
	mr = new Microondas();
	}
	
	public void elegirKHacerCocina() {
		System.out.println("Puede prender la hornalla, elegir algún alimento de la heladera o recalentar la comida");
		if (irCocina == true) {
			ho.usarHornalla();
			h.elegirComida();
			mr.usarMicroondas();
		} else return false;
		System.out.println("Te vas de la cocina");
	}
}