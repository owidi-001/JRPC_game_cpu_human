import java.util.Random;

public class CPUPlayer extends Player{
    Monster monster;
    Random random=new Random();

    public CPUPlayer(Monster monster){
        this.monster=monster;
    }
	public int chooseMove() {
		int move=random.nextInt(4);
		return move;
	}

	public Monster getMonster() {
		return monster;
	}
	
	
	public void attack(Player player, int playerMove){		
		int damageDealt;
		float hit=random.nextFloat();
		if (hit > this.getMonster().getMove1().accuracy) {
			damageDealt=0;
		}
		damageDealt = this.getMonster().getAttack()  +
	               this.getMonster().getMove1().power -
	               player.getMonster().getDefense();
		
		int hp=player.getMonster().getHP()-damageDealt;
		player.getMonster().setHP(hp);
		
	}

	
	public boolean hasLost(){
		if(monster.getHP() <= 0) {
			return true;
		}
		return false;
	}


}