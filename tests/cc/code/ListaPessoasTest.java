package cc.code;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ListaPessoasTest {
	private FormatadorPessoas lp;
	private ArrayList<Pessoa> pessoas;

	@Before
	public void inicializa() {
		lp = new FormatadorPessoas();
		pessoas = new ArrayList<>();
	}
	
	@Test
	public void testaListaComUmaPessoa() {
		Pessoa p = new Pessoa("Fulano", "0033435457", 30);
		p.adicionaFone("8765343");
		pessoas.add(p);
		
		assertEquals(getFulano(), lp.getDadosFormatadados(pessoas));
	}

	@Test
	public void testaListaComDuasPessoas() {
		Pessoa p1 = new Pessoa("Fulano", "0033435457", 30);
		p1.adicionaFone("8765343");
		pessoas.add(p1);
		
		Pessoa p2 = new Pessoa("Sicrano", "09090033435457", 32);
		p2.adicionaFone("98923232");
		pessoas.add(p2);

		assertEquals(getFulano() + getSicrano(), lp.getDadosFormatadados(pessoas));
	}

	@Test
	public void testaCriacaoPessoaNomeNulo() {
		Pessoa p1 = new Pessoa("", "0033435457", 30);
		p1.adicionaFone("8765343");
		pessoas.add(p1);
		
		Pessoa p2 = new Pessoa("Sicrano", "09090033435457", 32);
		p2.adicionaFone("98923232");
		pessoas.add(p2);

		assertEquals(getSicrano(), lp.getDadosFormatadados(pessoas));
	}

	@Test
	public void testaPessoaSemTelefone() {
		Pessoa p1 = new Pessoa("Fulano", "0033435457", 30);
		pessoas.add(p1);
		
		assertEquals(0, lp.getDadosFormatadados(pessoas).length());
	}

	@Test
	public void testaTelefoneVazio() {
		Pessoa p1 = new Pessoa("Fulano", "0033435457", 30);
		p1.adicionaFone("");
		pessoas.add(p1);
		
		assertEquals(0, lp.getDadosFormatadados(pessoas).length());
	}

	@Test
	public void testaTelefoneComFormatoInvalido() {
		Pessoa p1 = new Pessoa("Fulano", "0033435457", 30);
		p1.adicionaFone("2222");
		pessoas.add(p1);
		
		assertEquals(0, lp.getDadosFormatadados(pessoas).length());
	}
	
	private String getFulano() {
		return "\nNOME: Fulano\nCPF: 0033435457\nIDADE: 30";
	}

	private String getSicrano() {
		return "\nNOME: Sicrano\nCPF: 09090033435457\nIDADE: 32";
	}
}
