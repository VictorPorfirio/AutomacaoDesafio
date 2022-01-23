package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Elementos;
import PageObjects.DSL;

public class TesteInserirCadasro {
 
 	public static DSL page;
 
 
	
  		@Test	 
	 public void AdicionarCadastroCliente1() {
		 page.SetAbrirsite();
		 page.SetOpcao("switch-version-select");
		 page.Setv4("//*[@id='switch-version-select']/option[4]"); 
		 page.SetAdicionarRegistro("Add Record");
		 page.SetEscrevePrimeiroNome("Victor");
		 page.SetEscreveNomedoMeio("Matheus"); 	
		 page.SetEscreveUltimoNome("Porfirio");
		 page.SetTelefone("61994469115");
		 page.SetEndereco1("qnn 24 conj e ");
		 page.SetEndereco2("casa 20 ceilandia sul");
		 page.SetCidade("TAGUATINGA ");
		 page.SetEstado("Distrito Federal ");
		 page.SetCodigopostal("72220245");
		 page.SetPais("BRASIL ");
		 page.SetMatriculaMEmpregado("439 ");
		 page.SetCreditos("12359 ");
		 page.SetClicaremsalvar();
	 
 }
	 
 

}
