package Codificadores;

public class Codifica18203035 implements Codifica {
    @Override
    public String codifica(String str) {
        String codificada = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                codificada += str.charAt(i);
            } else {
                codificada += ((str.charAt(i)-0)+"|");
            }
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String decodificada = "";
        String conc = "";
        for (int i = 0; i < str.length()-1 ; i++) {            
            if (str.charAt(i) == '|') {
                continue;                
            }else if (str.charAt(i) == ' '){
                decodificada = ' ' + decodificada;
            }else{
                if (!Character.isLetterOrDigit(str.charAt(i))) {
                    decodificada = str.charAt(i) + decodificada;
                }else{
                    conc += str.charAt(i);
                    if (str.charAt(i+1) == '|') {
                        decodificada = (char)Integer.parseInt(conc) + decodificada;
                        conc ="";
                    }
                }
            }
        }
        return decodificada;
    }


    @Override
    public String getMatriculaAutor() {
        return "18203035";
    }

    @Override
    public String getNomeAutor() {
        return "Jean Lucca";
    }

}