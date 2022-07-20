package classeexecutavel;

import java.util.ArrayList;
import java.util.List;

public class classeexecutavelLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List lista = new ArrayList();
		List lista2,lista3 =new ArrayList(5);
		
		for (int i = 1; i <= 10; i++) {

			lista.add(i);

		}
		lista2=new ArrayList(lista);
		System.out.println("-----------Lista2");
		for (Object j:lista2) {
		
		System.out.println(j);
			
		}
		System.out.println("Tamanho Lista 2:"+lista2.size());
		
		lista3.add(lista);
		System.out.println("-----------Lista 3");
		for (Object j : lista3) {
			
			System.out.println(j);

		}System.out.println("--------------");
		System.out.println("Tamanho Lista 3 "+lista3.size());
		lista3.addAll(lista2);
		System.out.println("-----------Depois Lista 3");
		for (Object j : lista3) {
		
			System.out.println(j);

		}	
		System.out.println("Tamanho Lista 3 "+lista3.size());


	}

}
