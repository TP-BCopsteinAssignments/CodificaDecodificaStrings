
package Codificadores;

//caroline.lima01@edu.pucrs.br

public class Codifica19204027 implements Codifica{

    @Override
    public String getNomeAutor() {
        return "Caroline Lima";
    }

    @Override
    public String getMatriculaAutor() {
        return "19204027";
    }

    @Override
    public String codifica(String str){
        String codificada = "";
        String palavras[] = str.split(" ");
        
        //invertendo
        for(int i = palavras.length-1;i >= 0;i--){
            codificada =codificada.replace(".", "");
            codificada = codificada.concat(palavras[i]+" ");
        }
        
        //retira o espaço no final
        codificada = codificada.substring(0, codificada.length()-1);

        return codificada;
    }

    @Override
    public String decodifica(String str){
        String decodificada = "";
        String codificada = "";
        String palavras[] = str.split(" ");

        for(int i = palavras.length-1;i >= 0;i--){
            codificada =codificada.replace(".", "");
            codificada = codificada.concat(palavras[i]+" ");
        }

        for(int i = palavras.length-1;i > 0;i--){
            decodificada = codificada.concat(palavras[i]+" ");
        }
        decodificada = (decodificada.substring(0, codificada.length()-1)) + ".";
        
        return decodificada;
    }

}