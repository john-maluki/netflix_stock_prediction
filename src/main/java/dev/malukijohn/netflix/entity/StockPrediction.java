package dev.malukijohn.netflix.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="netflix_stock_prediction")
public class StockPrediction {
	@Id
	@GeneratedValue
	private UUID id;
	
	
	@Column(name="Date")
	private Date date;
	
	@Column(name="Open")
	private double open;
	
	@Column(name="High")
	private double high;
	
	@Column(name="Low")
	private double low;
	
	@Column(name="Adj_Close")
	private double adjClose;
	
	@Column(name="Volume")
	private long volume;

	public StockPrediction() {
		
	}

	public StockPrediction(Date date, double open, double high, double low, double adjClose, long volume) {
		super();
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.adjClose = adjClose;
		this.volume = volume;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getAdjClose() {
		return adjClose;
	}

	public void setAdjClose(double adjClose) {
		this.adjClose = adjClose;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}
	
 
}
