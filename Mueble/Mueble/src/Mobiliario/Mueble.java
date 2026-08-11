package MObiliario;

public abstract class Mueble {
	 protected String nombre;
	 protected double x, y ,z;
	 protected int cantidadPersonas,suciedad;
	 protected Material materiall; 
	 protected Calidad calidadd;

	public Mueble (String nombre, double x, double y, double z,int cantidadPersonas,int suciedad, Material materiall, Calidad calidadd) {
		this.nombre = nombre;
		this.x = x;
		this.y = y;
		this.z = z;
		this.cantidadPersonas = cantidadPersonas;
		this.suciedad = suciedad;
		this.materiall = materiall;
		this.calidadd = calidadd;
	}
	
	public void mover(){
		 System.out.println("se movio");
	 }
	 
	 public void ensuciar(){
		 if ( suciedad >= 1) {
			 System.out.println("esta sucio");
		 }
	 }
	 
	 public void limpiar(){
		 if (suciedad == 0) {
			 System.out.println("se limpio");
		 }
	 }
	

	 public void usar(){
		 	System.out.println("se esta usando");
	 }
	 
	
	 public void asignarMaterial() {
     Material materiall = null;
     
	 switch (materiall) {
	 	case METAL:
	 		setMateriall(Material.METAL);
	 		break;
	 	case MADERA:
	 		setMateriall(Material.MADERA);
	 		break;
	 	case PLASTICO:
	 		setMateriall(Material.PLASTICO);
	 		break;
	 	}
	}
	 
	 public void asignarCalidad() {
	 Calidad calidadd = null;
     
	 switch (calidadd) {
		case BUENA:
	 		setCalidadd(Calidad.BUENA);
	 		break;
	 	case MEDIA:
	 		setCalidadd(Calidad.MEDIA);
	 		break;
	 	case MALA:
	 		setCalidadd(Calidad.MALA);
	 		break;
	 	}
	}	
	 
	 public Calidad getCalidadd() {
		return calidadd;
	}

	public void setCalidadd(Calidad calidadd) {
		this.calidadd = calidadd;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}


	public int getSuciedad() {
		return suciedad;
	}

	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Material getMateriall() {
		return materiall;
	}

	public void setMateriall(Material materiall) {
		this.materiall = materiall;
	}
}
	 
