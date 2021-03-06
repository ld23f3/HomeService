package com.etc.entity;

public class Order {
	private int ORDERNO;//订单编号
	private String SENDER;//寄件人姓名
	private int SENDERPROVINCEID;//寄件地址(省份編號
	private int SENDERCITYID;//寄件地址(市編號)
	private int SENDERCOUNTYID;//寄件地址(县/区編號)
	private String SENDERADDRESS;//寄件人地址
	private String SENDERMOBILE;//寄件人手机
	private String RECEIVER;//收件人
	private int RECEIVERPROVINCEID;//收件地址(省份編號)
	private int RECEIVERCITYID;//收件地址(市級編號)
	private int RECEIVERCOUNTYID;//收件地址(县/区編號)
 	private String RECEIVERADDRESS;//收件详细地址
	private String RECEIVERMOBILE;//收件人手机
	private String ORDERDATE;//下单日期
	private int ORDERSTATUS;//订单状态
	private String ORDERRMODIFIED; //订单修改时间
	/**
	 * 默认构造
	 */
	public Order() {
		super();
	}
	/**
	 * 新增时调用的构造
	 * @param oRDERNO 订单编号(20180000+序号,由initializeOrderNo自动生成)
	 * @param sENDER 发件人
	 * @param sENDERPROVINCEID	发件人省份
	 * @param sENDERCITYID	发件人城市
	 * @param sENDERCOUNTYID	发件人区县
	 * @param sENDERADDRESS	发件人详细说明地址
	 * @param sENDERMOBILE	发件人手机号
	 * @param rECEIVER	收件人
	 * @param rECEIVERPROVINCEID	收件人省份
	 * @param rECEIVERCITYID	收件人城市
	 * @param rECEIVERCOUNTYID	收件人区县
	 * @param rECEIVERADDRESS	收件人详细地址
	 * @param rECEIVERMOBILE	收件人信息
	 */
	public Order(int oRDERNO, String sENDER, int sENDERPROVINCEID, int sENDERCITYID, int sENDERCOUNTYID,
			String sENDERADDRESS, String sENDERMOBILE, String rECEIVER, int rECEIVERPROVINCEID, int rECEIVERCITYID,
			int rECEIVERCOUNTYID, String rECEIVERADDRESS, String rECEIVERMOBILE) {
		super();
		ORDERNO = oRDERNO;
		SENDER = sENDER;
		SENDERPROVINCEID = sENDERPROVINCEID;
		SENDERCITYID = sENDERCITYID;
		SENDERCOUNTYID = sENDERCOUNTYID;
		SENDERADDRESS = sENDERADDRESS;
		SENDERMOBILE = sENDERMOBILE;
		RECEIVER = rECEIVER;
		RECEIVERPROVINCEID = rECEIVERPROVINCEID;
		RECEIVERCITYID = rECEIVERCITYID;
		RECEIVERCOUNTYID = rECEIVERCOUNTYID;
		RECEIVERADDRESS = rECEIVERADDRESS;
		RECEIVERMOBILE = rECEIVERMOBILE;
	}

