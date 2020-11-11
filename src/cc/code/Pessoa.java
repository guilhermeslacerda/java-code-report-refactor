package cc.code;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private List<String> telefones;
	
	public Pessoa() {
		telefones = new ArrayList<String>();
	}
	
	public Pessoa(String nome, String cpf, int idade) {
		this();
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void adicionaFone(String fone) {
		telefones.add(fone);
	}
	
	public List<String> listaTelefones() {
		return telefones;
	}
}