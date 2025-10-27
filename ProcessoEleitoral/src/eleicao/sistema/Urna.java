package eleicao.sistema;

import eleicao.entidades.Voto;
import eleicao.interfaces.Candidato;
import java.util.ArrayList;
import java.util.List;

public class Urna {

    // Atributos
    private List<Candidato> candidatosRegistrados;
    private List<Voto> votosComputados;

    // Construtor
    public Urna() {

        this.candidatosRegistrados = new ArrayList<>();
        this.votosComputados = new ArrayList<>();
    }

    public void registrarCandidato (Candidato novoCandidato) {

        for (Candidato candidatoExistente : this.candidatosRegistrados) {
            if (candidatoExistente.getNumeroCandidato() == novoCandidato.getNumeroCandidato()) {

                System.out.printf("ERRO: O número %d já está sendo usado pelo candidato %s. Ele não foi registrado.%n", novoCandidato.getNumeroCandidato(), candidatoExistente.getClass().getName());
                return;
            }
        }

        this.candidatosRegistrados.add(novoCandidato);

        System.out.printf("Candidato %s com o número %d registrado com sucesso!", novoCandidato.getClass().getName(), novoCandidato.getNumeroCandidato());
    }
    
    public void receberVoto(Voto voto) {

        int numeroVotado = voto.getNumeroCandidato();
        Candidato candidatoEncontrado = null;

        for (Candidato candidato : this.candidatosRegistrados) {

            if (candidato.getNumeroCandidato = numeroVotado) {
                candidatoEncontrado = candidato;
                break;
            }
        }

        if (candidatoEncontrado != null) {
            candidatoEncontrado.receberVoto();
            this.votosComputados.add(voto);

            System.out.println("Voto para " + numeroVotado + "confirmado!");
        } else {
            System.out.println("Voto nulo (candidato " + numeroVotado + ") não encontrado!");
        }

    }



    public void exibirResultados() {

    }

    public List<Candidato> getCandidatosRegistrados() {
        return this.candidatosRegistrados;
    }

}
