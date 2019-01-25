package JavaAssess;

public class Character {

	private String name;
	private int level;
	private String classTitle;
	private int maxHp;
	private int playerHp;
	private String ability;

	public Character() {
	}

	public Character(String name, int level, String classTitle, int maxHp, int playerHp, String ability) {

		this.name = name;
		this.level = level;
		this.classTitle = classTitle;
		this.maxHp = maxHp;
		this.playerHp = playerHp;
		this.ability = ability;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getClassTitle() {
		return classTitle;
	}

	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;

	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getPlayerHp() {
		return playerHp;
	}

	public void setPlayerHp(int playerHp) {
		this.playerHp = playerHp;
	}

	public String getability() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "Name: '" + this.name + "', level: '" + this.level + "', Class Title: '" + this.classTitle + ", Health: "
				+ this.maxHp + "/" + this.playerHp + " Special move: " + this.ability;

	}
}
