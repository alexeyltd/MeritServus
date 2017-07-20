package meritservus.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RootObject {

	@JsonProperty("customer")
	private String customer;

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@JsonProperty("ccyPair")
	private String ccyPair;

	public String getCcyPair() {
		return this.ccyPair;
	}

	public void setCcyPair(String ccyPair) {
		this.ccyPair = ccyPair;
	}

	@JsonProperty("type")
	private String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("direction")
	private String direction;

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@JsonProperty("tradeDate")
	private String tradeDate;

	public String getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	@JsonProperty("amount1")
	private double amount1;

	public double getAmount1() {
		return this.amount1;
	}

	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}

	@JsonProperty("amount2")
	private double amount2;

	public double getAmount2() {
		return this.amount2;
	}

	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}

	@JsonProperty("rate")
	private double rate;

	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@JsonProperty("valueDate")
	private String valueDate;

	public String getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	@JsonProperty("legalEntity")
	private String legalEntity;

	public String getLegalEntity() {
		return this.legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	@JsonProperty("trader")
	private String trader;

	public String getTrader() {
		return this.trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}
}

