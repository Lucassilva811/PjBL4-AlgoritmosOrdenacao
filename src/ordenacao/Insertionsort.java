package ordenacao;

public class Insertionsort {
	public static void main(String args[]){
        int vetor[] = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
 
        Insertionsort is = new Insertionsort();
        is.ordenar(vetor);

    }
	
	void ordenar(int vetor[]){
        int tamanho = vetor.length;
        for (int i = 1; i < tamanho; ++i) {
        	boolean teveIteracao = false;
            int key = vetor[i];
            int j = i - 1;
 
            // move os elementos do array que são maiores que a chave(posição sendo usada na iteracao) uma posição na frente da sua atual
            while (j >= 0 && vetor[j] > key) {
            	vetor[j + 1] = vetor[j];
                j = j - 1;
                teveIteracao = true;
                
            }
            vetor[j + 1] = key; //coloca o elemento inserido na posição correta.
            
            if(teveIteracao) { // caso seja true, printa o vetor.
	        	for(int num : vetor) {
	      	      System.out.print(num + " ");
	      	    }
	        	System.out.println("\n ----------------------------------------------------");
	        }
        }
    }
}