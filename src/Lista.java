import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

			list.add("Maria");
			list.add("Alex");
			list.add("Bob");
			list.add("Anna");
			list.add(2, "Marco"); // Inserir objeto na posicao / no caso "Marco" sera inserido na posicao 2.

			System.out.println(list.size()); // consultar o tamanho da lista.
			for (String x : list) {
				System.out.println(x);
			}  // a String x irá receber todos os itens da lista

			System.out.println("-------------------");
			// list.remove(1) ou list.remove("Alex") pode optar por remover o item pelo nome ou posicao.
			list.removeIf(x -> x.charAt(0) == 'M');
			for (String x : list) {
				System.out.println(x);
			} 

			System.out.println("-------------------");
			System.out.println("Index of Bob: " + list.indexOf("Bob") ); // para pesquisar um item na lista 
			System.out.println("Index of Marco: " + list.indexOf("Marco") ); // caso o item nao esteja na lista
			// o resultado sera -1.
			System.out.println("-------------------");

			// Como filtrar por algum parametro o itens da lista? Segue....

			List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

	// pegar o tipo list, converter para stream que aceita as operacoes de lambda, pegar o itens e depois converter com collect
			for (String x : result) { //atencao para a mudanca do nome da lista o list agora é result.
				System.out.println(x);
			} 

			// Como encontrar o elemento na lista, por exemplo o primeiro....

			System.out.println("-------------------");
			String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
			System.out.println(name); // caso procure um elemento com uma letra inexiste a resposta sera "null".
			
			
	}

	
}