package principal;

public class ExemploGenerics<T> {
	T obg;

	public ExemploGenerics(T obg) {
		super();
		this.obg = obg;
	}

	public T getObg() {
		return obg;
	}

	public void setObg(T obg) {
		this.obg = obg;
	}
	
	public void showType() {
		System.out.println(obg.getClass().getName());
	}
	
	
}
