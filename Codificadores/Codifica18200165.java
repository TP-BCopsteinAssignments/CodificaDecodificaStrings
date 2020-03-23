package Codificadores;
public class Codifica18200165 implements Codifica{
    private int alphabetSize = 94;
    private int[][] twoByTwo = {{82,97},{105,110}}; //"Rain", in letters. The det = -1165
    private int[][] invTwoByTwo = {{58, 89}, {13, 74}}; // mod 94 inverse of the twoByTwo matrix
    // Sidenote: on one hand it is frustrating that the determinant for the matrix { {L, O}, {V, E} } is an even number, but in on the other hand it is very poetic.
    private int[][] threeByThree = {{72,111,119},{97,114,101},{121,111,117}}; //"How are you". The DET IS = -110277
    private int[][] invThreeByThree = {{65, 4, 63}, {86,85,85}, {89,51,39}}; //mod 94 inverse of the threeByThree matrix
    @Override
    public String getNomeAutor(){
        return "Hiram Artnak Martins";
    }
    @Override
    public String getMatriculaAutor(){
        return "18200165";
    }

    @Override
    public String codifica(String str){
        //Before we do any operations, we must deal with some edge-cases: what happens when the string it empty or with length 1?
        if(str==null){
            return "";
        }
        if(str.length() == 0){
            return str;
        }
        if(str.length()==1){
            // Simple shift-3 caesar cypher
            return "" + charShift(str.charAt(0), 3);
        }

        //Now we go into the main implementation of the Hill Cypher
        String codedMessage = "";
        // First we must convert the message to a double vector and shift the values by -32, so that the first value in our alphabet ("space", ASCII 32) becomes 0.
        int[] messageVector = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            messageVector[i] = ((int)str.charAt(i) - 32);
        }
        //If the message has an even number "k" of characters, we can just encode it it k/2 times with the twoByTwo matrix. But in order to do this we must check if the length of the message is even!
        if(messageVector.length % 2 == 0){
            for(int i = 0; i < messageVector.length; i = i+2){
                //We create a coda 
                int[] couple = {messageVector[i], messageVector[i+1]};
                codedMessage = codedMessage + partialEncode(couple, twoByTwo);
            }
            return codedMessage;
        }
        //If the message has an odd number of characters, the last three characters will be encoded by the threeByThree matrix!
        for(int i = 0; i < messageVector.length - 3; i = i+2){
            int[] couple = {messageVector[i], messageVector[i+1]};
            codedMessage = codedMessage + partialEncode(couple, twoByTwo);
        }
        int[] triple = {messageVector[messageVector.length-3], messageVector[messageVector.length-2], messageVector[messageVector.length-1]};
        codedMessage = codedMessage + partialEncode(triple, threeByThree);
        return codedMessage;
    }
    @Override
    public String decodifica(String str){
        String decodedMessage = "";
        //Again we must deal with the edge cases
        if(str == null){
            return "";
        }
        if(str.length() == 0){
            return "";
        }
        if(str.length() == 1){
            return "" + charShift(str.charAt(0), -3);
        }
        int[] messageVector = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            messageVector[i] = ((int)str.charAt(i) - 32);
        }
        //We repeat the encoding process but using the inverse matrix!
        if(messageVector.length % 2 == 0){
            for(int i = 0; i < messageVector.length; i = i+2){
                //We create a coda 
                int[] couple = {messageVector[i], messageVector[i+1]};
                decodedMessage = decodedMessage + partialEncode(couple, invTwoByTwo);
            }
            return decodedMessage;
        }
        //Same as above
        for(int i = 0; i < messageVector.length - 3; i = i+2){
            int[] couple = {messageVector[i], messageVector[i+1]};
            decodedMessage = decodedMessage + partialEncode(couple, invTwoByTwo);
        }
        int[] triple = {messageVector[messageVector.length-3], messageVector[messageVector.length-2], messageVector[messageVector.length-1]};
        decodedMessage = decodedMessage + partialEncode(triple, invThreeByThree);
        return decodedMessage;
    }

    private char charShift(char c, int shift){
        return (char)( ( (c - 32 + shift) % alphabetSize) + 32 ); // Take an alphanumeric + symbols char. Make "space" be the char at index 0. Shift it as in a caesar cypher. Use clock arithmetic to make sure the values range from 0-93. Sum 32 to get the new char.
        //To revert just shift again by -shift.
    }
    
    
    private static String partialEncode(int[] vector, int[][] keyMatrix){
        String encodedMessage = "";
        for(int i = 0; i < keyMatrix.length; i++){
          int acc = 0;
          for(int j = 0; j < keyMatrix.length; j++){
            acc += keyMatrix[i][j] * vector[j];
          }
        encodedMessage = encodedMessage + (char)(acc%94 + 32);
        }
        return encodedMessage;
      }
    
}