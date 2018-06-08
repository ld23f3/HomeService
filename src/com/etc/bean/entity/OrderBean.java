package com.etc.bean.entity;

public class OrderBean {
	private int ORDERNO;// 订单编号
	private String SENDER;// 寄件人姓名
	private int SENDERPROVINCEID;// 寄件地址(省份編號
	private int SENDERCITYID;// 寄件地址(市編號)
	private int SENDERCOUNTYID;// 寄件地址(县/区編號)
	private String SENDERADDRESS;// 寄件人地址
	private String SENDERMOBILE;// 寄件人手机
	private String RECEIVER;// 收件人
	private int RECEIVERPROVINCEID;// 收件地址(省份編號)
	private int RECEIVERCITYID;// 收件地址(市級編號)
	private int RECEIVERCOUNTYID;// 收件地址(县/区編號)
	private String RECEIVERADDRESS;// 收件详细地址
	private String RECEIVERMOBILE;// 收件人手机
	private String GOODSTYPE;// 货物類型
	private int GOODSWEIGHT;// 货物重量
	private int GOODSNUMBER;// 货物数量
	private double GOODSPRICE;// 运输价格

	public OrderBean() {
		super();
	}
	/**
	 * 新增时调用的构造函数
	 * @param sENDER 发件人
	 * @param sENDERPROVINCEID 发件省ID
	 * @param sENDERCITYID 发件城市ID
	 * @param sENDERCOUNTYID 发件区县ID
	 * @param sENDERADDRESS 发件详细地址
	 * @param sENDERMOBILE 发件人手机
	 * @param rECEIVER 收件人
	 * @param rECEIVERPROVINCEID 收件人省ID
	 * @param rECEIVERCITYID 收件人城市ID
	 * @param rECEIVERCOUNTYID 收件人区县ID
	 * @param rECEIVERADDRESS 收件人地址
	 * @param rECEIVERMOBILE 收件人手机
	 * @param gOODSTYPE 物品类型
	 * @param gOODSWEIGHT 物品重量
	 * @param gOODSNUMBER 物品数量
	 * @param gOODSPRICE 物品托运价格
	 */
	public OrderBean(String sENDER, int sENDERPROVINCEID, int sENDERCITYID, int sENDERCOUNTYID, String sENDERADDRESS,
			String sENDERMOBILE, String rECEIVER, int rECEIVERPROVINCEID, int rECEIVERCITYID, int rECEIVERCOUNTYID,
			String rECEIVERADDRESS, String rECEIVERMOBILE, String gOODSTYPE, int gOODSWEIGHT, int gOODSNUMBER,
			double gOODSPRICE) {
		super();
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
		GOODSTYPE = gOODSTYPE;
		GOODSWEIGHT = gOODSWEIGHT;
		GOODSNUMBER = gOODSNUMBER;
		GOODSPRICE = gOODSPRICE;
	}

	/**
	 * 完整的构造
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
	 * @param gOODSTYPE
	 * @param gOODSWEIGHT
	 * @param gOODSNUMBER
	 * @param gOODSPRICE
	 */
	public OrderBean(int oRDERNO, String sENDER, int sENDERPROVINCEID, int sENDERCITYID, int sENDERCOUNTYID,
			String sENDERADDRESS, String sENDERMOBILE, String rECEIVER, int rECEIVERPROVINCEID, int rECEIVERCITYID,
			int rECEIVERCOUNTYID, String rECEIVERADDRESS, String rECEIVERMOBILE, String gOODSTYPE, int gOODSWEIGHT,
			int gOODSNUMBER, double gOODSPRICE) {
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
		GOODSTYPE = gOODSTYPE;
		GOODSWEIGHT = gOODSWEIGHT;
		GOODSNUMBER = gOODSNUMBER;
		GOODSPRICE = gOODSPRICE;
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

	public String getGOODSTYPE() {
		return GOODSTYPE;
	}

	public void setGOODSTYPE(String gOODSTYPE) {
		GOODSTYPE = gOODSTYPE;
	}

	public int getGOODSWEIGHT() {
		return GOODSWEIGHT;
	}

	public void setGOODSWEIGHT(int gOODSWEIGHT) {
		GOODSWEIGHT = gOODSWEIGHT;
	}

	public int getGOODSNUMBER() {
		return GOODSNUMBER;
	}

	public void setGOODSNUMBER(int gOODSNUMBER) {
		GOODSNUMBER = gOODSNUMBER;
	}

	public double getGOODSPRICE() {
		return GOODSPRICE;
	}

	public void setGOODSPRICE(double gOODSPRICE) {
		GOODSPRICE = gOODSPRICE;
	}

	@Override
	public String toString() {
		return "OrderBean [ORDERNO=" + ORDERNO + ", SENDER=" + SENDER + ", SENDERPROVINCEID=" + SENDERPROVINCEID
				+ ", SENDERCITYID=" + SENDERCITYID + ", SENDERCOUNTYID=" + SENDERCOUNTYID + ", SENDERADDRESS="
				+ SENDERADDRESS + ", SENDERMOBILE=" + SENDERMOBILE + ", RECEIVER=" + RECEIVER + ", RECEIVERPROVINCEID="
				+ RECEIVERPROVINCEID + ", RECEIVERCITYID=" + RECEIVERCITYID + ", RECEIVERCOUNTYID=" + RECEIVERCOUNTYID
				+ ", RECEIVERADDRESS=" + RECEIVERADDRESS + ", RECEIVERMOBILE=" + RECEIVERMOBILE + ", GOODSTYPE="
				+ GOODSTYPE + ", GOODSWEIGHT=" + GOODSWEIGHT + ", GOODSNUMBER=" + GOODSNUMBER + ", GOODSPRICE="
				+ GOODSPRICE + "]";
	}

}
