package Codificadores;

public class Codifica19102825 implements Codifica {
	 @Override
	    public String codifica(String str) {
		 String fim = " ";
	        for (int i = 0; i<str.length() ; i++) {
	            switch (str.charAt(i)) {
	            case 'a':
	            	fim += '/';
	            	break;
	            case 'e':
	            	fim += '*';
	            	break;
	            case 'i':
	            	fim += '+';
	            	break;
	            case 'o':
	            	fim += '.';
	            	break;
	            case 'u':
	            	fim += ',';
	            	break;
	            	
	            default:
	            	fim += str.charAt(i);
	            }
	            
	        }
	        return fim;
	    }

	    @Override
	    public String decodifica(String str) {
	        String decod= "";
	        for (int i = 0; i < str.length()-1 ; i++) {            
	        	switch (str.charAt(i)) {
	            case '/':
	            	decod += 'a';
	            	break;
	            case '*':
	            	decod += 'e';
	            	break;
	            case '+':
	            	decod += 'i';
	            	break;
	            case '.':
	            	decod += 'o';
	            	break;
	            case ',':
	            	decod += 'u';
	            	break;
	            	
	            default:
	            	decod += str.charAt(i);
	        }
	        }
	        return decod;
	    }


	    @Override
	    public String getMatriculaAutor() {
	        return "19102825";
	    }

	    @Override
	    public String getNomeAutor() {
	        return "Gustavo Geyer";
	    }
}
