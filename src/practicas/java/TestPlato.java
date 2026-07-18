package practicas.java;

public class TestPlato {

	public static void main(String[] args) {
		
		
		//------------------------------------------------------------
		Plato platoA = new Plato();
		
		platoA.nombre = "Ensalada César";
		platoA.tipo   = "Entrada";
	    platoA.precio = 6.50f;
		platoA.disponibilidad = true;
		
		System.out.println("PLATO A ------------------------------");
		System.out.println("NOMBRE:         " + platoA.nombre);
		System.out.println("TIPO:           " + platoA.tipo);
		System.out.println("PRECIO:         " + platoA.precio);
		System.out.println("DISPONIBILIDAD: " + platoA.disponibilidad);
		
		System.out.println("\n");		
		
		
		//------------------------------------------------------------
		Plato platoB = new Plato();
		
		platoB.nombre = "Lomo a la Plancha";
		platoB.tipo   = "Plato fuerte";
	    platoB.precio = 12.75f;
		platoB.disponibilidad = true;
		
		System.out.println("PLATO B ------------------------------");
		System.out.println("NOMBRE:         " + platoB.nombre);
		System.out.println("TIPO:           " + platoB.tipo);
		System.out.println("PRECIO:         " + platoB.precio);
		System.out.println("DISPONIBILIDAD: " + platoB.disponibilidad);
		
		System.out.println("\n");		
		
		
		//------------------------------------------------------------
		Plato platoC = new Plato();
		
		platoC.nombre = "Cheesecake de Fresa";
		platoC.tipo   = "Postre";
	    platoC.precio = 4.25f;
		platoC.disponibilidad = true;
		
		System.out.println("PLATO C ------------------------------");
		System.out.println("NOMBRE:         " + platoC.nombre);
		System.out.println("TIPO:           " + platoC.tipo);
		System.out.println("PRECIO:         " + platoC.precio);
		System.out.println("DISPONIBILIDAD: " + platoC.disponibilidad);
		

	}

}
