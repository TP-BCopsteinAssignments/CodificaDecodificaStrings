package Codificadores;

public class Codifica17202261 implements Codifica{
    
    @Override
    public String getNomeAutor() {
      return "Lucas Pereira Salbego";
    }

    // Retorna a matrícula do autor do codificador
    @Override
    public String getMatriculaAutor() {
      return "17202261";
    }
  
    // Recebe um string e retorna o correspondente codificado
    @Override
    public String codifica(String str) {
        String codificado = "";
        for(int i=0; i< str.length(); i++){
            char s = str.charAt(i);
            codificado += String.valueOf((char) (s+3));
        }
        return codificado;
    }
  
    // Recebe um string codificado e retorna o correspondente decodificado
    @Override
    public String decodifica(String str) {
        String decodificado = "";
        for(int i=0; i< str.length(); i++){
            char s = str.charAt(i);
            decodificado += String.valueOf((char) (s-3));
        }
        return decodificado;
    }
}