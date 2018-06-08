package com.etc.entity;

public class Goods {
	private int  GOODSNO;//货物编号 自增
	private String GOODSTYPE;//货物類型
	private int GOODSWEIGHT;//货物重量
	private int GOODSNUMBER;//货物数量
	private double GOODSPRICE;//运输价格
	private int ORDERNO; //订单编号 外键
	private String GOODSCREATE;//货物建檔时间
	private String GOODSRMODIFIED;//货物修改时间
	
	/**
	 * 默认构造
	 */
	public Goods() {
		super();
	}
	/**
	 * 新增时调用构造
	 * @param gOODSTYPE 物品类型
	 * @param gOODSWEIGHT 物品重量
	 * @param gOODSNUMBER 物品数量
	 * @param gOODSPRICE 物品价格
	 * @param oRDERNO 订单编号
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
	 * 完整构造
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
