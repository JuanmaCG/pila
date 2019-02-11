
public class PilaTabla implements IPila{

	private Integer[] pila;
	public PilaTabla() {
		this.pila = new Integer[10];
	}
	
	
	
	
	/**
	 * @return the pila
	 */
	public Integer[] getPila() {
		return pila;
	}




	/**
	 * @param pila the pila to set
	 */
	public void setPila(Integer[] pila) {
		this.pila = pila;
	}




	@Override
	public void apilar(Integer elemento) {
		boolean insertado = false;
		for(int i = pila.length -1; i >= 0 && insertado == false; i--) {
			if(pila[i] == null) {
				pila[i] = elemento;
				insertado = true;
			}
		}
	}


	

	@Override
	public void desapilar() {
		boolean desapilado = false;
		for(int i = 0; i < pila.length && desapilado == false; i++) {
			if(pila[i] != null) {
				pila[i] = null;
				desapilado = true;
			}
		}
	}




	@Override
	public void inverso() {
	}
	
	




	
}
