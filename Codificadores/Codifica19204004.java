package Codificadores;

public class Codifica19204004 implements Codifica{
    
    @Override
    public String codifica(String str){
        String aux = "Palmeiras nao tem mundial e "+ str.toUpperCase();
        return aux;
    }

    @Override
    public String decodifica(String str){
        String vetor[] = str.split(" ");
        String aux = "";
        for(int i=0; i<vetor.length;i++){
            if(i==vetor.length-1){
                aux += ".";
            }
            else if(i>4){
                aux += vetor[i] + " ";
            }
        }
        aux = aux.toLowerCase();
        aux = aux.substring(0,1).toUpperCase().concat(aux.substring(1));
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