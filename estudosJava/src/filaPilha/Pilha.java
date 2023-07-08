package filaPilha;

public class Pilha {
    private ListaSimplesmenteEncadeada pilha;

    public Pilha() {
        pilha = new ListaSimplesmenteEncadeada();
    }

    public void Push(String i) {
        pilha.InserirInicio(i);
    }

    public String Pop() {
        String palavra = pilha.getPrimeiro();

        palavra.RetirarInicio();
        return palavra;
    }

    public String Consulta() {
        String palavra = pilha.getPrimeiro();
        return palavra;
    }
}
