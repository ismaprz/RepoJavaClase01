package PrimerPaquete;



public class TP01 {

	public static void main(String[] args) {
	
	//TP la clase 01 -Ismael Perez-
		
			int numeroInicio=5, numeroFin=14;
		
		for(int i=numeroFin; i>=numeroInicio; i--) {
			System.out.println(i + "-");
			
		} 
	//int numeroInicio=5, numeroFin=14;
		
		boolean pares = false;

		while (numeroInicio<numeroFin) {
			
			

		  if (pares == true) { 	

			  System.out.println("Muestro los pares");

			if (numeroInicio %2 == 0) {

			   System.out.println(numeroInicio);

			}   

			//numeroInicio=numeroInicio+1;

			// numeroInicio++;

			numeroInicio +=1;

		  }else {

			  System.out.println("Muestro los impares");

			  if (numeroInicio %2 != 0 ) {

				  System.out.println(numeroInicio);				  

			  }

				numeroInicio +=1;

		  }                         //cierre del if	

		}//cierre del while 
		
		float ingreso=150000;
		
		int vehiculo=1,modelo=2002, inmueble=1;
		
		if(ingreso>=572386 || vehiculo>=3 && modelo>=2018 || inmueble>=3) {
	
			System.out.println("¡¡Este hogar pertenece a ingresos altos!!");
	
}
		else if(ingreso>=327078 || vehiculo<=2 || modelo<=2013 || inmueble<=2) {
			
			System.out.println("¡¡Este hogar pertenece a ingresos medios!!");   
			
}
		else if(ingreso>=163539 || vehiculo<=1 || modelo<=2003 || inmueble<=1) {
			
			System.out.println("¡¡Este hogar pertenece a ingresos bajos!!");
			
} 						
	
}
	
}	
	

		
	





	



	




