package pooHeranca;

public class Estudante extends Pessoa {	// Classe Filha ou Classe Derivada de Pessoa
	
	// Atributos
    private String matricula;
    private String curso;
    
    // Método Construtor
	public Estudante(String nomeSocial, int idade, String email, String matricula, String curso) {
		super(nomeSocial, idade, email);	// super => Classe Mãe | Método Construtor da Classe Mãe
		// Pessoa(nome, idade, email)
		
		this.matricula = matricula;
		this.curso = curso;
	}
	
	// Métodos de Acesso (Get - Pega ou Mostra/ Set - Atualiza ou Processa )
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
