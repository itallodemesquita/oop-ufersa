package eleicao.entidades;

public class Partidos {

    private String nome;
    private String sigla;

    // Inicializando construtores
    public Partido (String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    // Métodos getters
    public String getNome() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }
    
}
