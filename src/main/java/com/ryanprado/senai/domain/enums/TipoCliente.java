package com.ryanprado.senai.domain.enums;

public enum TipoCliente {
	//Será nosso estático
	PESSOAFISICA(1, "Pessoa Fisica"), PESSOAJURIDICA(2, "Pessoa Juridica");
	
	//Nossos atributos 
	private int cod;
	private String descricao;
	//Construtor
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	//gettes
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		 throw new IllegalArgumentException("Id Inválido" + cod);
		 	
	}

}