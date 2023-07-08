package string;

public class Strings {
    public static void main(String[] args) throws Exception {

        String nome = "Matheus Matos";
        int idade = 20;

        // concatenação
        System.out.println("Nome: " + nome + " | Idade: " + idade);

        // split = separados por ;
        String texto = "Matheus;Matos;Rodrigues";
        String[] colunas = texto.split(";");

        System.out.println(colunas[0]);
        System.out.println(colunas[1]);
        System.out.println(colunas[2]);

        // toUpperCase = maiusculo
        String pequeno = "mmr 10";
        String maiusculo = pequeno.toUpperCase();
        System.out.println(maiusculo);

        // toLowerCase = minusculo
        String grande = "MATHEUSZIN";
        String minusculo = grande.toLowerCase();
        System.out.println(minusculo);

        // replace = substituir
        String livia = "Livia Sperandio";
        String novaLivia = livia.replace("Sperandio", "Matos");
        System.out.println(novaLivia);

        // substring = quebrar em parte menor ou achar algo especifico
        String nomeCompleto = "Anna Luiza Matos Rodrigues";
        String partesNome = nomeCompleto.substring(0, 4);
        System.out.println(partesNome);

        // indexOf = busca a posição na string
        int posicao = nomeCompleto.indexOf("R");
        System.out.println(posicao);
        System.out.println(nomeCompleto.substring(posicao));
    }
}
