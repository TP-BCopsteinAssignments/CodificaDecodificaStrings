package Codificadores;

public class Codifica19108146 implements Codifica {
  private static String tabela = "pK5HSwPdEVmOv3aTjINg7McrFYoA8DLzhxG9XqlsRe1nJ2tubW0Bfky6Qi4CUZ#@)";
  private static int desloc = 3;
  
  @Override
  public String getNomeAutor() {
    return "Vinicius de Borba";
  }

  @Override
  public String getMatriculaAutor() {
    return "19108146";
  }

  @Override
  public String codifica(String str){
    String codificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                codificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        codificada += tabela.charAt(i + desloc);
                    }
                }
            }
        }
        return codificada;
  }

  @Override
  public String decodifica(String str){
    String decodificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                decodificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        decodificada += tabela.charAt(i - desloc);
                    }
                }
            }
        }
        return decodificada;
  }
}