package listaencadeadacircular;



public class ListaEncadeadaCircular implements IListaEncadeadaCircular {
	
	
	class No{
		private int dado;
		private No proximo;
	}
	
	private No primeiro;
	private No ultimo;
	private int tamanho = 0;
	
	public ListaEncadeadaCircular() {
		primeiro = null;
		ultimo = null;
	}
	
	public void inserirFim(int valor) {
		No novo = new No();
		novo.dado = valor;
		if (primeiro == null) {
			primeiro = novo;
			ultimo = primeiro;
			primeiro.proximo = ultimo;
		}
		else {
			ultimo.proximo = novo;
			novo.proximo = primeiro;
			ultimo = novo;
		}
		tamanho++;
	}
	
	public void inserirInicio(int valor) {
		No novo = new No();
		novo.dado = valor;
		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
			novo.proximo = primeiro;
		}
		else {
			No aux = primeiro;
			novo.proximo = aux;
			primeiro = novo;
			ultimo.proximo = primeiro;
		}
		tamanho++;
	}
	
	public void inserirMeio(int valor) {
		No novo = new No();
		novo.dado = valor;
		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
			novo.proximo = primeiro;
		}
		else {
			No aux, atual;
			int count = 0;
			if(tamanho % 2 == 0) {
				count = tamanho/2;
				
			}else if(tamanho % 2 == 1) {
				count = (tamanho+1)/2;
			}
			aux = primeiro;
			atual = null;
			for(int i = 0; i < count;i++) {
				atual = aux;
				aux = aux.proximo;
			}
			
			atual.proximo = novo;
			novo.proximo = aux;
			
		}
		tamanho++;
	}
	
	
	public void mostrarLista() {
		No atual = new No();
		atual = primeiro;
		do {
			System.out.printf("[%d], ",atual.dado);
			atual = atual.proximo;
		}while(atual != primeiro);
	}
	
	public void buscar(int valor) {
		No atual = new No();
		atual = primeiro;
		boolean encontrado = false;
		do {
			if (atual.dado == valor) {
				encontrado = true;
			}
			atual = atual.proximo;
		}while(atual != primeiro);
		
		if (encontrado == true) {
			System.out.println("Valor encontrado");
		} else {
			System.out.println("Valor não encontrado.");
		}
	}
	
	
	public void remover(int valor) {
		No atual = new No();
		No anterior = new No();
		atual = primeiro;
		anterior = ultimo;
		
		do {
			if (atual.dado == valor) {
				if(atual == primeiro) {
					primeiro = primeiro.proximo;
					ultimo.proximo = primeiro;
				}
				else if (atual == ultimo) {
					anterior.proximo = ultimo.proximo;
					ultimo = anterior;
				}
				else if (atual == primeiro && primeiro == ultimo) {
					primeiro = null;
					ultimo = null;
					anterior = null;
				}
				else {
					anterior.proximo = atual.proximo;
				}
			}
			
			anterior = atual;
			atual = atual.proximo;
		}while(atual != primeiro);
		tamanho--;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public boolean isEmpty() {
		return primeiro == null;
	}

	
}
