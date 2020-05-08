package Pokemon;

public enum StatType {
    HP("HP"), ATTACK("Attack"), DEFENSE("Defense"), SP_ATTACK("Sp. Attack"), SP_DEFENSE("Sp. Defense"), SPEED("Speed");

    private final String name;

    StatType(String name) {
        this.name = name;
    }

    public String show() {
        return name;
    }

    public boolean is(StatType type) {
        return type == this;
    }
}
