
public abstract class Habitacion extends muebleDormitorio {
	public Habitacion(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad,
			Material materiall, Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);
	}

		public Cama ca;
		public Silla s;
		public Sillon sn;
		public boolean irHabitacion;
		
		
		public Habitacion(){
		ca = new Cama();
		s = new Sulla();
		sn = new Sillon();
		}
		
		public void elegirKHacerHabitacion() {
			System.out.println("¿Desea usar la cama, silla o sillón?");
			if (irHabitacion == true) {
				ca.usarCama();
				s.usarSilla();
				sn.usarSillon();
			} else return false;
			System.out.println("Te vas de la cocina");
		}
	}
	
}
