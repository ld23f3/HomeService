package com.etc.bean.entity;

/**
 * �������Ҫ����ҳ��չʾ������Ϣʱ������
 * 
 * @author Administrator
 */
public class LogisticsBean {
	private int LOGISTICSNO;// �������
	private int ORDERNO;// �������
	private int PROVINCEID;// ʡ��ID
	private int CITYID;// ����ID
	private int COUNTYID;// ����ID
	private String PROVINCENAME;// ʡ������
	private String CITYNAME;// ��������
	private String COUNTYNAME;// ��������
	private String DETAILADDRESS;// ��ϸ��ַ
	private String CREATEDATE;// ����ʱ��
	private int SENDSTATE;// ����״̬......�µ�������������·�߹滮����.0δ����.1���͵�
	/**
	 * Ĭ�Ϲ���
	 */
	public LogisticsBean() {
		super();
	}

	/**
	 * ��������
	 * 
	 * @param lOGISTICSNO
	 * @param oRDERNO
	 * @param pROVINCEID
	 * @param cITYID
	 * @param cOUNTYID
	 * @param pROVINCENAME
	 * @param cITYNAME
	 * @param cOUNTYNAME
	 * @param dETAILADDRESS
	 * @param cREATEDATE
	 * @param sENDSTATE
	 */
	public LogisticsBean(int lOGISTICSNO, int oRDERNO, int pROVINCEID, int cITYID, int cOUNTYID, String pROVINCENAME,
			String cITYNAME, String cOUNTYNAME, String dETAILADDRESS, String cREATEDATE, int sENDSTATE) {
		super();
		LOGISTICSNO = lOGISTICSNO;
		ORDERNO = oRDERNO;
		PROVINCEID = pROVINCEID;
		CITYID = cITYID;
		COUNTYID = cOUNTYID;
		PROVINCENAME = pROVINCENAME;
		CITYNAME = cITYNAME;
		COUNTYNAME = cOUNTYNAME;
		DETAILADDRESS = dETAILADDRESS;
		CREATEDATE = cREATEDATE;
		SENDSTATE = sENDSTATE;
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

	public String getPROVINCENAME() {
		return PROVINCENAME;
	}

	public void setPROVINCENAME(String pROVINCENAME) {
		PROVINCENAME = pROVINCENAME;
	}

	public String getCITYNAME() {
		return CITYNAME;
	}

	public void setCITYNAME(String cITYNAME) {
		CITYNAME = cITYNAME;
	}

	public String getCOUNTYNAME() {
		return COUNTYNAME;
	}

	public void setCOUNTYNAME(String cOUNTYNAME) {
		COUNTYNAME = cOUNTYNAME;
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

	public int getSENDSTATE() {
		return SENDSTATE;
	}

	public void setSENDSTATE(int sENDSTATE) {
		SENDSTATE = sENDSTATE;
	}

	@Override
	public String toString() {
		return "LogisticsBean [LOGISTICSNO=" + LOGISTICSNO + ", ORDERNO=" + ORDERNO + ", PROVINCEID=" + PROVINCEID
				+ ", CITYID=" + CITYID + ", COUNTYID=" + COUNTYID + ", PROVINCENAME=" + PROVINCENAME + ", CITYNAME="
				+ CITYNAME + ", COUNTYNAME=" + COUNTYNAME + ", DETAILADDRESS=" + DETAILADDRESS + ", CREATEDATE="
				+ CREATEDATE + ", SENDSTATE=" + SENDSTATE + "]";
	}
}
