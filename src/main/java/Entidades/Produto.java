package Entidades;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_produtos", length = 210, nullable = false)
    private String nome;
    @Column(name = "preco_produto", nullable = false, precision = 15, scale = 2)
    private Double preco;

    public Produto() {

    }
    public Produto(String nome, Double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
