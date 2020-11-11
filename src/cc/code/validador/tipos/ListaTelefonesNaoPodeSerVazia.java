package cc.code.validador.tipos;

import cc.code.Pessoa;
import cc.code.validador.RegrasValidacao;

public class ListaTelefonesNaoPodeSerVazia implements RegrasValidacao {
	private Pessoa pessoa;

	public ListaTelefonesNaoPodeSerVazia(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public boolean valida() {
		return !pessoa.listaTelefones().isEmpty();
	}

	@Override
	public String getMensagemErro() {
		return "Lista de telefones não pode ser vazia...";
	}

}
