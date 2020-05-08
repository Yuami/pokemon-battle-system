package Pokemon;

public enum PokemonType {
    NORMAL("Normal"), FIRE("Fire"), FIGHTING("Fighting"), WATER("WA(ter"), FLYING("Flying"),
    GRASS("Grass"), POSISON("Posison"), ELECTRIC("Electric"), GROUND("Ground"),
    PSYCHIC("Psychic"), ROCK("Rock"), ICE("Ice"), BUG("Bug"), DRAGON("Dragon"),
    GHOST("Ghost"), DARK("Dark"), STEEL("Steel"), FAIRY("Fairy");

    private final String name;

    PokemonType(String name) {
        this.name = name;
    }

    public String show() {
        return name;
    }
}
