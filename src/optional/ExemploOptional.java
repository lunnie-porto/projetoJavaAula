package optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {
		
		String[] palavras = new String[10];
		//String vetorCachorros[] = { "Boxer", "Pastor A", "Pinscher", "Husky", "Corgi" };
		
		palavras[5] = "TURMA";
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if(checaNulo.isPresent()) {  //optional, tem um objeto dentro de vc?
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}else {
			System.out.println("A palavra é nula!");
		}
		
	}

}
