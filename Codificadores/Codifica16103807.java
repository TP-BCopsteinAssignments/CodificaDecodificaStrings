package Codificadores;

public class Codifica16103807 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private static int desloca = 5;

    @Override
    public String getNomeAutor() {
        return "Pedro Gomes Rubbo Pacheco";
    }

    @Override
    public String getMatriculaAutor() {
        return "16103807";
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
                        cod += tabela.charAt(i + desloca);
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
                        decod += tabela.charAt(i - desloca);
                    }
                }
            }
        }
        return decod;
    }

}