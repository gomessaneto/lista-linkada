package ifba.estruturadados.lista;

public class No <T>{
	
	private T elementoT;
	private No<T> proximo;
	
	public No(T elementoT) {
		super();
		this.elementoT = elementoT;
		this.proximo = null;
	}
	
	public No(T elementoT, No<T> proximo) {
		super();
		this.elementoT = elementoT;
		this.proximo = proximo;
	}

	public T getElementoT() {
		return elementoT;
	}
	public void setElementoT(T elementoT) {
		this.elementoT = elementoT;
	}
	public No<T> getProximo() {
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("No [elementoT=");
		builder.append(elementoT);
		builder.append(", proximo=");
		builder.append(proximo);
		builder.append("]");
		return builder.toString();
	} 
}
