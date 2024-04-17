package Pokemon;

public class Pokemon {
    // Atributos del Pokemon
    private int idPokemon;
    private String nombrePokemon;
    private int vidaPokemon;
    private int ataquePokemon;
    private int defensaPokemon;
    private Entrenador entrenador;

    // Constructor
    public Pokemon(int idPokemon, String nombrePokemon, int vidaPokemon, int ataquePokemon, int defensaPokemon, Entrenador entrenador) {
        this.idPokemon = idPokemon;
        this.nombrePokemon = nombrePokemon;
        this.vidaPokemon = vidaPokemon;
        this.ataquePokemon = ataquePokemon;
        this.defensaPokemon = defensaPokemon;
        this.entrenador = entrenador;
    }

    // Métodos getter
    public int getIdPokemon() {
        return idPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public int getVidaPokemon() {
        return vidaPokemon;
    }

    public int getDefensaPokemon() {
        return defensaPokemon;
    }

    public int getAtaquePokemon() {
        return ataquePokemon;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public String mostrarPokemon() {
        return "Pokemon: " + this.nombrePokemon + " Vida: " + this.vidaPokemon + " Defensa: " + this.defensaPokemon + " Ataque: " + this.ataquePokemon;
    }

    public int getIdEntrenador() {
        return entrenador.getIdEntrenador();
    }

    public int atacarPokemon(int ataque){
        int dannio = vidaPokemon - ataque;
        return dannio;
    }
}
