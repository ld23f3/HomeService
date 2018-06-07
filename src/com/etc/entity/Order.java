package com.etc.entity;

public class Order {
	private int ORDERNO;//�������
	private String SENDER;//�ļ�������
	private int SENDERPROVINCEID;//�ļ���ַ(ʡ�ݾ�̖
	private int SENDERCITYID;//�ļ���ַ(�о�̖)
	private int SENDERCOUNTYID;//�ļ���ַ(��/����̖)
	private String SENDERADDRESS;//�ļ��˵�ַ
	private String SENDERMOBILE;//�ļ����ֻ�
	private String RECEIVER;//�ռ���
	private int RECEIVERPROVINCEID;//�ռ���ַ(ʡ�ݾ�̖)
	private int RECEIVERCITYID;//�ռ���ַ(�м���̖)
	private int RECEIVERCOUNTYID;//�ռ���ַ(��/����̖)
 	private String RECEIVERADDRESS;//�ռ���ϸ��ַ
	private String RECEIVERMOBILE;//�ռ����ֻ�
	private String ORDERDATE;//�µ�����
	private int ORDERSTATUS;//����״̬
	private String ORDERRMODIFIED; //�����޸�ʱ��
	/**
	 * Ĭ�Ϲ���
	 */
	public Order() {
		super();
	}
	/**
	 * ����ʱ���õĹ���
	 * @param oRDERNO �������(20180000+���,��initializeOrderNo�Զ�����)
	 * @param sENDER ������
	 * @param sENDERPROVINCEID	������ʡ��
	 * @param sENDERCITYID	�����˳���
	 * @param sENDERCOUNTYID	����������
	 * @param sENDERADDRESS	��������ϸ˵����ַ
	 * @param sENDERMOBILE	�������ֻ���
	 * @param rECEIVER	�ռ���
	 * @param rECEIVERPROVINCEID	�ռ���ʡ��
	 * @param rECEIVERCITYID	�ռ��˳���
	 * @param rECEIVERCOUNTYID	�ռ�������
	 * @param rECEIVERADDRESS	�ռ�����ϸ��ַ
	 * @param rECEIVERMOBILE	�ռ�����Ϣ
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
	 * ��������
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
