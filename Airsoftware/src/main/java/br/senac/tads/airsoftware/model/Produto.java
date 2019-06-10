package br.senac.tads.airsoftware.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author victor
 */
@Entity(name = "tb_produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(nullable = false)
    private String nome;
    //@Column(precision = 6, scale = 2, nullable = false)
    private int precoCompra;
    //@Column(precision = 6, scale = 2, nullable = false)
    private int precoVenda;
    //@Column(nullable = false)
    private String descricao;
    //@Column(nullable = false)
    private String informacoes;
    //@Column(nullable = false)
    private int quantidade;
    private String categoria;
    private String imagem;
    @ManyToMany(mappedBy = "produtos", fetch = FetchType.LAZY)
    private Set<ItensCarrinho> itensCarrinho;

    public Produto() {
    }

    public Produto(Long id, String nome, int precoCompra, int precoVenda, String descricao, String informacoes, int quantidade, String categoria, String imagem, Set<ItensCarrinho> itensCarrinho) {
        this.id = id;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.descricao = descricao;
        this.informacoes = informacoes;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.imagem = imagem;
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

    public int getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(int precoCompra) {
        this.precoCompra = precoCompra;
    }

    public int getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(int precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Set<ItensCarrinho> getItensCarrinho() {
        return itensCarrinho;
    }

    public void setItensCarrinho(Set<ItensCarrinho> itensCarrinho) {
        this.itensCarrinho = itensCarrinho;
    }

    
    
}
