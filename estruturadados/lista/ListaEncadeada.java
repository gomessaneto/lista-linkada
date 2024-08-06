
package ifba.estruturadados.lista;

public class ListaEncadeada<T> {

	private No<T> inicio;
	private No<T> ultimo;
	private int tamanho = 0;
	private final int NAO_ENCONTRADO = -1;
	private final String NAO_EXISTE = "Posição não existe.";
	
			
			/////////// adicionar ///////////
			
	public void adiciona(T elemento) { //adiciona elementos 
		No <T> celula = new No<T>(elemento);
		if (this.tamanho == 0) {
			this.inicio = celula;
		} else {
			this.ultimo.setProximo(celula);
		}
		
		this.ultimo = celula;
		this.tamanho++;
	}

	public void adicionaInicio (T elemento) {
		  if (this.tamanho == 0) {
	            No<T> novoNo = new No<>(elemento);
	            this.inicio = novoNo;
	            this.ultimo = novoNo;
	        } else {
	            No<T> novoNo = new No<>(elemento, this.inicio);
	            this.inicio = novoNo;
	        }
	        this.tamanho++;
	    }
	
	public void adicionaPosicao (int posicao, T elemento) {
		
		if (posicao < 0 || posicao > this.tamanho) {
			throw new IllegalArgumentException ("Posicao Invalida");
		}
		
		if(posicao == 0) { //se ta vazia
			
			
		} else if (posicao == this.tamanho) { //apenas adiciona
			this.adiciona(elemento);
			
		} else { //no meio
				No<T> noAnterior = this.buscaNo(posicao);
	            No<T> proximoNo = noAnterior.getProximo();
	            No<T> novoNo = new No<>(elemento, proximoNo);
	            noAnterior.setProximo(novoNo);
	            this.tamanho++;
	        }
			
		///////////// busca ///////////////
		}

	 private No<T> buscaNo(int posicao) {

	        if (this.posicaoNaoExiste(posicao)) {
	            throw new IllegalArgumentException(NAO_EXISTE);
	        }

	        No<T> noAtual = this.inicio;
	        for (int i = 0; i < posicao; i++) {
	            noAtual = noAtual.getProximo();
	        }

	        return noAtual;
	    }

	    private boolean posicaoNaoExiste(int posicao) {
		// TODO Auto-generated method stub
		return false;
	}

		public T buscaPorPosicao(int posicao) {
	        return this.buscaNo(posicao).getElementoT();
	    }

	
	public int busca (T elemento) {
		
		No<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {

            if (noAtual.getElementoT().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

	/////////////// tamanho /////////////////////
	
	public int getTamanho() { //puxa o tamanho da lista
		return this.tamanho;
	}
	
	
	@Override
	public String toString() { //metodo para mostrar as informacoes da lista
		
		if (this.tamanho==0) {
			return "[]";
		}
		
		
		StringBuilder builder = new StringBuilder("[");
		No<T> atual = this.inicio;
		
		for (int i=0; i < this.tamanho-1; i++) {
			builder.append(atual.getElementoT()).append(", ");
			atual = atual.getProximo();
		}
		
		builder.append(atual.getElementoT()).append("]");
		
		return builder.toString();
	}
	 
	
	
	
}
