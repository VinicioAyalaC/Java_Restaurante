package practicas.java;

public class TestRestaurante {

	public static void main(String[] args) {
		
		
		//----------------------------------------
		Restaurante rest1 = new Restaurante();		
		
		rest1.nombre = "EL BOLON DE TERE";
		rest1.direccion = "Av. Hermano Miguel 99-108, Guayaquil";
		rest1.calificacion = 4.7f;   // Requiere la letra 'f' al final
		
		System.out.println("Restaurante 1 ------------------------------");
		System.out.println("NOMBRE COMERCIAL:     " + rest1.nombre);
		System.out.println("DIRECCION:            " + rest1.direccion);
		System.out.println("CALIFICACION MAX 5PT: " + rest1.calificacion);
		
		
		
		System.out.println("\n");		
		//----------------------------------------
		Restaurante rest2 = new Restaurante();
		
		rest2.nombre = "EL HORNERO";
		rest2.direccion = "Av. Geovanny Calles N70-55, Quito Carapungo";
		rest2.calificacion = 4.5f;   // Requiere la letra 'f' al final
		
		System.out.println("Restaurante 2 ------------------------------");
		System.out.println("NOMBRE COMERCIAL:     " + rest2.nombre);
		System.out.println("DIRECCION:            " + rest2.direccion);
		System.out.println("CALIFICACION MAX 5PT: " + rest2.calificacion);
		

		
		
	}

}