	/**
	 * 完整构造
	 * @param oRDERNO
	 * @param sENDER
	 * @param sENDERPROVINCEID
	 * @param sENDERCITYID
	 * @param sENDERCOUNTYID
	 * @param sENDERADDRESS
	 * @param sENDERMOBILE
	 * @param rECEIVER
	 * @param rECEIVERPROVINCEID
	 * @param rECEIVERCITYID
	 * @param rECEIVERCOUNTYID
	 * @param rECEIVERADDRESS
	 * @param rECEIVERMOBILE
	 * @param oRDERDATE
	 * @param oRDERSTATUS
	 * @param oRDERRMODIFIED
	 */
	public Order(int oRDERNO, String sENDER, int sENDERPROVINCEID, int sENDERCITYID, int sENDERCOUNTYID,
			String sENDERADDRESS, String sENDERMOBILE, String rECEIVER, int rECEIVERPROVINCEID, int rECEIVERCITYID,
			int rECEIVERCOUNTYID, String rECEIVERADDRESS, String rECEIVERMOBILE, String oRDERDATE, int oRDERSTATUS,
			String oRDERRMODIFIED) {
		super();
		ORDERNO = oRDERNO;
		SENDER = sENDER;
		SENDERPROVINCEID = sENDERPROVINCEID;
		SENDERCITYID = sENDERCITYID;
		SENDERCOUNTYID = sENDERCOUNTYID;
		SENDERADDRESS = sENDERADDRESS;
		SENDERMOBILE = sENDERMOBILE;
		RECEIVER = rECEIVER;
		RECEIVERPROVINCEID = rECEIVERPROVINCEID;
		RECEIVERCITYID = rECEIVERCITYID;
		RECEIVERCOUNTYID = rECEIVERCOUNTYID;
		RECEIVERADDRESS = rECEIVERADDRESS;
		RECEIVERMOBILE = rECEIVERMOBILE;
		ORDERDATE = oRDERDATE;
		ORDERSTATUS = oRDERSTATUS;
		ORDERRMODIFIED = oRDERRMODIFIED;
	}
	public int getORDERNO() {
		return ORDERNO;
	}
	public void setORDERNO(int oRDERNO) {
		ORDERNO = oRDERNO;
	}
	public String getSENDER() {
		return SENDER;
	}
	public void setSENDER(String sENDER) {
		SENDER = sENDER;
	}
	public int getSENDERPROVINCEID() {
		return SENDERPROVINCEID;
	}
	public void setSENDERPROVINCEID(int sENDERPROVINCEID) {
		SENDERPROVINCEID = sENDERPROVINCEID;
	}
	public int getSENDERCITYID() {
		return SENDERCITYID;
	}
	public void setSENDERCITYID(int sENDERCITYID) {
		SENDERCITYID = sENDERCITYID;
	}
	public int getSENDERCOUNTYID() {
		return SENDERCOUNTYID;
	}
	public void setSENDERCOUNTYID(int sENDERCOUNTYID) {
		SENDERCOUNTYID = sENDERCOUNTYID;
	}
	public String getSENDERADDRESS() {
		return SENDERADDRESS;
	}
	public void setSENDERADDRESS(String sENDERADDRESS) {
		SENDERADDRESS = sENDERADDRESS;
	}
	public String getSENDERMOBILE() {
		return SENDERMOBILE;
	}
	public void setSENDERMOBILE(String sENDERMOBILE) {
		SENDERMOBILE = sENDERMOBILE;
	}
	public String getRECEIVER() {
		return RECEIVER;
	}
	public void setRECEIVER(String rECEIVER) {
		RECEIVER = rECEIVER;
	}
	public int getRECEIVERPROVINCEID() {
		return RECEIVERPROVINCEID;
	}
	public void setRECEIVERPROVINCEID(int rECEIVERPROVINCEID) {
		RECEIVERPROVINCEID = rECEIVERPROVINCEID;
	}
	public int getRECEIVERCITYID() {
		return RECEIVERCITYID;
	}
	public void setRECEIVERCITYID(int rECEIVERCITYID) {
		RECEIVERCITYID = rECEIVERCITYID;
	}
	public int getRECEIVERCOUNTYID() {
		return RECEIVERCOUNTYID;
	}
	public void setRECEIVERCOUNTYID(int rECEIVERCOUNTYID) {
		RECEIVERCOUNTYID = rECEIVERCOUNTYID;
	}
	public String getRECEIVERADDRESS() {
		return RECEIVERADDRESS;
	}
	public void setRECEIVERADDRESS(String rECEIVERADDRESS) {
		RECEIVERADDRESS = rECEIVERADDRESS;
	}
	public String getRECEIVERMOBILE() {
		return RECEIVERMOBILE;
	}
	public void setRECEIVERMOBILE(String rECEIVERMOBILE) {
		RECEIVERMOBILE = rECEIVERMOBILE;
	}
	public String getORDERDATE() {
		return ORDERDATE;
	}
	public void setORDERDATE(String oRDERDATE) {
		ORDERDATE = oRDERDATE;
	}
	public int getORDERSTATUS() {
		return ORDERSTATUS;
	}
	public void setORDERSTATUS(int oRDERSTATUS) {
		ORDERSTATUS = oRDERSTATUS;
	}
	public String getORDERRMODIFIED() {
		return ORDERRMODIFIED;
	}
	public void setORDERRMODIFIED(String oRDERRMODIFIED) {
		ORDERRMODIFIED = oRDERRMODIFIED;
	}

	@Override
	public String toString() {
		return "Order [ORDERNO=" + ORDERNO + ", SENDER=" + SENDER + ", SENDERPROVINCEID=" + SENDERPROVINCEID
				+ ", SENDERCITYID=" + SENDERCITYID + ", SENDERCOUNTYID=" + SENDERCOUNTYID + ", SENDERADDRESS="
				+ SENDERADDRESS + ", SENDERMOBILE=" + SENDERMOBILE + ", RECEIVER=" + RECEIVER + ", RECEIVERPROVINCEID="
				+ RECEIVERPROVINCEID + ", RECEIVERCITYID=" + RECEIVERCITYID + ", RECEIVERCOUNTYID=" + RECEIVERCOUNTYID
				+ ", RECEIVERADDRESS=" + RECEIVERADDRESS + ", RECEIVERMOBILE=" + RECEIVERMOBILE + ", ORDERDATE="
				+ ORDERDATE + ", ORDERSTATUS=" + ORDERSTATUS + ", ORDERRMODIFIED=" + ORDERRMODIFIED + "]";
	}
	
	
}
