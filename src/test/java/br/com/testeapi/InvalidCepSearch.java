package br.com.testeapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class InvalidCepSearch {
	@Test(dataProvider = "dadosParaRegistroInvalido", dataProviderClass = DataSet.class)
	void Verifica_parametros(String chaveParametro, String valorParametro) {
		int cep = 70000000;
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
