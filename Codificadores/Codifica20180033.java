package Codificadores;


/**
 *
 * @author tiagoluz
 */
public class Codifica20180033 implements Codifica {
      // Retorna o autor do codificador
  @Override
  public String getNomeAutor() {
    return "Tiago Luz <tiago.luz@edu.pucrs.br>";
  }

  // Retorna a matrícula do autor do codificador
  @Override
  public String getMatriculaAutor() {
    return "20180033";
  }

  // Recebe um string e retorna o correspondente codificado
  @Override
  public String codifica(String str) {
      return toHexaString(str.getBytes());
  }

  // Recebe um string codificado e retorna o correspondente decodificado
  @Override
  public String decodifica(String str) {
    return new String(toByteArray(str));
  }
  
    // converte uma String hexadecimal para um byte  
    public  byte toByte(final String hexa) {  
        return (byte) Short.parseShort(hexa.toUpperCase(), 16);  
    }  

  
    // converte uma String hexadecimal para um array de byte  
    public  byte[] toByteArray(String hexaString) {  
        final char[] chars = hexaString.toCharArray();  
        final int length = chars.length;  
        final byte[] byteArray = new byte[length / 2];  
        String hexa = null;  
        for (int i = 0, j = 0; i < length; i += 2, j++) {  
            hexa = new String(new char[] {chars[i], chars[i + 1]});  
            byteArray[j] = toByte(hexa);  
        }  
        return byteArray;  
    }  
    
     private  char[] HEXAS = "0123456789ABCDEF".toCharArray();  
     
     // converte um byte para uma String hexadecimal  
     public  String toHexa(byte bits) {  
         final int lo = bits & 0xF;  
         final int hi = bits >>> 4 & 0xF;  
         return String.valueOf(HEXAS[hi]) + String.valueOf(HEXAS[lo]);  
     }  
    
     // converte um array de byte para uma String hexadecimal  
     public  String toHexaString(byte[] bytes) {  
         final StringBuffer buffer = new StringBuffer();  
         final int length = bytes.length;  
         for (int i = 0; i < length; i++) {  
             buffer.append(toHexa(bytes[i]));  
         }  
         return buffer.toString();  
     }  
  
}
