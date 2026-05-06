package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		//Stream
		List<String> estadosEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase()) // Operação Intermediaria (Processamento)
				.collect(Collectors.toList()); // Operação terminal (Finalização)
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream()
				.count(); // Operação Terminal
		
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculo);
		System.out.println("\nEstados Únicos: " + estadosUnicos);
		System.out.println("\nQuantidade de Estados Unicos: " + quantidadeDeEstados);
		System.out.println("\nColeção/Dados Inicial: " + estados);
	}

}
