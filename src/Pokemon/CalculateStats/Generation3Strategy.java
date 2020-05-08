package Pokemon.CalculateStats;

import Pokemon.Pokemon;
import Pokemon.StatType;
import Pokemon.NatureType;

public class Generation3Strategy implements CalculateStatStrategyInterface {
    @Override
    public int calculate(Pokemon pokemon, StatType statType) {
        double result = 2 * pokemon.getBaseStats().get(statType) + pokemon.getIVStats().get(statType);
        result += pokemon.getEVStats().get(statType) / 4;
        result *= pokemon.getLevel();
        result /= 100;
        if (statType.is(StatType.HP)) {
            result += pokemon.getLevel() + 10;
        } else {
            result += 5;
            result *= calculateNatureBuff(pokemon, statType);
        }
        return (int) Math.round(result);
    }

    private double calculateNatureBuff(Pokemon pokemon, StatType statType) {
        NatureType nature = pokemon.getNature();
        if (nature.getIncreasedStat() == statType)
            return 1.1;
        if (nature.getDecreasedStat() == statType)
            return 0.9;
        return 1;
    }
}
