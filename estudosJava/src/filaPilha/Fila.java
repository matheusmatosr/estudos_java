package filaPilha;

public class Fila {

    private ListaSimplesmenteEncadeada lista;

    public Fila() {
        lista = new ListaSimplesmenteEncadeada();
    }

    public void Push(No no) {
        lista.inserePosicao(no, lista.getTamanho());
    }

    public void Pop(No no) {
        No noRemovido = lista.getNo();
        lista.excluirPosicao(0);
        return noRemovido;
    }
}
