package Codificadores;

public class Codifica19111122 implements Codifica{
    private static String tabela = "abcdefghijklmnopqrstuvwxyz@#ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.+-";
    private static int desloc = 3;

    @Override
    public String getNomeAutor() {
        return "Gustavo Leite Demichei";
    }

    @Override
    public String getMatriculaAutor() {
        return "19111122";
    }

    @Override
    public String codifica(String str) {
        String codificada = "";
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                codificada += c;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == c) {
                        codificada += tabela.charAt(i + desloc);
                    }
                }
            }
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String decodificada = "";
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                decodificada += c;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == c) {
                        decodificada += tabela.charAt(i - desloc);
                    }
                }
            }
        }
        return decodificada;
    }
}