package com.etc.entity;

public class Province {
	private int PROVINCEID;// ʡ�ݾ�̖
	private String PROVINCENAME;// ʡ�����Q
	/**
	 * Ĭ�Ϲ���
	 */
	public Province() {
		super();
	}
	
	
	/**
	 * ��������
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
