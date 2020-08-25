package Codificadores;

public class Codifica19201612 implements Codifica{

    @Override
    public String codifica(String str){
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public String decodifica(String str){
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public String getMatriculaAutor(){
        return "19201612";
    }

    @Override
    public String getNomeAutor(){
        return "Joao Dall Agnol";
    }
}