package com.etc.entity;

public class Courier {
	private int COURIERNO;//���Ա���,����
	private String COURIERREGION;//����(�ֲ�)
	private String COURIERNAME;//���Ա����
	private String COURIERPWD;//���Ա����
	private String COURIERTEL;//���Ա��ϵ�绰
	private int COURIERSTATUS;//0 ��ʾ��ְ 1 ��ʾ��ְ
	private String COURIERCREATE;//����ʱ��
	private String COURIERMODIFIED;//�޸�ʱ��
	public Courier() {
		super();
	}
	/**
	 * ������Ҫ���ֶ�.������ʱ������������
	 * @param cOURIERNO ����(�ֶ���д,��Ҫ����֤.���ݹ��Ų�ѯ�����)
	 * @param cOURIERREGION ����(����ȷ���.�ȱ���д���)
	 * @param cOURIERNAME Ա������
	 * @param cOURIERPWD Ա������
	 * @param cOURIERTEL Ա���绰
	 */
	public Courier(int cOURIERNO, String cOURIERREGION, String cOURIERNAME, String cOURIERPWD, String cOURIERTEL) {
		super();
		COURIERNO = cOURIERNO;
		COURIERREGION = cOURIERREGION;
		COURIERNAME = cOURIERNAME;
		COURIERPWD = cOURIERPWD;
		COURIERTEL = cOURIERTEL;
	}

	
	
	/**
	 * ��������
	 * @param cOURIERNO
	 * @param cOURIERREGION
	 * @param cOURIERNAME
	 * @param cOURIERPWD
	 * @param cOURIERTEL
	 * @param cOURIERSTATUS
	 * @param cOURIERCREATE
	 * @param cOURIERMODIFIED
	 */
	public Courier(int cOURIERNO, String cOURIERREGION, String cOURIERNAME, String cOURIERPWD, String cOURIERTEL,
			int cOURIERSTATUS, String cOURIERCREATE, String cOURIERMODIFIED) {
		super();
		COURIERNO = cOURIERNO;
		COURIERREGION = cOURIERREGION;
		COURIERNAME = cOURIERNAME;
		COURIERPWD = cOURIERPWD;
		COURIERTEL = cOURIERTEL;
		COURIERSTATUS = cOURIERSTATUS;
		COURIERCREATE = cOURIERCREATE;
		COURIERMODIFIED = cOURIERMODIFIED;
	}
	
	public int getCOURIERNO() {
		return COURIERNO;
	}
	public void setCOURIERNO(int cOURIERNO) {
		COURIERNO = cOURIERNO;
	}
	public String getCOURIERREGION() {
		return COURIERREGION;
	}
	public void setCOURIERREGION(String cOURIERREGION) {
		COURIERREGION = cOURIERREGION;
	}
	public String getCOURIERNAME() {
		return COURIERNAME;
	}
	public void setCOURIERNAME(String cOURIERNAME) {
		COURIERNAME = cOURIERNAME;
	}
	public String getCOURIERPWD() {
		return COURIERPWD;
	}
	public void setCOURIERPWD(String cOURIERPWD) {
		COURIERPWD = cOURIERPWD;
	}
	public String getCOURIERTEL() {
		return COURIERTEL;
	}
	public void setCOURIERTEL(String cOURIERTEL) {
		COURIERTEL = cOURIERTEL;
	}
	public int getCOURIERSTATUS() {
		return COURIERSTATUS;
	}
	public void setCOURIERSTATUS(int cOURIERSTATUS) {
		COURIERSTATUS = cOURIERSTATUS;
	}
	public String getCOURIERCREATE() {
		return COURIERCREATE;
	}
	public void setCOURIERCREATE(String cOURIERCREATE) {
		COURIERCREATE = cOURIERCREATE;
	}
	public String getCOURIERMODIFIED() {
		return COURIERMODIFIED;
	}
	public void setCOURIERMODIFIED(String cOURIERMODIFIED) {
		COURIERMODIFIED = cOURIERMODIFIED;
	}

	@Override
	public String toString() {
		return "Courier [COURIERNO=" + COURIERNO + ", COURIERREGION=" + COURIERREGION + ", COURIERNAME=" + COURIERNAME
				+ ", COURIERPWD=" + COURIERPWD + ", COURIERTEL=" + COURIERTEL + ", COURIERSTATUS=" + COURIERSTATUS
				+ ", COURIERCREATE=" + COURIERCREATE + ", COURIERMODIFIED=" + COURIERMODIFIED + "]";
	}
}
