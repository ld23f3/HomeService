package com.etc.entity;

public class Logistics {
	private int LOGISTICSNO;//物流编号
	private int ORDERNO;//订单编号
	private int PROVINCEID;//省份ID
	private int CITYID;//城市ID
	private int COUNTYID;//区县ID
	private String DETAILADDRESS;//详细地址
	private String CREATEDATE;//创建时间
	private int SENDSTATE;//运送状态......下单后会立马把运送路线规划出来.0未运送.1运送到
	/**
	 * 默认构造
	 */
	public Logistics() {
		super();
	}
	
	/**
	 * 新增物流信息时调用
	 * @param oRDERNO 订单编号外建
	 * @param pROVINCEID 省份编号
	 * @param cITYID 城市编号
	 * @param cOUNTYID 区县编号
	 * @param dETAILADDRESS 详细地址
	 */
	public Logistics(int oRDERNO, int pROVINCEID, int cITYID, int cOUNTYID, String dETAILADDRESS) {
		super();
		ORDERNO = oRDERNO;
		PROVINCEID = pROVINCEID;
		CITYID = cITYID;
		COUNTYID = cOUNTYID;
		DETAILADDRESS = dETAILADDRESS;
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

	

	public int getSENDSTATE() {
		return SENDSTATE;
	}

	public void setSENDSTATE(int sENDSTATE) {
		SENDSTATE = sENDSTATE;
	}

	@Override
	public String toString() {
		return "Logistics [LOGISTICSNO=" + LOGISTICSNO + ", ORDERNO=" + ORDERNO + ", PROVINCEID=" + PROVINCEID
				+ ", CITYID=" + CITYID + ", COUNTYID=" + COUNTYID + ", DETAILADDRESS=" + DETAILADDRESS + ", CREATEDATE="
				+ CREATEDATE + ", SENDSTATE=" + SENDSTATE + "]";
	}

	
}
