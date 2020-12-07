package filaestatica;

public class FilaEstaticaMain {

	public static void main(String[] args) throws Exception  {
		
		IFilaEstatica fila = new FilaEstatica(4);
		
		fila.inserir("Thales");
		fila.inserir("Ricardo");
		fila.inserir("Vitoria");
		fila.inserir("Joao");
	
		System.out.println(fila.remover());
		System.out.println(fila.remover());
		
		fila.inserir("Gabriel");
		
		
		fila.consultar();
		
		
	}

}
