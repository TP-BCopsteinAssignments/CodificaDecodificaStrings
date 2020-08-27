package Codificadores;

public class Codifica19180293 implements Codifica {
	private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
    private static int deslc = 2;
	
	@Override
    public String getNomeAutor() {
        return "Pedro Nóbrega";
    }

	@Override
    public String getMatriculaAutor() {
        return "19180293";
    }

/*
Recebe uma String, procura cada caractere na tabela e a substitui pela segunda letra para frente. Retorna a String codificada.
*/
    @Override
    public String codifica(String str) {
    	String codificada = "";	
    	for(int i=0; i<str.length(); i++) {
    		for(int j=0; j<tabela.length(); j++) {
    			if(!Character.isLetterOrDigit(str.charAt(i))) {
    				codificada+= tabela.charAt(j+deslc);
    			}	
    		}
    	}
    	return codificada;
	}

/*
Recebe String str como parâmetro e procura cada caractere dela na tabela. Ao encontrar, substitui o caractere pelo caractere
que estiver duas posições anteriores na tabela e atribui o resultado à String decodificada, que será retornada depois que o
laço passar por toda a String passada por parâmetro.
*/
	@Override
    public String decodifica(String str) {
    	String decodificada ="";
    	for(int i=0; i<str.length(); i++) {
    		for(int j=0; j<tabela.length(); j++) {
    			if(str.charAt(i)==tabela.charAt(j)) {
    				decodificada += tabela.charAt(j-deslc);
    			}
    		}	
    	}
    	return decodificada;    
    }
    

}
