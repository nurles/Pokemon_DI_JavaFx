package sample;

public class Pokemon {

    private final String nombre;
    private final int vida;
    private final int nivel;
    private final char genero;

    public Pokemon(String nombre, int vida, int nivel, char genero) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }


    public int getVida() {
        return vida;
    }


    public int getNivel() {
        return nivel;
    }


    public char getGenero() {
        return genero;
    }

}
