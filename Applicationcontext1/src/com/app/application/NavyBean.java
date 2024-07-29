package com.app.application;

import java.io.Serializable;

public class NavyBean implements Serializable{
	
	private String regimentName;
	private String port;
	private String rank;
	public String getRegimentName() {
		return regimentName;
	}
	public void setRegimentName(String regimentName) {
		this.regimentName = regimentName;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
public String protect(){
	return "protect nation";
	
}
public NavyBean(String regimentName, String port, String rank) {
	super();
	this.regimentName = regimentName;
	this.port = port;
	this.rank = rank;
}

}
	

	