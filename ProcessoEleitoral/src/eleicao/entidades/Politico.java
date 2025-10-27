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
        this.totalVotos++;
    }

    public int getTotalVotos() {
        return this.totalVotos;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Número: %d%n", this.numeroCandidato);
        System.out.printf("Partido: %s (%s)%n", this.partido.getNome(), this.partido.getSigla());
        System.out.printf("Total de Votos: %d%n", this.totalVotos);
        System.out.println("Cargo: " + getCargo());
    }

    public abstract String getCargo();
    
}
