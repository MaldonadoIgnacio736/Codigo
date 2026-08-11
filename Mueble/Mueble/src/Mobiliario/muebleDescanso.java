package MObiliario;

public abstract class muebleDescanso extends Mueble {
	
	public muebleDescanso(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad,
			Material materiall, Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);
	}

	protected int carga, limite;
	protected Comodidad comodidadd;
	
	
	public Boolean proteccionFrio() {
		return true;
	}
	
	public void romperExcesoCarga(){
		 if (carga >= limite) {
			 System.out.println("Se rompio por exceso de carga");
		 }
	}
	
	 public void asignarComodidad() {
	     Comodidad comodidadd = null;
	     
		 switch (comodidadd) {
		 	case RELAJACION:
		 		setComodidadd(Comodidad.RELAJACION);
		 		break;
		 	case CALMA:
		 		setComodidadd(Comodidad.CALMA);
		 		break;
		 	case REPOSO:
		 		setComodidadd(Comodidad.REPOSO);
		 		break;
		 	}
	 }

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public Comodidad getComodidadd() {
		return comodidadd;
	}

	public void setComodidadd(Comodidad comodidadd) {
		this.comodidadd = comodidadd;
	}
	 
	 
}
		 
