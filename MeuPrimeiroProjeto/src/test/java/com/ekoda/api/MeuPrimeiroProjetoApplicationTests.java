package com.ekoda.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MeuPrimeiroProjetoApplicationTests {


	@Test
	void contextLoads() {
	}
	
	@Value ( "${paginacao.qtd_por_pagina}" )
	private int qtdPorPagina ;
	

	//@ActiveProfiles('test')
	
	//String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
	//boolean senhaValida = SenhaUtils.senhaValida("123456",senhaEncoded);
	
	
}
