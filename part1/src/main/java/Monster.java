public class Monster {
    private String name,type;
    private int hp,speed,attack,defense;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;

    public Monster(String name,String type,int hp,int speed,int attack,int defense,Move move1,Move move2,Move move3,Move move4){
    this.name=name;
    this.type=type;
    this.hp=hp;
    this.speed=speed;
    this.attack=attack;
    this.defense=defense;
    this.setMove1(move1);
    this.setMove2(move2);
    this.setMove3(move3);
    this.setMove4(move4);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHP() {
        return hp;
    }
    public void setHP(int hp) {
		this.hp = hp;
	}

    public int getSpeed() {
        return speed;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

	public Move getMove1() {
		return move1;
	}

	public void setMove1(Move move1) {
		this.move1 = move1;
	}

	public Move getMove2() {
		return move2;
	}

	public void setMove2(Move move2) {
		this.move2 = move2;
	}

	public Move getMove3() {
		return move3;
	}

	public void setMove3(Move move3) {
		this.move3 = move3;
	}

	public Move getMove4() {
		return move4;
	}

	public void setMove4(Move move4) {
		this.move4 = move4;
	}

}