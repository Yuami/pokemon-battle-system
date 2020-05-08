package Pokemon;

public enum NatureType {
    HARDY("Hardy", null, null),
    LONELY("Lonely", StatType.ATTACK, StatType.DEFENSE),
    BRAVE("Brave", StatType.ATTACK, StatType.SPEED),
    ADAMANT("Adamant", StatType.ATTACK, StatType.SP_ATTACK),
    NAUGHTY("Naughty", StatType.ATTACK, StatType.SP_DEFENSE),

    DOCILE("Docile", null, null),
    BOLD("Bold", StatType.DEFENSE, StatType.ATTACK),
    RELAXED("Relaxed", StatType.DEFENSE, StatType.SPEED),
    IMPISH("Impish", StatType.DEFENSE, StatType.SP_ATTACK),
    LAX("Lax", StatType.DEFENSE, StatType.SP_DEFENSE),

    SERIOUS("Serious", null, null),
    TIMID("Timid", StatType.SPEED, StatType.ATTACK),
    HASTY("Hasty", StatType.SPEED, StatType.DEFENSE),
    JOLLY("Jolly", StatType.SPEED, StatType.SP_ATTACK),
    NAIVE("Naive", StatType.SPEED, StatType.SP_DEFENSE),

    BASHFUL("Bashful", null, null),
    MODEST("Modest", StatType.SP_ATTACK, StatType.ATTACK),
    MILD("Mild", StatType.SP_ATTACK, StatType.DEFENSE),
    QUIET("Quiet", StatType.SP_ATTACK, StatType.SPEED),
    RASH("Rash", StatType.SP_ATTACK, StatType.SP_DEFENSE),

    QUIRKY("Quirky", null, null),
    CALM("Calm", StatType.SP_DEFENSE, StatType.ATTACK),
    GENTLE("Gentle", StatType.SP_DEFENSE, StatType.DEFENSE),
    SASSY("Sassy", StatType.SP_DEFENSE, StatType.SPEED),
    CAREFUL("Careful", StatType.SP_DEFENSE, StatType.SP_ATTACK);

    private final StatType decreasedType;
    private final StatType increasedStat;
    private final String name;

    NatureType(String name, StatType increasedStat, StatType decreasedType) {
        this.name = name;
        this.increasedStat = increasedStat;
        this.decreasedType = decreasedType;
    }

    public String show() {
        return name;
    }

    public StatType getIncreasedStat() {
        return increasedStat;
    }

    public StatType getDecreasedStat() {
        return decreasedType;
    }
}
