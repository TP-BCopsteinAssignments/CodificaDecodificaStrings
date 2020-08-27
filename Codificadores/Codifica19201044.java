package Codificadores;

public class Codifica19201044 implements Codifica {
    private static String chave_string = "234mAcdefghL89wiablYZ0stuv1nrBCDEFX567IJKopqxyz";
    private static int chave_numero = 7;

    @Override
    public String codifica(String str) {
        String Constroi = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                Constroi += s;
            } else {
                for (int i = 0; i < chave_string.length(); i++) {
                    if (chave_string.charAt(i) == s) {
                        int pos = Math.floorMod((i+chave_numero), chave_string.length());
                        Constroi += chave_string.charAt(pos);
                    }
                }
            }
        }
        return Constroi;
    }

    @Override
    public String decodifica(String str) {
        String deConstroi = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                deConstroi += s;
            } else {
                for (int i = 0; i < chave_string.length(); i++) {
                    if (chave_string.charAt(i) == s) {
                        int pos = Math.floorMod((i-chave_numero), chave_string.length());
                        deConstroi += chave_string.charAt(pos);
                    }
                }
            }
        }
        return deConstroi;
    }

    @Override
    public String getMatriculaAutor() {
        return "19201044";
    }

    @Override
    public String getNomeAutor() {
        return "Heitor Feijó Kunrath";
    }

}