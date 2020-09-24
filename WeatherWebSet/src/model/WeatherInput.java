package model;

public class WeatherInput {
	private String day;
	private double degree;
	private double kelvin;
	private double celsius;
	
	public WeatherInput() {
		super();
	}
	
	public WeatherInput(String day, double degree) {
		super();
		this.day = day;
		this.degree = degree;
		setDay(day);
	}
	
	public WeatherInput(double degree) {
		super();
		this.degree = degree;
		setTemp(degree);
	}

	public void setDay(String day) {
		// TODO Auto-generated method stub
		this.day = day.toUpperCase();
	}
	
	public String getDay() {
		return day;
	}
	
	public void setDegree(double degree) {
		this.degree = degree;
	}
	
	public double getDegree() {
		return degree;
	}
	
	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}
	
	public double getKelvin() {
		return kelvin;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setWeather(String day, int degree) {
		setDegree(degree);
		setDay(day);
	}
	
	public void setTemp(double degree) {
		setCelsius(degree + 273.15);
		setKelvin(degree - 273.15);		
	}
	
	@Override
	public String toString() {
		return "New Weather record: Degree is " + degree + " Celsius" + " on " + day + " (Ames, IA)";
	}
	
	public String toString1() {
		return "Celsius convert to celsius is: " + kelvin + "; Kelvin convert to kelvin is: " + celsius;
	}
	
}
