package com.etc.entity;

public class Logistics {
	private int LOGISTICSNO;//物流编号
	private int ORDERNO;//订单编号
	private int PROVINCEID;//省份ID
	private int CITYID;//城市ID
	private int COUNTYID;//区县ID
	private String DETAILADDRESS;//详细地址
	private String CREATEDATE;//创建时间
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


	/**
	 * 
	 * 完整构造
	 * @param lOGISTICSNO 物流编号
	 * @param oRDERNO 订单编号
	 * @param pROVINCEID 省份ID
	 * @param cITYID 城市ID
	 * @param cOUNTYID 区县ID
	 * @param dETAILADDRESS 详细地址(xxx分部)
	 * @param cREATEDATE 创建时间
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
