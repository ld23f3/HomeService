package com.etc.entity;

public class City {
	private int CITYID;//�м���̖
	private String CITYNAME;//�м����Q
	private int PROVINCEID;//ʡ�ݱ�� ���
	/**
	 * Ĭ�Ϲ���
	 */
	
	public City() {
		super();
	}
	/**
	 * ��������
	 * @param cITYID
	 * @param cITYNAME
	 * @param pROVINCEID
	 */
	public City(int cITYID, String cITYNAME, int pROVINCEID) {
		super();
		CITYID = cITYID;
		CITYNAME = cITYNAME;
		PROVINCEID = pROVINCEID;
	}

	public int getCITYID() {
		return CITYID;
	}
	public void setCITYID(int cITYID) {
		CITYID = cITYID;
	}
	public String getCITYNAME() {
		return CITYNAME;
	}
	public void setCITYNAME(String cITYNAME) {
		CITYNAME = cITYNAME;
	}
	public int getPROVINCEID() {
		return PROVINCEID;
	}
	public void setPROVINCEID(int pROVINCEID) {
		PROVINCEID = pROVINCEID;
	}
	@Override
	public String toString() {
		return "City [CITYID=" + CITYID + ", CITYNAME=" + CITYNAME + ", PROVINCEID=" + PROVINCEID + "]";
	}
	
	
}
