package com.indracompany.treinamento.model.dto;


import com.indracompany.treinamento.model.entity.Cliente;

import lombok.Data;

@Data

public class ClienteDTO {
	
	private Long id;
	
	private String nome;
	
	private String cpf;

	
	public ClienteDTO() { }
	
	public ClienteDTO(Long id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public static ClienteDTO clienteForDTO(Cliente cliente) {
		return new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getCpf());
	}
}
