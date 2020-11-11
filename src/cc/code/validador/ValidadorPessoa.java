package cc.code.validador;

import java.util.ArrayList;
import java.util.List;

import cc.code.Pessoa;
import cc.code.validador.tipos.FormatoTelefoneInvalido;
import cc.code.validador.tipos.ListaTelefonesNaoPodeSerVazia;
import cc.code.validador.tipos.PessoaNaoPodeSerNulo;
import cc.code.validador.tipos.PessoaNaoPodeTerNomeVazio;
import cc.code.validador.tipos.TelefoneNaoPodeSerVazio;

public class ValidadorPessoa {
	private List<String> erros;
	private List<RegrasValidacao> regras;
	private Pessoa pessoa;
	
	public ValidadorPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
		erros = new ArrayList<>();
		regras = new ArrayList<RegrasValidacao>();
		defineSequenciaRegras();
	}

	private void defineSequenciaRegras() {
		regras.add(new PessoaNaoPodeSerNulo(pessoa));
		regras.add(new PessoaNaoPodeTerNomeVazio(pessoa));
		regras.add(new ListaTelefonesNaoPodeSerVazia(pessoa));
		regras.add(new TelefoneNaoPodeSerVazio(pessoa));
		regras.add(new FormatoTelefoneInvalido(pessoa));
	}
	
	public boolean valida() {
		boolean erro = false;
		for (RegrasValidacao regra : regras) {
			if (!regra.valida())
				erros.add(regra.getMensagemErro());
		}
		
		return erro;
	}
	
	public List<String> getErros() {
		return erros;
	}
}
