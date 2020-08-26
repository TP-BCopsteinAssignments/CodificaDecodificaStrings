package Codificadores;

public class Codifica17280219 implements Codifica {
    @Override
    public String getNomeAutor() {
        return "Rafael Dias";
    }

    @Override
    public String getMatriculaAutor() {
        return "17280219";
    }


    //Codifica a string de traz para frente.
    @Override
    public String codifica(String str) {
        String codificada = "";
        for (int i = str.length() - 1; i >=0 ; i--) {
            codificada += str.charAt(i);
        }
        return codificada;
    }


    @Override
    public String decodifica(String str) {
        String codificada = "";
        for (int i = str.length() - 1; i >=0 ; i--) {
            codificada += str.charAt(i);
        }
        return codificada;
    }
}
