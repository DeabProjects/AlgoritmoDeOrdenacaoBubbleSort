package principal;

public class Principal {

	public static void main(String[] args) {
   /*Algoritmo de Ordena��o Bubble Sort. Ele compara pares de valores e realiza a troca
	quando o valor da posi��o seguinte � menor que o da posi��o atual.
	*/
		//Declara��o do Vetor
		int[] nums = {5, 3, 7, 4, 2};
		//Variavel auxiliar para armazenar o valor da posi��o atual.
		int aux;
		//Variavel flag que sai do While quando o vetor esta todo ordenado.
		int resp = 1;
		//Loop que faz o vetor ser percorrido at� estar todo ordenado
		while (resp == 1) {
			resp = 0;
			//percorre o vetor
			for (int i = 0; i < nums.length - 1; i++) {
				//Compara se o numero na posi��o atual � maior que o da posi��o seguinte
				if (nums[i] > nums[i + 1]) {
					//Variavel recebe o valor da posi��o atual
					aux = nums[i];
					//posi��o atual recebe o valor menor da posi��o seguinte
					nums[i] = nums[i + 1];
					//posi��o seguinte recebe o valor que esta na variavel aux.
					nums[i + 1] = aux;
					// variavel para sair do while recebe 1
					resp = 1;		
				}
			}
		}
		//Mostrando ordenado
		for (int i = 0; i <= nums.length - 1; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
