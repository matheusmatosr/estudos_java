package listaSimplesEnc;

public class No {

    private String elemento;
    private No next;

    public No(String e) {
        elemento = e;
        next = null;
    }

    public No(String e, No n) {
        elemento = e;
        next = n;
    }

    public String getElemento() {
        return elemento;
    }

    public No getNo() {
        return next;
    }

    public void setElemento(String e) {
        elemento = e;
    }

    public void setNo(No n) {
        next = n;
    }

}
