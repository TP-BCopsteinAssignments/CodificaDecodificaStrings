package Codificadores;

public class Codifica19201031 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz "; //adicionei " " ao alfabeto 
    private static int deslc = 4;

    @Override
    public String codifica(String str) {
        String c = "";
        for (char s : str.toCharArray()) {
            for (int i = 0; i < tabela.length(); i++) {
                if (tabela.charAt(i) == s) {
                    int pos = Math.floorMod((i-deslc), tabela.length()); // desloca pra esquerda
                    c += tabela.charAt(pos);
                }
            }
        }
        return c;
    }

    @Override
    public String decodifica(String str) {
        String dc = "";
        for (char s : str.toCharArray()) {
            for (int i = 0; i < tabela.length(); i++) {
                if (tabela.charAt(i) == s) {
                    int pos = Math.floorMod((i+deslc), tabela.length());  // desloca pra direita
                    dc += tabela.charAt(pos);
                }
            }
        }
        return dc;
    }

    @Override
    public String getMatriculaAutor() {
        return "19201031";
    }

    @Override
    public String getNomeAutor() {
        return "Fernando Giacomini";
    }
}