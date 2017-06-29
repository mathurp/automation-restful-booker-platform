/**
 * 
 */
package com.buildit.enums;

/**
 * @author Pankaj Mathur
 *
 */
public enum PageHeaders {

	HOTEL_MGM_HOME_PAGE("Hotel Management Platform");
	
	private String header;
	
	private PageHeaders(final String header){
		this.header = header;
	}
	
	public String gettitle(){
		return this.header;
	}
}
