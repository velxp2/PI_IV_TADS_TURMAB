package br.senac.tads.airsoftware.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author victo
 */
@Entity (name = "tb_venda")
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal valor;
    @Column(nullable = false, insertable = true, updatable = false)
    private LocalDateTime dataVenda;
    @Column(nullable = false)
    private String statusVenda;
    @OneToMany(mappedBy = "venda", fetch = FetchType.LAZY)
    private Set<ItensCarrinho> itensCarrinho;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    

    public Venda() {
    }

    public Venda(Long id, BigDecimal valor, LocalDateTime dataVenda, String statusVenda, Set<ItensCarrinho> itensCarrinho, Cliente cliente) {
        this.id = id;
        this.valor = valor;
        this.dataVenda = dataVenda;
        this.statusVenda = statusVenda;
        this.itensCarrinho = itensCarrinho;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(String statusVenda) {
        this.statusVenda = statusVenda;
    }

    public Set<ItensCarrinho> getItensCarrinho() {
        return itensCarrinho;
    }

    public void setItensCarrinho(Set<ItensCarrinho> itensCarrinho) {
        this.itensCarrinho = itensCarrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
