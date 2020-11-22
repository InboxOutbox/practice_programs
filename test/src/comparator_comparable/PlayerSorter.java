package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * to create our collection and make an attempt to sort it using Collections.sort
 */

public class PlayerSorter {
	public static void main(String[] args) {
		Player player1 = new Player(1, 28, "Adam");
		Player player2 = new Player(3, 27, "John");
		Player player3 = new Player(2, 26, "Elliot");
		
		List<Player> footballTeam = new ArrayList<>();
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);
		
		//Using Comparable
		Collections.sort(footballTeam); //*N1
		
		//Using Comparator: Rank and then Age
		PlayerRankingComparator rankComparator = new PlayerRankingComparator();
		Collections.sort(footballTeam, rankComparator);
		
		PlayerAgeComparator ageComparator = new PlayerAgeComparator();
		Collections.sort(footballTeam, ageComparator);
	}
}

//*N1 This line would throw compile time error if 'Player' class did not implement 'Comparable' interface
