package Codificadores;
/**
 *
 * @author Mauricio Baumartt
 */
public class Codifica191060920 implements Codifica{
    
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private static int deslocamento = 3;

    @Override
    public String getMatriculaAutor() {
        return "191060920";
    }

    @Override
    public String getNomeAutor() {
        return "Mauricio Noronha Baumartt";
    }

    @Override
    public String codifica (String string){

        String codificada = "";
        for(char a : string.toCharArray()){
            if (!Character.isLetterOrDigit(a)){
                codificada += a;
            }else {
                for (int i = 0; i < tabela.length(); i++){
                    if (tabela.charAt(i) == a){
                        codificada += tabela.charAt(i + deslocamento);
                    }
                }
            }
        }
        return codificada;
    }

    @Override
    public String decodifica(String string) {
        String decodificada = "";
        for (char a : string.toCharArray()) {
            if (!Character.isLetterOrDigit(a)) {
                decodificada += a;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == a) {
                        decodificada += tabela.charAt(i - deslocamento);
                    }
                }
            }
        }
        return decodificada;
    }
}