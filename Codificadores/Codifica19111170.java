package Codificadores;

public class Codifica19111170 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@# ";
    private static int deslc = 1;

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
    //Pega cada char da string, acha ele na tabela, desloca uma posição X e codifica em HASHCODE
    public String codifica(String str){
        String codificada = "";
        for (char letra : str.toCharArray()){
            for(int i = 0; i < tabela.length(); i++){
                if(letra == tabela.charAt(i)){
                    codificada += Character.toString(tabela.charAt(i - deslc)).hashCode() + "  ";
                }
            }
        }
        return codificada;

    }

    @Override
    //Decodifica o hash passado por parametro
    public String decodifica(String str){
        String decodificada = "";
        String [] hashes = str.split(" ");
        for (String hash: hashes) {
            for(int i = 0; i < tabela.length(); i++){
                String charac = ""+Character.toString(tabela.charAt(i)).hashCode();
                if(charac.equals(hash)){
                    decodificada += tabela.charAt(i+deslc);
                }
            }
        }
        return decodificada;
    }
}