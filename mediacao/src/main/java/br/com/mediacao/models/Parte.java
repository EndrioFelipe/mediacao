package br.com.mediacao.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Parte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Nome;
	private String Orgaos;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data;
	private String nacionalidade;
	private String naturalidade;
	private String ocupacao;
	private BigDecimal renda;
	private String rg;
	private String cpf;
	private String filiacao;
	private String email;
	private String endereco;
	private String cep;
	
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getOrgaos() {
		return Orgaos;
	}
	public void setOrgaos(String orgaos) {
		Orgaos = orgaos;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public BigDecimal getRenda() {
		return renda;
	}
	public void setRenda(BigDecimal renda) {
		this.renda = renda;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "Parte [id=" + id + ", Nome=" + Nome + ", Orgaos=" + Orgaos + ", data=" + data + ", nacionalidade="
				+ nacionalidade + ", naturalidade=" + naturalidade + ", ocupacao=" + ocupacao + ", renda=" + renda
				+ ", rg=" + rg + ", cpf=" + cpf + ", filiacao=" + filiacao + ", email=" + email + ", endereco="
				+ endereco + ", cep=" + cep + "]";
	}
	
	
	

    
}
