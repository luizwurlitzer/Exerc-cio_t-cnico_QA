package br.com.testeapi;

import org.testng.annotations.DataProvider;

public class DataSet {
	@DataProvider(name="dadosParaRegistroValido") public Object [][]
			dadosParaRegistroValido(){
			  
				Object [][] dado = new Object[10][2]; //dataset
				dado[0][0] = "cep";
				dado[0][1] = "71573-003";
				
				dado[1][0] = "logradouro";
				dado[1][1] = "Quadra 29 Conjunto C";
				
				dado[2][0] = "complemento";
				dado[2][1] = "";
				
				dado[3][0] = "bairro";
				dado[3][1] = "Paranoá";
				
				dado[4][0] = "localidade";
				dado[4][1] = "Brasília";
				
				dado[5][0] = "uf";
				dado[5][1] = "DF";
				
				dado[6][0] = "ibge";
				dado[6][1] = "5300108";
				
				dado[7][0] = "gia";
				dado[7][1] = "";
				
				dado[8][0] = "ddd";
				dado[8][1] = "61";
				
				dado[9][0] = "siafi";
				dado[9][1] = "9701";
			  
				return dado; 
			 }
	
	@DataProvider(name="dadosParaRegistroInvalido") public Object [][]
			dadosParaRegistroInvalido(){
			  
				Object [][] dado = new Object[2][2]; //dataset
				dado[0][0] = "cep";
				dado[0][1] = "71573-003";
				
				dado[1][0] = "logradouro";
				dado[1][1] = "Quadra 29 Conjunto C";
			
			  
				return dado; 
			 }
	
}
