package MObiliario;

 class Heladera extends muebleCocina {

	public Heladera(String nombre, double x, double y, double z, int cantidadPersonas, int suciedad, Material materiall,
			Calidad calidadd) {
		super(nombre, x, y, z, cantidadPersonas, suciedad, materiall, calidadd);
	}
	
	public Comida comidaa;
	
	public void elegirComida() {
	     
		Comida comidaa = null;
		
		 switch (comidaa) {
		 	case SANDWICH:
		 		setComidaa(Comida.SANDWICH);
		 		System.out.println("Comiendo sandwich ñam ñam");
		 		break;
		 	case PIZZA:
		 		setComidaa(Comida.PIZZA);
		 		System.out.println("Comiendo pizza ñam ñam");
		 		break;
		 	case NIOQUIS:
		 		setComidaa(Comida.NIOQUIS);
		 		System.out.println("Comiendo ñoquis ñam ñam");
		 		break;
		 	default:
		 		System.out.println("AL final no tengo hambre");
		 	}
		}

}
