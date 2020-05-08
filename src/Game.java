import Pokemon.CalculateStats.Generation3Strategy;
import Pokemon.Pokemon;
import Pokemon.PokemonStats;
import Pokemon.PokemonType;
import Pokemon.NatureType;

public class Game {
    private boolean ended = false;
    private BattleInterface battle;

    public Game(BattleInterface battle) {
        this.battle = battle;
    }

    public void play() {
        battle.start();
        while (!ended) {
            battle.loop();
        }
    }

    public static void main(String[] args) {
        BattleInterface battle = new Battle();
        Game game = new Game(battle);
        PokemonStats baseStats = PokemonStats.create(10, 10, 10, 10, 10, 10);
        PokemonStats IVStats = PokemonStats.create(10, 10, 10, 10, 10, 10);
        PokemonStats EVStats = PokemonStats.create(16, 16, 16, 16, 16, 16);
        Pokemon p = new Pokemon("Pikachu", 50, PokemonType.ELECTRIC, baseStats, IVStats, EVStats, NatureType.LONELY ,new Generation3Strategy());
        System.out.println(p);
    }
}
