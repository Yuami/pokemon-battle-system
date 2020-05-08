package Pokemon.CalculateStats;

import Pokemon.Pokemon;
import Pokemon.StatType;

public class BasicStrategy implements CalculateStatStrategyInterface {
    @Override
    public int calculate(Pokemon pokemon, StatType statType) {
        double result = (pokemon.getBaseStats().get(statType) + pokemon.getIVStats().get(statType)) * 2;
        result += Math.sqrt(pokemon.getEVStats().get(statType)) / 4;
        result *= pokemon.getLevel();
        result /= 100;
        result += statType.is(StatType.HP) ? pokemon.getLevel() + 10 : 5;
        return (int) Math.floor(result);
    }
}
