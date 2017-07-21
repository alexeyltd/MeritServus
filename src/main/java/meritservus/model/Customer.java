package meritservus.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
	@NotNull(message = "error.customer.notnull")
	private String customer;

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Column(name = "ccyPair")
	@JsonProperty("ccyPair")
	@NotNull(message = "error.ccyPair.notnull")
	private String ccyPair;

	public String getCcyPair() {
		return this.ccyPair;
	}

	public void setCcyPair(String ccyPair) {
		this.ccyPair = ccyPair;
	}

	@Column(name = "type")
	@JsonProperty("type")
	@NotNull(message = "error.type.notnull")
	private String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "direction")
	@JsonProperty("direction")
	@NotNull(message = "error.direction.notnull")
	private String direction;

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Column(name = "tradeDate")
	@JsonProperty("tradeDate")
	@NotNull(message = "error.tradeDate.notnull")
	private String tradeDate;

	public String getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	@Column(name = "amount1")
	@JsonProperty("amount1")
	@NotNull(message = "error.amount1.notnull")
	private double amount1;

	public double getAmount1() {
		return this.amount1;
	}

	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}

	@Column(name = "amount2")
	@JsonProperty("amount2")
	@NotNull(message = "error.amount2.notnull")
	private double amount2;

	public double getAmount2() {
		return this.amount2;
	}

	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}

	@Column(name = "rate")
	@JsonProperty("rate")
	@NotNull(message = "error.rate.notnull")
	private double rate;

	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Column(name = "valueDate")
	@JsonProperty("valueDate")
	@NotNull(message = "error.valueDate.notnull")
	private String valueDate;

	public String getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	@Column(name = "legalEntity")
	@JsonProperty("legalEntity")
	@NotNull(message = "error.legalEntity.notnull")
	private String legalEntity;

	public String getLegalEntity() {
		return this.legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	@Column(name = "trader")
	@JsonProperty("trader")
	@NotNull(message = "error.trader.notnull")
	private String trader;

	public String getTrader() {
		return this.trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}

	public Customer() {
	}

	public Customer(final String customer) {
		this.customer = customer;
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

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		final Customer customer1 = (Customer) o;

		if (Double.compare(customer1.amount1, amount1) != 0) return false;
		if (Double.compare(customer1.amount2, amount2) != 0) return false;
		if (Double.compare(customer1.rate, rate) != 0) return false;
		if (customer != null ? !customer.equals(customer1.customer) : customer1.customer != null) return false;
		if (ccyPair != null ? !ccyPair.equals(customer1.ccyPair) : customer1.ccyPair != null) return false;
		if (type != null ? !type.equals(customer1.type) : customer1.type != null) return false;
		if (direction != null ? !direction.equals(customer1.direction) : customer1.direction != null) return false;
		if (tradeDate != null ? !tradeDate.equals(customer1.tradeDate) : customer1.tradeDate != null) return false;
		if (valueDate != null ? !valueDate.equals(customer1.valueDate) : customer1.valueDate != null) return false;
		if (legalEntity != null ? !legalEntity.equals(customer1.legalEntity) : customer1.legalEntity != null)
			return false;
		return trader != null ? trader.equals(customer1.trader) : customer1.trader == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = customer != null ? customer.hashCode() : 0;
		result = 31 * result + (ccyPair != null ? ccyPair.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (direction != null ? direction.hashCode() : 0);
		result = 31 * result + (tradeDate != null ? tradeDate.hashCode() : 0);
		temp = Double.doubleToLongBits(amount1);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(amount2);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rate);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (valueDate != null ? valueDate.hashCode() : 0);
		result = 31 * result + (legalEntity != null ? legalEntity.hashCode() : 0);
		result = 31 * result + (trader != null ? trader.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", customer='" + customer + '\'' +
				", ccyPair='" + ccyPair + '\'' +
				", type='" + type + '\'' +
				", direction='" + direction + '\'' +
				", tradeDate='" + tradeDate + '\'' +
				", amount1=" + amount1 +
				", amount2=" + amount2 +
				", rate=" + rate +
				", valueDate='" + valueDate + '\'' +
				", legalEntity='" + legalEntity + '\'' +
				", trader='" + trader + '\'' +
				'}';
	}
}

