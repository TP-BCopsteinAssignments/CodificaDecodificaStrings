package Codificadores;

public class Codifica19102854 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private static int desloca = 7;
    

    @Override
    public String getMatriculaAutor() {
        return "19102854";
    }


    @Override
    public String getNomeAutor() {
        return "Pedro Henrique dos Santos";
    }


    @Override
    public String codifica(String str) {
        String codificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                codificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        codificada += tabela.charAt(i + desloca);
                    }
                }
            }
        }
        return codificada;
    }


    @Override
    public String decodifica(String str) {
        String decodificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                decodificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        decodificada += tabela.charAt(i - desloca);
                    }
                }
            }
        }
        return decodificada;
    }
}