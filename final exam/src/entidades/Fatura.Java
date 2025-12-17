import utilitários.utilitarios;

public class Fatura implements IImprimivel {

    void imprimir(int copias) {
        if (copias > 5) {
            print("Imprimindo "+ copias +" cópias em modo rascunho.");
            
        }
    }
}