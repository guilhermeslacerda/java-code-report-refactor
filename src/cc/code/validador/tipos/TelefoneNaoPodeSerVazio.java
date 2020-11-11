package cc.code.validador.tipos;

import cc.code.Pessoa;
import cc.code.validador.RegrasValidacao;

public class TelefoneNaoPodeSerVazio implements RegrasValidacao {
	private Pessoa pessoa;
	
	public TelefoneNaoPodeSerVazio(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public boolean valida() {
		for (String fone : pessoa.listaTelefones()) 
			if (fone.isEmpty()) 	return false;
		return true;
	}

	@Override
	public String getMensagemErro() {
		return "É necessário ter pelo menos um telefone preenchido...";
	}

}
