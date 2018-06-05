package com.etc.entity;

public class County {
	private int COUNTYID;//县/区編號
	private String COUNTYNAME;//县/区編號名稱
	private int CITYID;//市級編號
	
	
	/**
	 * 默认构造
	 */
	public County() {
		super();
	}
	
	/**
	 * 完整构造
	 * @param cOUNTYID
	 * @param cOUNTYNAME
	 * @param cITYID
	 */
	public County(int cOUNTYID, String cOUNTYNAME, int cITYID) {
		super();
		COUNTYID = cOUNTYID;
		COUNTYNAME = cOUNTYNAME;
		CITYID = cITYID;
	}


	public int getCOUNTYID() {
		return COUNTYID;
	}
	public void setCOUNTYID(int cOUNTYID) {
		COUNTYID = cOUNTYID;
	}
	public String getCOUNTYNAME() {
		return COUNTYNAME;
	}
	public void setCOUNTYNAME(String cOUNTYNAME) {
		COUNTYNAME = cOUNTYNAME;
	}
	public int getCITYID() {
		return CITYID;
	}
	public void setCITYID(int cITYID) {
		CITYID = cITYID;
	}
	@Override
	public String toString() {
		return "County [COUNTYID=" + COUNTYID + ", COUNTYNAME=" + COUNTYNAME + ", CITYID=" + CITYID + "]";
	}
	
}
