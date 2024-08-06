package ifba.estruturadados.lista;

public class Teste {

	public static void main(String[] args) {
		adicionaNaPosicao();
	}
	
	
		public static void adicionaNaPosicao() {
			ListaEncadeada<Integer> lista = new ListaEncadeada<>();
			lista.adiciona(1);
			lista.adiciona(2);
			lista.adiciona(4);
			lista.adicionaPosicao(2, 5);
			lista.adicionaPosicao(3, 6);
			System.out.println(lista);
		}
	
		public static void adicionaNoInicio() {
			ListaEncadeada<Integer> lista = new ListaEncadeada<>();
			lista.adiciona(3);
			lista.adiciona(2);
			lista.adiciona(1);
			System.out.println(lista);
			
	 }  
	
	
		/* public static void testesIniciais() {
	        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
	        lista.adiciona(1);

	        System.out.println("Tamanho = " + lista.getTamanho());
	        System.out.println(lista);

	        lista.adiciona(2);
	        System.out.println(lista);

	        lista.adiciona(3);
	        System.out.println(lista);


	        // busca por elemento
	        System.out.println("******* busca por elemento ");
	        System.out.println(lista.busca(1));
	        System.out.println(lista.busca(2));
	        System.out.println(lista.busca(3));
	        System.out.println(lista.busca(0));

	        // busca por posição
	        System.out.println("******* busca por posição ");
	        System.out.println(lista.buscaPorPosicao(0));
	        System.out.println(lista.buscaPorPosicao(1));
	        System.out.println(lista.buscaPorPosicao(2));
	        // System.out.println(lista.buscaPorPosicao(-1));
	        // System.out.println(lista.buscaPorPosicao(4));
	    
	
}*/
}