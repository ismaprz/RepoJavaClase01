package PrimerPaquete;
// public y class son palabras reservadas
public class Proyecto01 {

	public static void main(String[] args) {
		/*System.out.println("Hola mundo...!");
		System.out.print("Un gusto compartir con uds...!");
		
		// Declaraciones de variables - OPERACIONES - WHILE - FOR - IF-ELSE
		
		//int num1=10, num2=20, num3=2, suma=0, resta=0;
		
		//double num4=2.35, num5=12.5, resultadoDecimal=0;
		
		suma = num1 + num2;
		
		System.out.println("El resultado de la suma es : " + suma);
		
		resta = num3 - num2;
		
		System.out.println("El resultado de la resta es : " + resta);
		
		resultadoDecimal = num5 - num4;
		
		System.out.println("El resultado decimal  es : " + resultadoDecimal);
		
		//if(num1>num2) {
			System.out.println("El numero mayor es :" + num1);
		}
		
		else {
			//sino se cumple ejecuta lo que esta en llaves
			System.out.println("El numero es mayor o igual");
			
		}
		
		System.out.println("Esto muestra el for");
		
		for(int i=0; i<=5; i++) {
			System.out.print(i + "-");
		}*/
			
		//TP la clase 01 Ismael Perez
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
	
	

	
	
	
}
	
}


	

			
			
				
			
			
			
				
			
					
					
				
				
			
				
			
	

	

		
		



