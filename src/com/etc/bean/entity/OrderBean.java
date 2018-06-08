package com.etc.bean.entity;

public class OrderBean {
	private int ORDERNO;// �������
	private String SENDER;// �ļ�������
	private int SENDERPROVINCEID;// �ļ���ַ(ʡ�ݾ�̖
	private int SENDERCITYID;// �ļ���ַ(�о�̖)
	private int SENDERCOUNTYID;// �ļ���ַ(��/����̖)
	private String SENDERADDRESS;// �ļ��˵�ַ
	private String SENDERMOBILE;// �ļ����ֻ�
	private String RECEIVER;// �ռ���
	private int RECEIVERPROVINCEID;// �ռ���ַ(ʡ�ݾ�̖)
	private int RECEIVERCITYID;// �ռ���ַ(�м���̖)
	private int RECEIVERCOUNTYID;// �ռ���ַ(��/����̖)
	private String RECEIVERADDRESS;// �ռ���ϸ��ַ
	private String RECEIVERMOBILE;// �ռ����ֻ�
	private String GOODSTYPE;// �������
	private int GOODSWEIGHT;// ��������
	private int GOODSNUMBER;// ��������
	private double GOODSPRICE;// ����۸�

	public OrderBean() {
		super();
	}
	/**
	 * ����ʱ���õĹ��캯��
	 * @param sENDER ������
	 * @param sENDERPROVINCEID ����ʡID
	 * @param sENDERCITYID ��������ID
	 * @param sENDERCOUNTYID ��������ID
	 * @param sENDERADDRESS ������ϸ��ַ
	 * @param sENDERMOBILE �������ֻ�
	 * @param rECEIVER �ռ���
	 * @param rECEIVERPROVINCEID �ռ���ʡID
	 * @param rECEIVERCITYID �ռ��˳���ID
	 * @param rECEIVERCOUNTYID �ռ�������ID
	 * @param rECEIVERADDRESS �ռ��˵�ַ
	 * @param rECEIVERMOBILE �ռ����ֻ�
	 * @param gOODSTYPE ��Ʒ����
	 * @param gOODSWEIGHT ��Ʒ����
	 * @param gOODSNUMBER ��Ʒ����
	 * @param gOODSPRICE ��Ʒ���˼۸�
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
	 * �����Ĺ���
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
