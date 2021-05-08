package business.concretes;

import business.abstracts.SaleService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getUserName() + " Ho�geldin. " + game.getGameName() + " oyununu "
				+ game.getPrice() + " TL �deyerek sat�nald�n.");

	}

	@Override
	public void campaignSale(Campaign campaign, Gamer gamer, Game game) {
		System.out.println(gamer.getUserName() + " " + campaign.getCampaignName()
				+ game.getGameName() + " oyununu % " + campaign.getDiscountRate() + " indirim ile "
				+ campaign.getUnitPriceAfterDiscount() + " TL �deyerek sat�nald�n.");

	}

}
