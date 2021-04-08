package boletin1;

public class SumarMatrices {

	//int[][] matrizA = {{1,0,0},{0,1,0},{0,0,1},{0,0,0}};
	//int[][] matrizB = {{2,4,4},{6,6,9},{8,10,12}};
	
	
	/**
	 * Este método suma dos matrices y devuelve el resultado.
	 * @param matrizA
	 * @param matrizB
	 * @return suma A+B
	 * @throws Exception
	 */
	public static int[][] sumaMatriz(int[][] matrizA, int[][] matrizB) throws Exception{
		
		int[][] matrizC=new int[matrizA.length][matrizA[0].length];
		
		
		if(matrizA==null || matrizB==null || matrizA.length==0 || matrizB.length==0 || matrizA.length!=matrizB.length) {
			throw new Exception("Las matrices no tienen el mismo numero de filas");
		}else{
			
			for(int i=0; i<matrizA.length;i++) {
				if(matrizA[i].length!=matrizB[i].length) {
					throw new Exception("Las columnas no tienen el mismo tamaño");
				} 
			}
					
			
			for(int j=0;j<matrizA.length;j++) {
				for(int k=0;k<matrizA[j].length;k++) {
					matrizC[j][k]=matrizA[j][k]+matrizB[j][k];
							
							
					}
					
					
				}
				
			}
			
		return matrizC;
			
		}
		
		
		
		
		

public static String imprimirMatriz(int matriz[][]) {
	
	
	
	StringBuilder print2= new StringBuilder();
	
	
	if(matriz!=null) {
	for(int i=0;i<matriz.length;i++) {
		
		print2.append("\n [");
		
		
		
		for (int j=0;j<matriz[i].length;j++) {
			
			if(j!=matriz[i].length-1) {
				print2.append(matriz[i][j] + ", ");
			}else {
				print2.append(matriz[i][j]+"]");
			}
	}
	
	
			
	
	
}}
	return print2.toString(); 
	

}
	
	
	public static void main(String[] args) {
		int[][] matrizA = {{1,0,0},{0,0,1},{0,0,1}};
		int[][] matrizB = {{2,4,4},{6,6,4},{8,10,12}};
		int[][] matrizC=null;
		try {
			matrizC = sumaMatriz(matrizA, matrizB);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println(imprimirMatriz(matrizA));
		System.out.println(imprimirMatriz(matrizB));
		System.out.println(imprimirMatriz(matrizC));
	
		
		
	}
}

