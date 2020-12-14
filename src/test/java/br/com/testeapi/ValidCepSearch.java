package br.com.testeapi;

import static io.restassured.RestAssured.given;

import org.hamcrest.CoreMatchers;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.Response;

public class ValidCepSearch {
	
	
	 
	
	@Test(dataProvider = "dadosParaRegistroValido", dataProviderClass = DataSet.class)
	void verificaParametros(String chaveParametro, String valorParametro) {
		int cep = 71573003;
		String url = "https://viacep.com.br/ws/"+cep+"/json/";
		given().
		when().
			get(url).
		then().
			statusCode(200).
		and().
			body(chaveParametro, equalTo(valorParametro));
		
	}
}
