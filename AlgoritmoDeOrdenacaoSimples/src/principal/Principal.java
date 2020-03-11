package principal;

public class Principal {

	public static void main(String[] args) {
   /*Algoritmo de Ordenação Bubble Sort. Ele compara pares de valores e realiza a troca
	quando o valor da posição seguinte é menor que o da posição atual.
	*/
		//Declaração do Vetor
		int[] nums = {5, 3, 7, 4, 2};
		//Variavel auxiliar para armazenar o valor da posição atual.
		int aux;
		//Variavel flag que sai do While quando o vetor esta todo ordenado.
		int resp = 1;
		//Loop que faz o vetor ser percorrido até estar todo ordenado
		while (resp == 1) {
			resp = 0;
			//percorre o vetor
			for (int i = 0; i < nums.length - 1; i++) {
				//Compara se o numero na posição atual é maior que o da posição seguinte
				if (nums[i] > nums[i + 1]) {
					//Variavel recebe o valor da posição atual
					aux = nums[i];
					//posição atual recebe o valor menor da posição seguinte
					nums[i] = nums[i + 1];
					//posição seguinte recebe o valor que esta na variavel aux.
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
