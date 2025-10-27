package eleicao.entidades;

import eleicao.interfaces.Candidato;

public abstract class Politico implements Candidato {

    private String nome;
    private Partido partido;
    private int numeroCandidato;
    private int totalVotos;

    // Inicializando os construtores
    public Politico (String nome, Partido partido, int numeroCandidato) {
        
        this.nome = nome;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
        this.totalVotos = 0;
    }   

    // Implementar métodos da interface
    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void receberVoto() {
    }

    public int getTotalVotos() {
        return 
    }
    
}
