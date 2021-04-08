package boletin1;

public class ConcatenarVectores {

	
	
	//Elabora un programa que concatene listas de datos en una sola variable. 
	//Por ejemplo, si recibe dos listas de tamaño 2 y 3 con los datos  [3, 2] y [5, 15, 23] 
	//devuelva una única lista de tamaño 5 con [3, 2, 5, 15, 23]
	
	
	/**
	 * Recibe dos listas y las une consecutivamente
	 * @param lista1
	 * @param lista2
	 * @return lista1+lista2
	 * @throws ExceptionNull
	 */
	public static int[] unirListas(int[] lista1, int[] lista2) throws Exception {
		int[] lista3=null;
		if(lista1==null || lista2==null) {
			throw new Exception("Algún array es null");
		}else {
		lista3= new int[lista1.length+lista2.length];
		
		for(int i=0;i<lista1.length;i++) {
			lista3[i]=lista1[i];
		}
		
		for(int j=0;j<lista2.length;j++) {
			lista3[j+lista1.length]=lista2[j];
		}}
		
		
		return lista3;
	}
	
	
	public static void main(String[] args) {
		
		
		
		int[] lista1= {1,2,8,3};
		int[] lista2= {2,0,4,5,6};
		
		
		try {
			System.out.println(Matriz.imprimirMatriz(unirListas(lista1, lista2)));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
}
