package Codificadores;

import java.util.stream.Collectors;

public class Codifica15111096 implements Codifica {

    private static int shift = 17;

    @Override
    public String getNomeAutor() {
        return "Lennon da Silva Rocha";
    }

    @Override
    public String getMatriculaAutor() {
        return "15111096";
    }

    @Override
    public String codifica(String str) {
        return str
            .chars()
            .mapToObj(i -> Character.valueOf((char) ((i + Codifica15111096.shift) % 256)).toString())
            .collect(Collectors.joining());
    }

    @Override
    public String decodifica(String str) {
        return str
            .chars()
            .mapToObj(i -> Character.valueOf((char) ((i - Codifica15111096.shift) % 256)).toString())
            .collect(Collectors.joining());
    }

}