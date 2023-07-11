package listaSimplesEnc;

public class ListaSimplesEncadeada {

    // lita encadedada é formada por nodos (ordem linear)
    // possuem os nos: cabeça e cauda
    // cada no tem a referencia do próximo no

    private No cabeca;
    private int qtdElementos;

    // Construtor padrão
    public ListaSimplesEncadeada() {
        cabeca = new No("", cabeca);
        qtdElementos = 0;
    }

    public ListaSimplesEncadeada(No c, int qtd) {
        cabeca = c;
        qtdElementos = qtd;
    }

    // Existe na lista
    public boolean ExisteLista(String elemento) {
        No no = cabeca;
        for (int i = 0; i < qtdElementos; i++) {
            if (no.getNo().getElemento().equals(elemento)) {
                return true;
            }
            no = no.getNo();
        }
        return false;
    }

    // Inserir no Inicio
    public void InserirInicio(String i) {
        No no = new No(i);
        no.setNo(cabeca.getNo());
        cabeca.setNo(no);
        qtdElementos++;
    }

    // Inserir no final
    public void InserirFinal(String i) {
        No no = new No(i);
        No proxNo = cabeca;
        while (proxNo.getNo() != null) {
            proxNo = proxNo.getNo();
        }
        no.setNo(proxNo.getNo());
        proxNo.setNo(no);
        qtdElementos++;
    }

    // questao ultima prova
    public void InserePos(No novo, int pos) {
        No auxi = cabeca;

        if (pos > qtdElementos) {
            while (auxi.getNo() != null) {
                auxi = auxi.getNo();
            }
            auxi.setNo(novo);
            qtdElementos++;
        } else {
            while (pos < qtdElementos) {
                auxi = auxi.getNo();
            }
            novo.setNo(auxi.getNo());
            auxi.setNo(novo);
            qtdElementos++;
        }
    }

    public void ExcluirPos(No novo, int pos) {
        No auxi = cabeca;

        if (pos <= qtdElementos) {
            while (auxi.getNo() != null) {
                auxi = auxi.getNo();
            }
            auxi.setNo(auxi.getNo().getNo());
        } else {
            System.out.println("Insira uma posição válida na lista!");
        }
    }

    // Excluir no inicio
    public void ExcluirInicio() {
        No no = cabeca.getNo().getNo();
        cabeca.setNo(no);
        qtdElementos--;
    }

    // Excluir do Final
    public void ExcluirFinal(int i) {
        No no = cabeca.getNo();
        for (int x = 1; x < i; x++) {
            no = no.getNo();
        }
        no.setNo(no.getNo().getNo());
        qtdElementos--;
    }
}