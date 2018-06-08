package com.etc.entity;

public class Goods {
	private int  GOODSNO;//������ ����
	private String GOODSTYPE;//�������
	private int GOODSWEIGHT;//��������
	private int GOODSNUMBER;//��������
	private double GOODSPRICE;//����۸�
	private int ORDERNO; //������� ���
	private String GOODSCREATE;//���ｨ�nʱ��
	private String GOODSRMODIFIED;//�����޸�ʱ��
	
	/**
	 * Ĭ�Ϲ���
	 */
	public Goods() {
		super();
	}
	/**
	 * ����ʱ���ù���
	 * @param gOODSTYPE ��Ʒ����
	 * @param gOODSWEIGHT ��Ʒ����
	 * @param gOODSNUMBER ��Ʒ����
	 * @param gOODSPRICE ��Ʒ�۸�
	 * @param oRDERNO �������
	 */
	public Goods(String gOODSTYPE, int gOODSWEIGHT, int gOODSNUMBER, double gOODSPRICE, int oRDERNO) {
		super();
		GOODSTYPE = gOODSTYPE;
		GOODSWEIGHT = gOODSWEIGHT;
		GOODSNUMBER = gOODSNUMBER;
		GOODSPRICE = gOODSPRICE;
		ORDERNO = oRDERNO;
	}

	/**
	 * ��������
	 * @param gOODSNO
	 * @param gOODSTYPE
	 * @param gOODSWEIGHT
	 * @param gOODSNUMBER
	 * @param gOODSPRICE
	 * @param oRDERNO
	 * @param gOODSCREATE
	 * @param gOODSRMODIFIED
	 */
	public Goods(int gOODSNO, String gOODSTYPE, int gOODSWEIGHT, int gOODSNUMBER, double gOODSPRICE, int oRDERNO,
			String gOODSCREATE, String gOODSRMODIFIED) {
		super();
		GOODSNO = gOODSNO;
		GOODSTYPE = gOODSTYPE;
		GOODSWEIGHT = gOODSWEIGHT;
		GOODSNUMBER = gOODSNUMBER;
		GOODSPRICE = gOODSPRICE;
		ORDERNO = oRDERNO;
		GOODSCREATE = gOODSCREATE;
		GOODSRMODIFIED = gOODSRMODIFIED;
	}
	public int getGOODSNO() {
		return GOODSNO;
	}
	public void setGOODSNO(int gOODSNO) {
		GOODSNO = gOODSNO;
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
	public int getORDERNO() {
		return ORDERNO;
	}
	public void setORDERNO(int oRDERNO) {
		ORDERNO = oRDERNO;
	}
	public String getGOODSCREATE() {
		return GOODSCREATE;
	}
	public void setGOODSCREATE(String gOODSCREATE) {
		GOODSCREATE = gOODSCREATE;
	}
	public String getGOODSRMODIFIED() {
		return GOODSRMODIFIED;
	}
	public void setGOODSRMODIFIED(String gOODSRMODIFIED) {
		GOODSRMODIFIED = gOODSRMODIFIED;
	}
	@Override
	public String toString() {
		return "Goods [GOODSNO=" + GOODSNO + ", GOODSTYPE=" + GOODSTYPE + ", GOODSWEIGHT=" + GOODSWEIGHT
				+ ", GOODSNUMBER=" + GOODSNUMBER + ", GOODSPRICE=" + GOODSPRICE + ", ORDERNO=" + ORDERNO
				+ ", GOODSCREATE=" + GOODSCREATE + ", GOODSRMODIFIED=" + GOODSRMODIFIED + "]";
	}
	
	
	
}
