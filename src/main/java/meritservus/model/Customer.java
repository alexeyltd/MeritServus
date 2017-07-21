package meritservus.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	@Column(name = "customer")
	@JsonProperty("customer")
	private String customer;

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Column(name = "ccyPair")
	@JsonProperty("ccyPair")
	private String ccyPair;

	public String getCcyPair() {
		return this.ccyPair;
	}

	public void setCcyPair(String ccyPair) {
		this.ccyPair = ccyPair;
	}

	@Column(name = "type")
	@JsonProperty("type")
	private String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "direction")
	@JsonProperty("direction")
	private String direction;

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Column(name = "tradeDate")
	@JsonProperty("tradeDate")
	private String tradeDate;

	public String getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	@Column(name = "amount1")
	@JsonProperty("amount1")
	private double amount1;

	public double getAmount1() {
		return this.amount1;
	}

	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}

	@Column(name = "amount2")
	@JsonProperty("amount2")
	private double amount2;

	public double getAmount2() {
		return this.amount2;
	}

	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}

	@Column(name = "rate")
	@JsonProperty("rate")
	private double rate;

	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Column(name = "valueDate")
	@JsonProperty("valueDate")
	private String valueDate;

	public String getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	@Column(name = "legalEntity")
	@JsonProperty("legalEntity")
	private String legalEntity;

	public String getLegalEntity() {
		return this.legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	@Column(name = "trader")
	@JsonProperty("trader")
	private String trader;

	public String getTrader() {
		return this.trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}

	public Customer() {
	}

	public Customer(final long id, final String customer, final String ccyPair, final String type, final String direction, final String tradeDate, final double amount1, final double amount2, final double rate, final String valueDate, final String legalEntity, final String trader) {
		this.id = id;
		this.customer = customer;
		this.ccyPair = ccyPair;
		this.type = type;
		this.direction = direction;
		this.tradeDate = tradeDate;
		this.amount1 = amount1;
		this.amount2 = amount2;
		this.rate = rate;
		this.valueDate = valueDate;
		this.legalEntity = legalEntity;
		this.trader = trader;
	}
}

