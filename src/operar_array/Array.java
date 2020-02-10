package operar_array;

public class Array {

	int array[] = new int [10];
	
	/**
	 * 
	 */
	private void rellenar_array_del_1_al_20() {
		crearArrayNumerosAzar(10, 20, 1);
	}
	
	/**
	 * Rellevar array
	 */
	private void rellenar_array() {
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	
	/**
	 * Rellenar array con n�meros sin repetir
	 */
	private void rellenar_array_sin_repetir() {
		int aux=0;
		boolean NumRepe=false;
		
		for (int i = 0; i < array.length; i++) {		
			aux = (int) Math.round(Math.random()*100);
			for (int j = 0; j < array.length; j++) {
				if(array[j]==aux) {
					NumRepe=true;
					break;
				}
				
			}
			if (NumRepe==true) {
				NumRepe=false;
				i--; //volver a la posici�n anterior del array
			}
			else {
				array[i]=aux;
			}
					
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	/**
	 * Mostrar array
	 * @param array
	 */
	public static void mostrarArray (int [] array) {

		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * 
	 * @param limiteInferior
	 * @param limiteSuperior
	 * @return
	 */
	public static int obtenerNumeroAleatorio(int limiteInferior, int limiteSuperior) {
		return (int) Math.round(Math.random()*(limiteSuperior-limiteInferior)+limiteInferior);
	}
	
	/**
	 * 
	 * @param longitud
	 * @param limiteSuperior
	 * @param limiteInferior
	 * @return
	 */
	public static int [] crearArrayNumerosAzar (int longitud, int limSuperior, int limInferior) {
		int array[]=new int[longitud];
		for(int i=0; i<array.length;i++) {
		array[i]=obtenerNumeroAleatorio(limInferior, limSuperior);
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		
		

	}

}