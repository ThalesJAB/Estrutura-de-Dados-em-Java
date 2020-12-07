package listaduplamenteencadeada;

public class ListaDuplaEncaMain {

	public static void main(String[] args) throws Exception {
		
		
		IListaDuplaEnca lista = new ListaDuplaEncaDinamica(5);
		lista.inserirFim(10);
		lista.inserirFim(2);
		lista.inserirFim(3);
		lista.inserirFim(6);
		
		lista.remover(10);
		lista.remover(6);
		
	
		lista.imprimirLista();
		lista.tamanho();
		lista.empty();
		
	}

}
