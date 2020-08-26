package Codificadores;

public class Codifica19204021 implements Codifica {

    private int key = 1;
    private int key2 = 2;

    @Override
    public String getNomeAutor() {
        // TODO Auto-generated method stub
        return "Pedro Cardoso";
    }

    @Override
    public String getMatriculaAutor() {
        // TODO Auto-generated method stub
        return "19204021";
    }

    @Override
    public String codifica(String str) {
        // TODO Auto-generated method stub
        StringBuilder stringC = new StringBuilder();
        char[] chars = str.toCharArray();

        int pos = 0;
        for (char c : chars) {
            if (c != ' ') {
                if (pos % 2 == 0)
                    c += key;
                else
                    c += key2;
            }
            pos++;
            stringC.append(c);
        }

        return stringC.toString();
    }

    @Override
    public String decodifica(String str) {
        // TODO Auto-generated method stub
        StringBuilder stringC = new StringBuilder();
        char[] chars = str.toCharArray();
        int pos = 0;
        for (char c : chars) {

            if (c != ' ') {
                if (pos % 2 == 0)
                    c -= key;
                else
                    c -= key2;
            }
            pos++;
            stringC.append(c);
        }

        return stringC.toString();
    }

}