package listaencadeadacircular;

public class ListaEncadeadaCircularMain {
	
	public static void main(String[] args) throws Exception {
		
		IListaEncadeadaCircular lista = new ListaEncadeadaCircular();
		
		
		lista.inserirInicio(10);
		lista.inserirFim(40);
		lista.inserirMeio(30);
	
		
		lista.remover(10);
		
		lista.mostrarLista();
		
		System.out.printf("\n\nlista vazia?: %s ", lista.isEmpty());
		
		System.out.printf("\n\nLista tamanho: %d", lista.tamanho());
		
		
		

		
		
	}

}
