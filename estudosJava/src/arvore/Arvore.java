package arvore;

public class Arvore {
    private No raiz;

    public Arvore(int value) {
        raiz = new No(value);
    }

    public void Add(int value) {
        Add(null, value);
    }

    public void Add(No node, int value) {
        if (node == null) {
            node = raiz;
        }

        if (value < node.Valor) {
            if (node.Esq == null) {
                node.Esq = new No(value);
            } else {
                Add(node.Esq, value);
            }
        } else {
            if (node.Drt == null) {
                node.Drt = new No(value);
            } else {
                Add(node.Drt, value);
            }
        }
    }
}
