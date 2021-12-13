package com.xworkz.lamdaexpn;

public class PresidentDTO {
	private String name;
	private String age;
	private String countryName;
	private String language;
	public PresidentDTO(String name,String age,String countryName,String language) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setCountryName(countryName);
		this.setLanguage(language);

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Object getCountry() {
		// TODO Auto-generated method stub
		return null;
	}
	  
	}
	
