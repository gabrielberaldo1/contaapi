package com.db1.conta.contaapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

public class Agencia {
	
	private String numero;
	
	private String digito;
	
	private Cidade cidade;
	
	private Long id;
	
	private List<Historico> historicos = new ArrayList<Historico>();
	
	public Agencia(String numero, String digito, Cidade cidade) {
		Assert.hasText(numero, "Numero é obrigatório");
		Assert.hasText(digito, "Dígito é obrigatório");
		Assert.notNull(cidade, "Cidade é obrigatória");
		this.numero = numero;
		this.digito = digito;
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public String getDigito() {
		return digito;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public Long getId() {
		return id;
	}

}
