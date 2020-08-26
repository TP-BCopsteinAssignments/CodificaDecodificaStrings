package Codificadores;

public class Codifica19204004 implements Codifica{
    
    @Override
    public String codifica(String str){
        return "Palmeiras não tem mundial"+ str.toUpperCase() + "Palmeiras não tem mundial";
    }

    @Override
    public String decodifica(String str){
        return str;
    }

    @Override
    public String getMatriculaAutor(){
        return "19204004";
    }

    @Override
    public String getNomeAutor(){
        return "Igor Pereira Dourado";
    }
}