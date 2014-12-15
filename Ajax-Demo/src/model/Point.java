package model;

public class Point {
	private double close;
	private double volume;
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public Point(double close, double volume) {
		super();
		this.close = close;
		this.volume = volume;
	}
}
