package business.concretes;

import business.abstracts.GamerCheckService;
import business.abstracts.GamerService;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getUserName() + " Kullan�c� Kimlik do�rulamas� ba�ar�l�..");
		} else {
			System.out.println(gamer.getUserName() + " Kullan�c� Kimlik do�rulamas� ba�ar�s�z.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullan�c� bilgileri g�ncellendi.");

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullan�c� sistemden silindi.");

	}

}
