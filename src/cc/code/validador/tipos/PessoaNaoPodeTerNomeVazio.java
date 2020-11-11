package cc.code.validador.tipos;

import cc.code.Pessoa;
import cc.code.validador.RegrasValidacao;

public class PessoaNaoPodeTerNomeVazio implements RegrasValidacao {
	private Pessoa pessoa;

	public PessoaNaoPodeTerNomeVazio(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public boolean valida() {
		return !pessoa.getNome().isEmpty();
	}

	@Override
	public String getMensagemErro() {
		return "Nome não pode ser vazio...";
	}
}
