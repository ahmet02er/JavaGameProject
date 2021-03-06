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
			System.out.println(gamer.getUserName() + " Kullanıcı Kimlik doğrulaması başarılı..");
		} else {
			System.out.println(gamer.getUserName() + " Kullanıcı Kimlik doğrulaması başarısız.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullanıcı bilgileri güncellendi.");

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getUserName() + " Kullanıcı sistemden silindi.");

	}

}
