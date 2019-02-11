import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		PilaTabla pila1 = new PilaTabla();
		
//		pila1.apilar(1);
//		pila1.apilar(2);
//		pila1.apilar(21);
//		pila1.apilar(4);
//		pila1.apilar(5);
//		System.out.println(Arrays.toString(pila1.getPila()));
//		pila1.desapilar();
//		System.out.println(Arrays.toString(pila1.getPila()));
//		pila1.desapilar();
//		System.out.println(Arrays.toString(pila1.getPila()));
//		pila1.desapilar();
//		System.out.println(Arrays.toString(pila1.getPila()));
		
		PilaLista pila2 = new PilaLista();
		pila2.add(2);
		pila2.add(3);
		pila2.add(5);
		pila2.add(1);
		pila2.add(65);
		System.out.println(pila2.toString());
		pila2.desapilar();
		System.out.println(pila2.toString());
		pila2.desapilar();
		System.out.println(pila2.toString());
		pila2.desapilar();
		System.out.println(pila2.toString());
		

	}

}
