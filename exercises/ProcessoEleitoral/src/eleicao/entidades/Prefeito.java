package eleicao.entidades;

public class Prefeito extends Politico {

    public Prefeito(String nome, Partido partido, int numeroCandidato) {
        super(nome, partido, numeroCandidato);
    }

    public String getCargo() {
        return "Prefeito";
    }
    
}
