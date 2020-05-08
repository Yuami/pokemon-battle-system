package Pokemon;

import java.util.Arrays;
import java.util.HashMap;

public class PokemonStats {
    private HashMap<StatType, Integer> stats;

    public static PokemonStats create(int hp, int attack, int defense, int sp_attack, int sp_defense, int speed){
        HashMap<StatType, Integer> stats = new HashMap<>();
        stats.put(StatType.HP, hp);
        stats.put(StatType.ATTACK, attack);
        stats.put(StatType.DEFENSE, defense);
        stats.put(StatType.SP_ATTACK, sp_attack);
        stats.put(StatType.SP_DEFENSE, sp_defense);
        stats.put(StatType.SPEED, speed);
        return new PokemonStats(stats);
    }

    protected PokemonStats(HashMap<StatType, Integer> stats) {
        this.stats = stats;
        validateData();
    }

    private void validateData() throws IllegalArgumentException {
        Arrays.stream(StatType.values())
                .forEach(statType -> {
                    if (!stats.containsKey(statType))
                        throw new IllegalArgumentException("Missing stat type: " + statType.show());
                });
    }

    public int get(StatType type) {
        return stats.get(type);
    }

    public int hp() {
        return stats.get(StatType.HP);
    }

    public int attack() {
        return stats.get(StatType.ATTACK);
    }

    public int defense() {
        return stats.get(StatType.DEFENSE);
    }

    public int spAttack() {
        return stats.get(StatType.SP_ATTACK);
    }

    public int spDefense() {
        return stats.get(StatType.SP_DEFENSE);
    }

    public int speed() {
        return stats.get(StatType.SPEED);
    }
}
