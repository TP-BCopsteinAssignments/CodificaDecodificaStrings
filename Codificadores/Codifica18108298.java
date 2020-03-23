package Codificadores;

public class Codifica18108298 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private static int desloc = 8;

   @Override
    public String getNomeAutor() {
        return "Giulia Ferraro Borba";
    }

    @Override
    public String getMatriculaAutor() {
        return "18108298";
    }

    @Override
    public String codifica(String str) {
	String codificada = " ";
	for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                codificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        codificada += tabela.charAt(i + desloc);
                    }
                }
            }
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
	String decodificada = " ";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                decodificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        decodificada += tabela.charAt(i - desloc);
                    }
                }
            }
        }
        return decodificada;
    }

}