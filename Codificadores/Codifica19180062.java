package Codificadores;

public class Codifica19180062 implements Codifica {   
    @Override
    public String getNomeAutor() {
        return "Rauf Rodrigues";
    }

    @Override
    public String getMatriculaAutor() {
        return "19180062";
    }

    @Override
    public String codifica(String str) {
        String codificada = "";
        for (int i = 0; i < str.length()-1; i++) {
            codificada += (int) str.charAt(i)+"*";
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String decodificada = "";
        String ok = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == '*') {
                continue;                
            }
            ok += str.charAt(i);
            if (str.charAt(i+1) == '*') {
                int convert = Integer.parseInt(ok);
                decodificada += (char)convert;
                ok ="";
            }
        }
        return decodificada;
    }
    
}