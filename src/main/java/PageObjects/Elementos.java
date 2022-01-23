package PageObjects;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Elementos {
public WebDriver driver = new ChromeDriver();
 
// ELEMENTOS PARA ADICIONAR CADASTRO !! // 


 // abre site do projeto
	public void Abrirsite() {
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
	 }
// Clica no combo de opões tipo de 'sistemas' v3-v4 etc
	public void ClicarCombo(String id_campo) {
		
		driver.findElement(By.id(id_campo)).click();
		
	}
// Clica na OPCO V4 ! 	
	public void ClicaemV4(String id_campo) {
		
		driver.findElement(By.xpath(id_campo)).click();
	}
// Clica em "+" Adicionar um registro
public void AdicionarRegistro(String id_texto) {
	
	driver.findElement(By.linkText(id_texto)).click();
}
// limpa qualquer coisa que estiver escrito no campo e
//escreve primeiro nome no formulario.
public void EscrevePrimeiroNome(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve  nome no MEIO formulario.
public void EscreveNomedoMeio(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve  Ultimo nome no formulario.
public void EscreveUltimoNome(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve  Telefone no formulario.
public void EscreveTelefone(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve  Endereço 1 no formulario.
public void EscreveEndereco1(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve  Endereço 2 no formulario.
public void EscreveEndereco2(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve a CIDADE no formulario.
public void EscreveCidade(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve a ESTADO no formulario.
public void EscreveEstado(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve a CODIGO POSTAL no formulario.
public void EscreveCodigoPostal(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve a PAIS  no formulario.
public void EscrevePais(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve a MATRICULA  no formulario.
public void EscreveMatricula(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
//limpa qualquer coisa que estiver escrito no campo e
//escreve a Quantidade de Credito  no formulario.
public void EscreveQuantidadeCredito(String id_campo,String texto) {
	
	driver.findElement(By.id(id_campo)).clear();
	driver.findElement(By.id(id_campo)).sendKeys(texto);
}
// clicar em SALVAR e faz driver aguardar para ARMAZENAR A MENSAGEM DE SUCESSO NA ADESAO DE REGISTRO
//E FAZ A VALIDACAO DA MESMA
public void ClicaemSalvar() {
		 
	driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/form/div[16]/div/button[1]")).click();
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
//pega texto de confirmar
String comment = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div[15]/div[2]/p")).getText();

boolean condition = false;{
	//faz a comparacao se o texto esta correto
if(comment.equals("Your data has been successfully stored into the database. or") || comment.equals("Your data has been successfully stored into the database. Edit Record or Go back to list")) {
    condition = true;
}
// se certo valida registro.
Assert.assertTrue(condition);
	 }


// ELEMENTOS PARA ALTERAR CADASTROS //

// PESQUISAR POR NOME O REGISTGRO QUE DESEJA SER ALTERADO.

// clica no campo de pesquisa limpA e digita o nome a ser pesquisar
public void PesquisarPorNome(String texto) {
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[2]/td[3]/input")).clear();
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[2]/td[3]/input")).sendKeys(texto);
	// ESPERAR O SISTEMA PROCESSAR O NOME ESCOLHIDO
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

//PESQUISAR POR ENDEREÇO O REGISTGRO QUE DESEJA SER ALTERADO.
//clica no campo de pesquisa limpA e digita o nome a ser pesquisar
public void PesquisarPorEndereco(String texto) {
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[2]/td[5]/input")).clear();
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[2]/td[5]/input")).sendKeys(texto);
	// ESPERAR O SISTEMA PROCESSAR O ENDEREÇO ESCOLHIDO
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

 



//SELECIONA APENAS UM  REGISTRO DE ACORDO COM A PESQUISAR ACIMA 
public void SelecionaRegistro() {
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/tbody/tr[1]/td[1]/input")).click();
}
//SELECIONA TODOS OS REGISTROS ENCONTRADOS DE ACORDO COM A PESQUISA
public void SelecionaTodosRegistros() {
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[2]/td[1]/div/input")).click();
}

//CLINA NA OPCAOO EDITAR DO REGISTRO QUE FOI PESQUISADO.
public void ClicaremEditarRegistro() {
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/tbody/tr[1]/td[2]/div[1]/a")).click();
}

//CLICAR EM SALVAR !"UPDAE"! DEPOIS DE FAZER ALTERACOES NO CADASTRO.
 
public void SalvarEdicao() {
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div[15]/div/button[1]")).click();
}

// ELEMENTOS PARA DELETAR REGISTROS. //

//CLICA NO BOTAO DELETAR
public void DeletarRegistro() {
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/thead/tr[2]/td[2]/div[1]/a")).click();
}
// CONFIRMAR EXCLUSAO  CLICANDO NO BOTAO VERMELHO DELETE
public void ConfirmarExclusao() {
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]")).click();
}
}
 
 