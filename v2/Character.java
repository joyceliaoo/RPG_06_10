public class Character {
    protected int hp;
    protected int strength;
    protected int defense;
    protected double attack;

    public boolean isAlive() {
        return hp > 0;
    }

    public int getDefense() {
	return defense;
    }

    public void lowerHP(int damage) {
	hp = hp - damage;
    }

    public int attack(Character opposing) {
	int dmg;
	dmg = (int) (strength * attack) - opposing.getDefense();
	opposing.lowerHP(dmg);
	return dmg;
    }
}