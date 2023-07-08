package filaPilha;

public class Fila {
    private ListaSimplesmenteEncadeada fila;

    public Fila() {
        fila = new ListaSimplesmenteEncadeada();
    }

    public void Push(String i) {
        fila.InserirFinal(i);
    }

    public String pop() {
        String palavra = fila.getPrimeiro();

        fila.RetirarInicio();
        return palavra;
    }

    public String Consulta() {
        String palavra = fila.getPrimeiro();
        return palavra;
    }
}
