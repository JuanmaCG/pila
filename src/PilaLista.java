import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class PilaLista extends LinkedList implements IPila{

	public PilaLista() {
		super();
	}
	
	
	@Override
	public void desapilar() {
		removeFirst();
	}

	@Override
	public void apilar(Integer elemento) {
		push(elemento);
	}


	@Override
	public void inverso() {
		Collections.reverseOrder();
	}

}
