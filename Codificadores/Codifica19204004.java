package Codificadores;

public class Codifica19204004 implements Codifica{
    
    @Override
    public String codifica(String str){
        return "Palmeiras nao tem mundial e "+ str.toUpperCase() + " e o Palmeiras nao tem mundial";
    }

    @Override
    public String decodifica(String str){
        return "Palmeiras nao tem mundial e "+ str.toUpperCase() + " e o Palmeiras nao tem mundial";
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