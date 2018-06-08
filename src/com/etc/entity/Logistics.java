package com.etc.entity;

public class Logistics {
	private int LOGISTICSNO;//�������
	private int ORDERNO;//�������
	private int PROVINCEID;//ʡ��ID
	private int CITYID;//����ID
	private int COUNTYID;//����ID
	private String DETAILADDRESS;//��ϸ��ַ
	private String CREATEDATE;//����ʱ��
	/**
	 * Ĭ�Ϲ���
	 */
	public Logistics() {
		super();
	}
	
	/**
	 * ����������Ϣʱ����
	 * @param oRDERNO ��������⽨
	 * @param pROVINCEID ʡ�ݱ��
	 * @param cITYID ���б��
	 * @param cOUNTYID ���ر��
	 * @param dETAILADDRESS ��ϸ��ַ
	 */
	public Logistics(int oRDERNO, int pROVINCEID, int cITYID, int cOUNTYID, String dETAILADDRESS) {
		super();
		ORDERNO = oRDERNO;
		PROVINCEID = pROVINCEID;
		CITYID = cITYID;
		COUNTYID = cOUNTYID;
		DETAILADDRESS = dETAILADDRESS;
	}


	/**
	 * 
	 * ��������
	 * @param lOGISTICSNO �������
	 * @param oRDERNO �������
	 * @param pROVINCEID ʡ��ID
	 * @param cITYID ����ID
	 * @param cOUNTYID ����ID
	 * @param dETAILADDRESS ��ϸ��ַ(xxx�ֲ�)
	 * @param cREATEDATE ����ʱ��
	 */
	public Logistics(int lOGISTICSNO, int oRDERNO, int pROVINCEID, int cITYID, int cOUNTYID, String dETAILADDRESS,
			String cREATEDATE) {
		super();
		LOGISTICSNO = lOGISTICSNO;
		ORDERNO = oRDERNO;
		PROVINCEID = pROVINCEID;
		CITYID = cITYID;
		COUNTYID = cOUNTYID;
		DETAILADDRESS = dETAILADDRESS;
		CREATEDATE = cREATEDATE;
	}



	public int getLOGISTICSNO() {
		return LOGISTICSNO;
	}



	public void setLOGISTICSNO(int lOGISTICSNO) {
		LOGISTICSNO = lOGISTICSNO;
	}



	public int getORDERNO() {
		return ORDERNO;
	}


	public void setORDERNO(int oRDERNO) {
		ORDERNO = oRDERNO;
	}


	public int getPROVINCEID() {
		return PROVINCEID;
	}


	public void setPROVINCEID(int pROVINCEID) {
		PROVINCEID = pROVINCEID;
	}


	public int getCITYID() {
		return CITYID;
	}


	public void setCITYID(int cITYID) {
		CITYID = cITYID;
	}


	public int getCOUNTYID() {
		return COUNTYID;
	}


	public void setCOUNTYID(int cOUNTYID) {
		COUNTYID = cOUNTYID;
	}


	public String getDETAILADDRESS() {
		return DETAILADDRESS;
	}


	public void setDETAILADDRESS(String dETAILADDRESS) {
		DETAILADDRESS = dETAILADDRESS;
	}


	public String getCREATEDATE() {
		return CREATEDATE;
	}


	public void setCREATEDATE(String cREATEDATE) {
		CREATEDATE = cREATEDATE;
	}



	@Override
	public String toString() {
		return "Logistics [LOGISTICSNO=" + LOGISTICSNO + ", ORDERNO=" + ORDERNO + ", PROVINCEID=" + PROVINCEID
				+ ", CITYID=" + CITYID + ", COUNTYID=" + COUNTYID + ", DETAILADDRESS=" + DETAILADDRESS + ", CREATEDATE="
				+ CREATEDATE + "]";
	}

	
}
