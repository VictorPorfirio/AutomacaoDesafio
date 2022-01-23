package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DSL {

			private static Elementos dsl ;
		 
			public DSL(){
			dsl = new Elementos();

			}
		 

			public static void SetAbrirsite( ) {
				dsl.Abrirsite();
			}


			public static  void SetOpcao(String id) {
				dsl.ClicarCombo(id);
			}

			public static void Setv4(String id) {
				dsl.ClicaemV4(id);
			}

			public static void SetAdicionarRegistro(String Texto){
			dsl.AdicionarRegistro(Texto);

			}

			 
			public static void SetEscrevePrimeiroNome(String nome){
			 
				dsl.EscrevePrimeiroNome("field-customerName",nome);
			}

			public static void SetEscreveNomedoMeio(String sobrenome){
			dsl.EscreveNomedoMeio("field-contactLastName", sobrenome);
			}
			 
			public static void SetEscreveUltimoNome(String Ultimonome){
			dsl.EscreveUltimoNome("field-contactFirstName", Ultimonome);

			}
			public static void SetTelefone(String Phone){
			dsl.EscreveTelefone("field-phone", Phone);

			}

			public static void SetEndereco1(String Endereco){
			dsl.EscreveEndereco1("field-addressLine1", Endereco);

			}
			public static void SetEndereco2(String Endereco2){
			dsl.EscreveEndereco2("field-addressLine2", Endereco2);

			}
			public static void SetCidade(String cidade){
			dsl.EscreveCidade("field-city", cidade);

			}
			public static void SetEstado(String estado){
			dsl.EscreveEstado("field-state", estado);

			}

			public static void SetCodigopostal(String cep){
			dsl.EscreveCodigoPostal("field-postalCode", cep);

			}
			public static void SetPais(String pais){
			dsl.EscrevePais("field-country", pais);

			}
			public static void SetMatriculaMEmpregado(String empregados){
			dsl.EscreveMatricula("field-salesRepEmployeeNumber", empregados);

			}
			public static void SetCreditos(String Creditos){
			dsl.EscreveQuantidadeCredito("field-creditLimit", Creditos);

			}
			public static void SetClicaremsalvar(){
			dsl.ClicaemSalvar();

			}
		 
		 
			public static void SetPesquisarPorNome(String texto) {
			dsl.PesquisarPorNome(texto);	
				
			}
			public static void SetPesquisarPorEndereco(String texto) {
				dsl.PesquisarPorEndereco(texto);	
					
				}
		 
			public static void SetSelecionar1Registro() {
			dsl.SelecionaRegistro();	
				
			}
			public static void SetSelecionaTodosRegistros() {
				dsl.SelecionaTodosRegistros();	
					
				}
	 
			public static void SetDeleteResgistro() {
			dsl.DeletarRegistro();	
				
			}
			
			public static void SetConfirmarExclusao() {
				dsl.ConfirmarExclusao();	
				
				}
			
		 

			public static void SetSalvaEdicoes() {
			dsl.SalvarEdicao();	
			 
			}
			 

			public static void ClicaremEditarRegistro() {
			dsl.ClicaremEditarRegistro();	
				
			}
		 
			 
			 
 
		 
			}
			

 


 
	   
