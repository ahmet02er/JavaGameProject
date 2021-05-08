package consoleUI;

import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.GamerManager;
import business.concretes.SaleManager;
import core.adapters.MernisService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Ahmet");
		gamer.setLastName("ÖZER");
		gamer.setNationalityId("01234567890");
		gamer.setYearOfBirth(1900);
		gamer.setUserName("AO");

		GamerManager gamerManager = new GamerManager(new MernisService());
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);

		System.out.println("--------------------------------------------------");

		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Metin2");
		game1.setPrice(250);

		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("League of Legends");
		game2.setPrice(150);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		System.out.println("-------------------------------------------------");
		gameManager.add(game2);
		gameManager.update(game2);
		gameManager.delete(game2);

		System.out.println("-------------------------------------------------");

		Campaign campaign1 = new Campaign(1, "2020 Yýlý Kampanyasý Ýle ", 35, game1.getPrice());

		Campaign campaign2 = new Campaign(2, "2021 Yýlý Kampanyasý Ýle ", 65, game2.getPrice());

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		System.out.println("-------------------------------------------------");
		campaignManager.add(campaign2);
		campaignManager.update(campaign2);
		campaignManager.delete(campaign2);

		System.out.println("---------------------------------------");
		System.out.println();

		SaleManager saleManager = new SaleManager();
		
		System.out.println("*********KAMPANYALI SATIÞ************");
		saleManager.campaignSale(campaign1, gamer, game1);
		saleManager.campaignSale(campaign2, gamer, game2);
		System.out.println();
		
		System.out.println("*********KAMPANYASIZ SATIÞ************");
		saleManager.sale(gamer, game1);
		saleManager.sale(gamer, game2);
		System.out.println();

	}

}
