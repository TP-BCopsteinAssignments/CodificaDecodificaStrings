package Codificadores;

public class Codifica18200257 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
    //char ch = tabela.charAt(i);

@Override
public String codifica(String str){
    String cod = "";


    for (int i=0 ; i<tabela.length(); i++){
      int mod = i%2;
      //char ch = tabela.charAt(i);
      if (mod == 0){
        tabela.charAt(i+2);
        cod += tabela.charAt(i);
    } 
      else 
      {
          tabela.charAt(i+4);
          cod += tabela.charAt(i);
         /* if (tabela.charAt(i) >= tabela.length()) {
            int pos = Math.floorMod((i+2), tabela.length()); //floorMod positivo(sinal)
            cod += tabela.charAt(i);
        }
      }
     //return cod;
}*/
    }
    
  }
  return cod;
}


@Override
public String decodifica(String str){
    String dec = "";
    for(int i=0; i<tabela.length(); i++){
       //char ch = tabela.charAt(i);
       int mod = i%2;
       if(mod == 0){
            tabela.charAt(i-2);
            dec += tabela.charAt(i); 
        }
       else 
        {
          tabela.charAt(i-4);
          dec += tabela.charAt(i);
          /*for (i = 0; i < tabela.length(); i++) {
            if (tabela.charAt(i) >= tabela.length()) {
                int pos = Math.floorMod((i-2), tabela.length());
                dec += tabela.charAt(pos);
       }*/

     //return dec;
    }
  
    
    

  }
  return dec;
}


@Override
public String getNomeAutor() {

  return "Luiza Nunes";
}

@Override
public String getMatriculaAutor() {

  return "18200257";
}

}