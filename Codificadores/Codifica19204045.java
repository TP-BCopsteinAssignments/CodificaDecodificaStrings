package Codificadores;

public class Codifica19204045 implements Codifica {
    int aux = 0;

    @Override
    public String codifica(String str) {
        String codificada = "";

        str = str.toLowerCase();
        String embaralha = "abcdefghijklmnopqrstuvwxyz";

        for (char x : str.toCharArray()) {
            aux = 0;
            if (Character.isLetterOrDigit(x)) {
                aux = embaralha.indexOf(x) + 3;

                if (aux > 25) {

                    aux = aux % 26;

                }

                codificada += embaralha.charAt(aux);
                System.out.println(aux);

            } else {
                codificada += x;
            }

        }
        return codificada;

    }

    @Override
    public String decodifica(String str) {
        String codificada = "";

        str = str.toLowerCase();
        String embaralha = "abcdefghijklmnopqrstuvwxyz";
        for (char x : str.toCharArray()) {
            aux = 0;
            if (Character.isLetterOrDigit(x)) {

                aux = embaralha.indexOf(x) - 3;
                if (aux < 25) {

                    aux = aux % 26;

                }
                if (aux < 0) {
                    aux += 26;
                }

                codificada += embaralha.charAt(aux);
                System.out.println(aux);
            } else {
                codificada += x;
            }
        }
        return codificada;

    }

    @Override
    public String getMatriculaAutor() {
        return "19204045";
    }

    @Override
    public String getNomeAutor() {
        return "Joao Benno Weber";
    }

}