package comparator_comparable;

import java.util.Comparator;

public class PlayerRankingComparator implements Comparator<Player>{

	@Override
	public int compare(Player player1, Player player2) {
		// Auto-generated method stub
		return Integer.compare(player1.getRanking(), player2.getRanking());
	}

}
