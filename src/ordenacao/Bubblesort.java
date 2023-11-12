package ordenacao;

public class Bubblesort {
	  public static void main(String args[]) {
	    int[] vetor = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
	    Bubblesort bs = new Bubblesort();
	    bs.ordenar(vetor);
	    
	  }
	  
	  public void ordenar(int[] vetor) {
		int tamanho = vetor.length;
	    //For que controla as vezes que o vetor vai ser percorrido
	    for(int i = 0; i < tamanho - 1; i++) {
	      //For que vai ordenar o vetor
	      for(int j = 0; j < tamanho - 1 - i; j++) {
	    	boolean teveIteracao = false;  // Variavel que verifica quando que vai ter iteração para printar o vetor
	        //Com a ajuda da variável auxiliar aux, caso o valor seja maior que o próximo do vetor, troca os dois de lugares, mudando a flag de iteracao para true
	        if(vetor[j] > vetor[j + 1]) {
	          int auxiliar = vetor[j];
	          vetor[j] = vetor[j + 1];
	          vetor[j + 1] = auxiliar;    
	          teveIteracao = true;
	        }
	        if(teveIteracao) { // caso seja true, printa o vetor.
	        	for(int num : vetor) {
	      	      System.out.print(num + " ");
	      	    }
	        	System.out.println("\n ----------------------------------------------------");
	        }
	      }
	    }
	  }
	}
