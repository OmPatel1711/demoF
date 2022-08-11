
package ca.sheridancollege.project;


import java.util.ArrayList;
import java.util.List;

public class Player {
	
	ArrayList<String> player = new ArrayList<>();
	
	public Player() {
		super();
	}

	public void addPlayers(String name) {
		player.add(name);
	}
					
	public List<String> getPlayers() {
		return player;
	}
}

