package arvore;

public class No {
    public int Valor;
    public No Esq;
    public No Drt;

    public No(int value) {
        Valor = value;
    }

    public No getEsq() {
        return Esq;
    }

    public void setEsq(No Esq) {
        this.Esq = Esq;
    }

    public No getDrt() {
        return Drt;
    }

    public void setDrt(No Drt) {
        this.Drt = Drt;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
}