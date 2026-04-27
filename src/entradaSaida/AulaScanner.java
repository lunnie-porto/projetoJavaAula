package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarando as Variaveis
		Scanner leia = new Scanner (System.in);
        String nome;
        
        //Entrada de Dados
        System.out.println("Digite o seu nome: ");
        
        //Processamento
        nome = leia.nextLine();
        
        //Saida de Dados
        System.out.println("Bom dia, " + nome); // (+) concatenar
	}

}
