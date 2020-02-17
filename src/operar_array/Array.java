package operar_array;

import javax.swing.JOptionPane;

public class Array {

	int array[] = new int [10];
	
	/**
	 * 
	 */
	private void rellenar_array_del_1_al_20() {
		crearArrayNumerosAzar(10, 20, 1);
	}
	
	/**
	 * Rellenar array
	 */
	private static void rellenar_array() {
		int array[] = new int [10];
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
	public static void imprimirArray (int [] array) {

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
	
	/**
	 * Suma los elementos del array
	 */
	public static void   sumarElementosArray() {
		int array[] = new int [10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		long suma=0;
        for ( int i = 0; i < array.length; i++) {
            suma+=array[i];
            System.out.println("La suma es: " + suma);
        }
        
        
	}
	
	/**
	 * Pedir n�mero al usuario
	 */
	public static void nuevoMetodo1 () {

			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduza un n�mero entero"));
			System.out.println("El n�mero introducido es: " + num);
		
	}
	
	public static void main(String[] args) {
		
		sumarElementosArray();
		
		

	}
	
	private static void nuria() {
		int array[]= new int[10];
		for (int i=0; i<array.length; i++) {
			array[i]=(int)Math.round(Math.random()*20);
						
		}
	}

}
