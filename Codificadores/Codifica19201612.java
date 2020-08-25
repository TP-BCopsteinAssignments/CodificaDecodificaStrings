package Codificadores;

public class Codifica19201612 implements Codifica{
    //private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
    private static String vogais = "AEIOUaeiou";

    @Override
    public String codifica(String str){
        StringBuilder codifica = new StringBuilder(str).reverse();
        String codificada = codifica.toString();
        return codificada;
        
    }

    @Override
    public String decodifica(String str){
        return null;
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