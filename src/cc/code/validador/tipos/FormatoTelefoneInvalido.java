package cc.code.validador.tipos;

import cc.code.Pessoa;
import cc.code.validador.RegrasValidacao;

public class FormatoTelefoneInvalido implements RegrasValidacao {
	private Pessoa pessoa;

	public FormatoTelefoneInvalido(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public boolean valida() {
		for (String fone : pessoa.listaTelefones()) 
			if (fone.length() < 7) 	return false;
		return true;
	}

	@Override
	public String getMensagemErro() {
		return "Telefone está com formato inválido...";
	}

}
