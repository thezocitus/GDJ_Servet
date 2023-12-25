package com.winter.app.locations;

public class LocationsDTO {

	private int LOCATION_ID;
	private String SSTREET_ADDRESS;
	private String POSTAL_CODE;
	private String CITY;
	private String STATE_PROVINCE;
	private String COUNTRY_ID;
	
	
	public int getLOCATION_ID() {
		return LOCATION_ID;
	}
	public void setLOCATION_ID(int lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}
	public String getSSTREET_ADDRESS() {
		return SSTREET_ADDRESS;
	}
	public void setSSTREET_ADDRESS(String sSTREET_ADDRESS) {
		SSTREET_ADDRESS = sSTREET_ADDRESS;
	}
	public String getPOSTAL_CODE() {
		return POSTAL_CODE;
	}
	public void setPOSTAL_CODE(String pOSTAL_CODE) {
		POSTAL_CODE = pOSTAL_CODE;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getSTATE_PROVINCE() {
		return STATE_PROVINCE;
	}
	public void setSTATE_PROVINCE(String sTATE_PROVINCE) {
		STATE_PROVINCE = sTATE_PROVINCE;
	}
	public String getCOUNTRY_ID() {
		return COUNTRY_ID;
	}
	public void setCOUNTRY_ID(String cOUNTRY_ID) {
		COUNTRY_ID = cOUNTRY_ID;
	}
	
	
}
