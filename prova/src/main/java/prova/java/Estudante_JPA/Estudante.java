package prova.java.Estudante_JPA;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_aluno")
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nome_completo")
    private String nome;

    @Column (name = "email_contato")
    private String email;

    private int idade;

    public Estudante(long id, String nomeCompleto, String emailContato, int idade) {
        this.id = id;
        this.nome = nomeCompleto;
        this.email = emailContato;
        this.idade = idade;
    }

    public Estudante() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nome;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nome = nomeCompleto;
    }

    public String getEmailContato() {
        return email;
    }

    public void setEmailContato(String emailContato) {
        this.email = emailContato;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
