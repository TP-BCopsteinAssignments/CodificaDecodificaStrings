package Codificadores;

public class Codifica192001691 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";

    @Override
    public String codifica(String str) {

        int cont = 0;
        String newFrase = "";

        for(int i = 0 ; i < str.length(); i++){
            for (int j = 0; j < tabela.length(); j++){
                if(tabela.charAt(j) == str.charAt(i)){
                    cont = j;
                    char s = tabela.charAt( tabela.length() - 1 - cont); //reversed order of String str ("Amanhaeodiadazebra" - > "zNZMSZVLWRZWZAVYIZ")
                                                                        // Ex( A -> z , B -> y, C -> x ...)
                    newFrase += s;
                }
            }
        }
        return "Codificando -> " + newFrase;
    }

    @Override
    public String decodifica(String str) {

        return "De" + str;
    }

    @Override
    public String getMatriculaAutor() {
        return "19200169-1";
    }

    @Override
    public String getNomeAutor() {
        return "Hojin Ryu";
    }
}