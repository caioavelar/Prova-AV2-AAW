package br.newtonpaiva.av2.microempresa.api;

import java.time.LocalDateTime;

import br.newtonpaiva.av2.microempresa.domain.MicroEmpresa;

public class MicroEmpresaDto {

	private String id;
	private String nome;
	private String cnpj;
	private String email;
	private LocalDateTime dataDeCadastro;

	public MicroEmpresaDto() {
	}

	public MicroEmpresaDto(String id, String nome, String cnpj, String email, LocalDateTime dataDeCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.dataDeCadastro = dataDeCadastro;
	}

	public MicroEmpresaDto(MicroEmpresa microEmpresa) {
		this.id = microEmpresa.getId();
		this.nome = microEmpresa.getNome();
		this.cnpj = microEmpresa.getCnpj();
		this.email = microEmpresa.getEmail();
		this.dataDeCadastro = microEmpresa.getDataDeCadastro();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

}
