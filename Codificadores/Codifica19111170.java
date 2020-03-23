package Codificadores;

public class Codifica19111170 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private static int deslc = -5;

    @Override
    // Retorna o nome do autor
    public String getNomeAutor() {
        return "Luís Lima";
    }

    @Override
    // Retorna a matrícula do autor
    public String getMatriculaAutor(){
        return "19111170";
    }

    @Override
    //Codifica a string passada por parâmetro
    public String codifica(String str){
        String codificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                codificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        codificada += tabela.charAt(i + deslc);
                    }
                }
            }
        }
        return codificada;

    }

    @Override
    //Decodifica a string passada por parâmetro
    public String decodifica(String str){
        String decodificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                decodificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        decodificada += tabela.charAt(i - deslc);
                    }
                }
            }
        }
        return decodificada;
    }
}