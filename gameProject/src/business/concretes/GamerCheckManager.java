package business.concretes;

import business.abstracts.GamerCheckService;
import entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return false;
	}

}
