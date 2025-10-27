package eleicao.entidades;

public class Vereador extends Politico {

    public Vereador (String nome, Partido partido, int numeroCandidato, int totalVotos) {
        super(nome, partido, numeroCandidato, totalVotos);
    }

    public abstract String getCargo() {
        return ("Vereador");
    }
    

}