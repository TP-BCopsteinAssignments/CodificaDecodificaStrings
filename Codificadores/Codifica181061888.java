package Codificadores;

public class Codifica181061888 implements Codifica {
   
    @Override
    public String codifica(String str) {
        return "!@#" + str;
    }

    @Override
    public String decodifica(String str) {
        return str.substring(3);
    }

    @Override
    public String getMatriculaAutor() {
        return "18106188-8";
    }

    @Override
    public String getNomeAutor() {
        return "Nathan Schostack";
    }

}