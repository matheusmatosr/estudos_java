package tabelaHash;

import listaSimplesEnc.ListaSimplesEncadeada;

public class TabelaHash {

    private ListaSimplesEncadeada[] tabelaHash;

    // Construtor padrao
    public TabelaHash(int tamanho) {
        tabelaHash = new ListaSimplesEncadeada[tamanho];
        for (int i = 0; i < tabelaHash.length; i++) {
            tabelaHash[i] = new ListaSimplesEncadeada();
        }
    }

    public int FuncaoHash(String palavra) {
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            int valor = palavra.charAt(i);
            contador += valor;
        }
        return (contador % this.tabelaHash.length);
    }

    // Inserir
    public void Inserir(String palavra) {
        int posTabelaVetor = FuncaoHash(palavra);
        this.tabelaHash[posTabelaVetor].InserirInicio(palavra);
    }

    public boolean ExisteTabela(String palavra) {
        int posTabelaVetor = FuncaoHash(palavra);
        return tabelaHash[posTabelaVetor].ExisteLista(palavra);
    }
}
