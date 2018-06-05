package com.etc.entity;

public class Province {
	private int PROVINCEID;// 省份編號
	private String PROVINCENAME;// 省份名稱
	/**
	 * 默认构造
	 */
	public Province() {
		super();
	}
	
	
	/**
	 * 完整构造
	 * @param pROVINCEID
	 * @param pROVINCENAME
	 */
	public Province(int pROVINCEID, String pROVINCENAME) {
		super();
		PROVINCEID = pROVINCEID;
		PROVINCENAME = pROVINCENAME;
	}

	public int getPROVINCEID() {
		return PROVINCEID;
	}

	public void setPROVINCEID(int pROVINCEID) {
		PROVINCEID = pROVINCEID;
	}

	public String getPROVINCENAME() {
		return PROVINCENAME;
	}

	public void setPROVINCENAME(String pROVINCENAME) {
		PROVINCENAME = pROVINCENAME;
	}

	@Override
	public String toString() {
		return "Province [PROVINCEID=" + PROVINCEID + ", PROVINCENAME=" + PROVINCENAME + "]";
	}

}
