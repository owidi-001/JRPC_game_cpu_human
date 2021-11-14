import java.util.Random;
public abstract class Player{
	Random random=new Random();
	Move move;
	
//	public Monster monster;
	
	public int chooseMove(){
		return 0;
	}
	
	public void attack(Player player, int playerMove){
		
	}

	
	public boolean hasLost(){
		return false;
	}

	protected abstract Monster getMonster();


}