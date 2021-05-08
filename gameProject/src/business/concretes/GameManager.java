package business.concretes;

import business.abstracts.GameService;
import entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu silindi");
		
	}

}
