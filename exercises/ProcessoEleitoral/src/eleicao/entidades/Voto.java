package eleicao.entidades;

public class Voto {

    Eleitor eleitor;
    int numeroCandidatoVotado;

    public Voto (Eleitor eleitor, int numeroCandidatoVotado) {
        this.eleitor = eleitor;
        this.numeroCandidatoVotado = numeroCandidatoVotado;
    }

    public int getNumeroCandidato () {
        return this.numeroCandidatoVotado;
    }
    
}
