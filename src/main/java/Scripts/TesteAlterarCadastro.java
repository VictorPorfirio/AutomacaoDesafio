package Scripts;

import PageObjects.Elementos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.DSL;
 
 

public class TesteAlterarCadastro {

	private static DSL page;
	 
 
@Test
	public  void AlterarDadoscliente1() {
		 page.SetAbrirsite();
		 page.SetOpcao("switch-version-select");
		 page.Setv4("//*[@id='switch-version-select']/option[4]");
		 page.SetPesquisarPorNome("Victor");
		 page.SetSelecionar1Registro();
		 page.ClicaremEditarRegistro();
		 page.SetTelefone("6193651578");
		 page.SetEscreveNomedoMeio("Monteiro");
		 page.SetEscreveUltimoNome("da Silva");
		 page.SetEndereco1("taguatinga sul");
		 page.SetEndereco2("cnb 11 conj a casa 5");
		 page.SetCidade("taguatinga");
		 page.SetCodigopostal("72115940");
		 page.SetSalvaEdicoes();
	 
	}

 

}
