package cc.code;

import java.util.ArrayList;
import java.util.List;

import cc.code.validador.ValidadorPessoa;

public class FormatadorPessoas {
	private StringBuilder texto;
	private List<String> erros;
	private ValidadorPessoa validador;

	public FormatadorPessoas() {
		texto = new StringBuilder();
		erros = new ArrayList<>();
	}
	
	public String getDadosFormatadados(List<Pessoa> lista){
		for (int indx = 0; indx < lista.size(); indx++) {
			Pessoa pessoa = lista.get(indx);
			List<String> erro = validaSeNaoTemErroEm(pessoa);
			
			if(!erro.isEmpty()) {
				erros.addAll(erro);
				continue;
			}
			
			adicionaInformacao(pessoa);
		}

		return texto.toString();
	}

	private List<String> validaSeNaoTemErroEm(Pessoa pessoa) {
		validador = new ValidadorPessoa(pessoa);
		validador.valida();
		List<String> erro = validador.getErros();
		return erro;
	}

	private void adicionaInformacao(Pessoa pessoa) {
		texto.append("\nNOME: " + pessoa.getNome());
		texto.append("\nCPF: " + pessoa.getCpf());
		texto.append("\nIDADE: " + pessoa.getIdade());
	}

	public List<String> getErros() {
		return erros;
	}

}

