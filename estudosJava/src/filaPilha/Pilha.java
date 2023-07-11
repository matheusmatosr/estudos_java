package filaPilha;

public class Pilha {

    private listaSimplesmenteEncadeada lista;

    // construtor
    public Pilha() {
        lista = new listaSimplesmenteEncadedada();
    }

    // inserir
    public void Push(No atual) {
        lista.inserePosicao(atual, 0);
    }

    // remover
    public void Pop(No atual) {
        No atual = lista.getNo();
        if (atual != null) {
            lista.removerInicio(0);
        }
        return atual;
    }
}
