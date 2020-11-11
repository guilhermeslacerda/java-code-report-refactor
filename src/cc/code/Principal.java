package cc.code;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		Pessoa p1 = new Pessoa("Fulano", "0033435457", 30);
		p1.adicionaFone("8765343");
		pessoas.add(p1);
		
		Pessoa p2 = new Pessoa("Sicrano", "09090033435457", 32);
		p2.adicionaFone("98923232");
		pessoas.add(p2);

		Pessoa p3 = new Pessoa("Beltrano", "09090033435457", 32);
		p3.adicionaFone("");
		pessoas.add(p3);

		FormatadorPessoas lp = new FormatadorPessoas();
		
		System.out.println(lp.getDadosFormatadados(pessoas));
		
		System.err.println(lp.getErros());
	}
}
