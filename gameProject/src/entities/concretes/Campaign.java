package entities.concretes;

import entities.abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private double unitPrice;
	private int discountRate;

	public Campaign() {

	}

	public Campaign(int id, String campaignName, int discountRate, double unitPrice) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discountRate / 100);
	}

}
