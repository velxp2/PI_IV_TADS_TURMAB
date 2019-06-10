package br.senac.tads.airsoftware.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author victor
 */
@Entity(name = "tb_cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(nullable = false)
    private String nome;
    //@Column(nullable = false)
    private String sexo;
    //@Temporal(TemporalType.DATE)
    //@Column(updatable = false, insertable = true, nullable = false)
    private String dataNascimento;
    //@Column(unique = true, nullable = false)
    private String cpf;
    //@Column(nullable = false)
    private String logradouro;
    //@Column(nullable = false)
    private int numero;
    //@Column(nullable = false)
    private String cidade;
    //@Column(nullable = false)
    private String estado;
    //@Column(nullable = false)
    private String bairro;
    //@Column(nullable = false)
    private String cep;
    //@Column
    private String complemento;
    //@Column
    private String celular;
    //@Column(nullable = false)
    private String telefone;
    
    private String email;
    private String senha;
    private boolean admin;
    @OneToMany(mappedBy = "cliente")
    private Set<ItensCarrinho> itensCarrinho;    

    public Cliente() {
    }

    public Cliente(Long id, String nome, String sexo, String dataNascimento, String cpf, String logradouro, int numero, String cidade, String estado, String bairro, String cep, String complemento, String celular, String telefone, String email, String senha, boolean admin, Set<ItensCarrinho> itensCarrinho) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
        this.itensCarrinho = itensCarrinho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Set<ItensCarrinho> getItensCarrinho() {
        return itensCarrinho;
    }

    public void setItensCarrinho(Set<ItensCarrinho> itensCarrinho) {
        this.itensCarrinho = itensCarrinho;
    }
    
}
