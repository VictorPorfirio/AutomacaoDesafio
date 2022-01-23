package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Elementos;
import PageObjects.DSL;
 

public class TesteDeletarCadastro {
	private static DSL page;
	 
@Test
	public  void DeletarCadastro() {
		page.SetAbrirsite();
		page.SetPesquisarPorNome("Victor");
		page.SetSelecionar1Registro();
		page.SetDeleteResgistro();
		page.SetConfirmarExclusao();
 
	}
	 
	
}
