package pooHeranca;

public class Instrutor extends Pessoa{

	// Atributos
	private String especialidade;

	// Método Construtor
	public Instrutor(String nome, int idade, String email, String especialidade) {
		super(nome, idade, email);
		this.especialidade = especialidade;
	}

	// Métodos de Acesso (Get - Pega ou Mostra/ Set - Atualiza ou Processa )
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
