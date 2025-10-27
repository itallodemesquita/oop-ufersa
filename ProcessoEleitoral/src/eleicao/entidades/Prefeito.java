package eleicao.entidades;

public class Prefeito extends Politico {

    public Prefeito(String nome, Partido partido, int numeroCandidato, int totalVotos) {
        super(nome, partido, numeroCandidato, totalVotos);
    }

    public abstract String getCargo() {
        return ("Prefeito");
    }
    
}
