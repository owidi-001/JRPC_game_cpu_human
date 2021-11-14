import java.util.Random;
import java.util.Scanner;

public class HumanPlayer extends Player{
    private Monster monster;
    Scanner scanner=new Scanner(System.in);

	public HumanPlayer(Monster monster) {
		this.setMonster(monster);
	}
	
	public Monster getMonster() {
		return monster;
	}
	
	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	
	public int chooseMove() {
		// User chooses move
		String MOVE="Choose move: \n" +
				"1. Vine Whip \n" +
				"2. Tackle \n" +
				"3. Take Down \n" +
				"4. Razor Leaf";
	System.out.println(MOVE);
		try {
		int move=scanner.nextInt();
		return move;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return 0;
	}
	
	Random random=new Random();
	public boolean isFasterThan(CPUPlayer enemy) {
		if (monster.getSpeed()>enemy.monster.getSpeed()) {
			return true;
		}
		return false;
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