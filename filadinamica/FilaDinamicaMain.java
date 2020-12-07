package filadinamica;

public class FilaDinamicaMain {

	public static void main(String[] args) throws Exception {
		
		IFilaDinamica fila = new FilaDinamica();
		
		fila.inserir("Thales");
		fila.inserir("Joao");
		fila.inserir("Ricardo");
		fila.inserir("Antonio");
		fila.inserir("Pedro");
		fila.inserir("Joaquim");
		
		System.out.println(fila.remover());
		System.out.println(fila.remover());
		
		fila.inserir("Matheus");
		
		fila.consulta();



	}

}
