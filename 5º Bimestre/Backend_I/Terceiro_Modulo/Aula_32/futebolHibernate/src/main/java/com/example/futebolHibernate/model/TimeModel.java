package com.example.futebolHibernate.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Time")
public class TimeModel {

    @Id
    @SequenceGenerator(name = "time_sequence", sequenceName = "time_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time_sequence")
    private Long id;
    private String nome;
    private String cidade;
    private String estado;

    @OneToMany(mappedBy = "timeModel", fetch = FetchType.LAZY)
    private Set<JogadorModel> jogadores = new HashSet<>();

    public TimeModel() {

    }

    public TimeModel(String nome, String cidade, String estado) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
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
}
