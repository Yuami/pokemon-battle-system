package Pokemon.CalculateStats;

import Pokemon.Pokemon;
import Pokemon.StatType;

public interface CalculateStatStrategyInterface {
    int calculate(Pokemon pokemon, StatType statType);
}
