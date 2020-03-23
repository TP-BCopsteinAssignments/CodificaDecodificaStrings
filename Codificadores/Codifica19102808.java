import Codificadores.Codifica;
import java.util.ArrayList;
public class Codifica191028083 implements Codifica{

    @Override
    public String getNomeAutor() {
        return "Adilson Medronha";
    }

    @Override
    public String getMatriculaAutor() {
        return "191028083";
    }

    @Override
    public String codifica(String string) {
        char[] str = string.toCharArray();
        char[] reverse = new char[str.length];
        int i,c = 0;
        for (i = str.length-1; i >= 0; i--) {
            reverse[c] = str[i];
            c++;
        }
        return String.copyValueOf(reverse);        
    }

    @Override
    public String decodifica(String string) {
        char[] str = string.toCharArray();
        char[] reverse = new char[str.length];
        int i,c = 0;
        for(i=str.length-1; i>=0; i--){
            reverse[c] = str[i];
            c++;
        } 
        return String.copyValueOf(reverse);
    }
}