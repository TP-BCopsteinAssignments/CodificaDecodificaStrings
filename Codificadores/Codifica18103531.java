package Codificadores;


public class Codifica18103531 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private static int deslc = 6;

    @Override
    public String getNomeAutor() {
        return "Lucca Molon";
    }

    @Override
    public String getMatriculaAutor() {
        return "18103531";
    }

    @Override
    public String codifica(String str) {
        String cod = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                cod += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        cod += tabela.charAt(i + deslc);
                    }
                }
            }
        }
        return cod;
    }

    @Override
    public String decodifica(String str) {
        String decod = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                decod += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        decod += tabela.charAt(i - deslc);
                    }
                }
            }
        }
        return decod;
    }
}