package MuitosPraMuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;

@Entity
@Table(name = "Filmes")
/*
@NamedQuery(name = "filmesMaiorQue", query = "SELECT f FROM Filme join fetch f.atores where f.nota > :nota")
*/
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private Double nota;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "atores_filmes",
            joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id"))
    private List<Ator>atores = new ArrayList<>();

    public Filme() {
    }

    public Filme(String nome, Double nota) {
        super();
        this.nome = nome;
        this.nota = nota;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores(){
        if (atores == null){
            atores = new ArrayList<>();
        }
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    public void adcionarAtor(Ator ator){
        if (ator != null && !getAtores().contains(ator)){
            getAtores().add(ator);
            if (!ator.getFilmes().contains(this)){
                ator.getFilmes().add(this);
            }
        }
    }
}