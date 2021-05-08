package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public interface SaleService {

	void sale(Gamer gamer, Game game);

	void campaignSale(Campaign campaign, Gamer gamer, Game game);

}
