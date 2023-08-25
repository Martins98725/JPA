package UmPraUm;

import javax.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {
    public Cliente() {
    }

    public Cliente(String nome, Assento assento) {
        super();
        this.nome = nome;
        this.assento = assento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "assento_id", unique = true)
    private Assento assento;

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

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
