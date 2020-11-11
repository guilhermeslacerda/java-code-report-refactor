package cc.code.validador.tipos;

import cc.code.Pessoa;
import cc.code.validador.RegrasValidacao;

public class PessoaNaoPodeSerNulo implements RegrasValidacao {
	private Pessoa pessoa;

	public PessoaNaoPodeSerNulo(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public boolean valida() {
		return pessoa != null;
	}

	@Override
	public String getMensagemErro() {
		return "Pessoa precisa ser inicializada...";
	}
}
