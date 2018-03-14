package Conference;

import java.net.*;
import java.sql.Date;
/**
 * @author huong,camille
 */
public class Conference {
	private URL url;
	private String title;
	private Date start_date;
	private Date end_date;
	private Double registration_fee;
	private String city;
	private String country;
	
	/**
	 * This is a getter which return the URL  	
	 * @return url
	 */
	public URL getUrl() {
		return url;
	}
	
	/**
	 * This is a setter which set the URL
	 * @param url
	 */
	public void setUrl(URL url) {
		this.url = url;
	}
	
	/**
	 * This is a getter which return the title  	
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * This is a setter which set the title 	
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * This is a getter which return the date start  	
	 * @return start_date
	 */
	public Date getStartDate() {
		return start_date;
	}
	
	/**
	 * This is a setter which set the the date start  	
	 * @param start_date
	 */
	public void setStartDate(Date start_date) {
		this.start_date = start_date;
	}
	
	/**
	 * This is a getter which return the date end 	
	 * @return end_date
	 */
	public Date getEndDate() {
		return end_date;
	}
	
	/**
	 * This is a setter which set the the date end  	
	 * @param end_date
	 */
	public void setEndDate(Date end_date) {
		this.end_date = end_date;
	}
	
	/**
	 * This is a getter which return the fee of registration	
	 * @return registration_fee
	 */
	public Double getFeeRegistration() {
		return registration_fee;
	}
	
	/**
	 * This is a setter which set the fee of registration
	 * @param registration_fee
	 */
	public void setFeeRegistration(Double registration_fee) {
		this.registration_fee = registration_fee;
	}
	
	/**
	 * This is a getter which return the city	
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * This is a setter which set the city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * This is a getter which return the country	
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * This is a setter which set the country
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * This is a constructor which initializes the conference object 
	 * @param url
	 * @param title
	 * @param start_date
	 * @param end_date
	 * @param registration_fee
	 * @param city
	 * @param country
	 */
	public Conference(URL url, String title, Date start_date, Date end_date, Double registration_fee, String city, String country) {
		this.url = url;
		this.title = title;
		this.start_date = start_date;
		this.end_date = end_date;
		this.registration_fee = registration_fee;
		this.city = city;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Conference [url=" + url + ", title=" + title + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", registration_fee=" + registration_fee + ", city=" + city + ", country=" + country + "]";
	}
		
}

