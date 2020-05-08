package Pokemon;

import Pokemon.CalculateStats.CalculateStatStrategyInterface;

import java.util.HashMap;

public class Pokemon {
    private int level;
    private NatureType nature;
    private String name;
    private PokemonType type;
    private PokemonStats stats;
    private PokemonStats baseStats;
    private PokemonStats IVStats;
    private PokemonStats EVStats;

    public Pokemon(
            String name,
            int level,
            PokemonType type,
            PokemonStats baseStats,
            PokemonStats IVStats,
            PokemonStats EVStats,
            NatureType nature,
            CalculateStatStrategyInterface statStrategy
    ) {
        this.level = level > 0 ? level : 1;
        this.name = name;
        this.type = type;
        this.baseStats = baseStats;
        this.IVStats = IVStats;
        this.EVStats = EVStats;
        this.nature = nature;
        this.statStrategy = statStrategy;
        calculateStats();
    }

    public NatureType getNature() {
        return nature;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public PokemonStats getStats() {
        return stats;
    }

    public PokemonStats getBaseStats() {
        return baseStats;
    }

    public PokemonStats getIVStats() {
        return IVStats;
    }

    public PokemonStats getEVStats() {
        return EVStats;
    }

    private CalculateStatStrategyInterface statStrategy;

    private void calculateStats() {
        HashMap<StatType, Integer> stats = new HashMap<StatType, Integer>();
        for (StatType statType : StatType.values())
            stats.put(statType, statStrategy.calculate(this, statType));

        this.stats = new PokemonStats(stats);
    }

    @Override
    public String toString() {
        return "Pokemon {\n" +
                "hp=" + stats.hp() + "\n" +
                "attack=" + stats.attack() + "\n" +
                "defense=" + stats.defense() + "\n" +
                "spAttack=" + stats.spAttack() + "\n" +
                "spDefense=" + stats.spDefense() + "\n" +
                "speed=" + stats.speed() + "\n" +
                "}";
    }
}
