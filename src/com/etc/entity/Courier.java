package com.etc.entity;

public class Courier {
	private int COURIERNO;//快递员编号,工号
	private String COURIERREGION;//区域(分部)
	private String COURIERNAME;//快递员姓名
	private String COURIERPWD;//快递员密码
	private String COURIERTEL;//快递员联系电话
	private int COURIERSTATUS;//0 表示在职 1 表示离职
	private String COURIERCREATE;//建档时间
	private String COURIERMODIFIED;//修改时间
	public Courier() {
		super();
	}
	/**
	 * 建档需要的字段.新增的时候调用这个就行
	 * @param cOURIERNO 工号(手动填写,需要先验证.根据工号查询这个人)
	 * @param cOURIERREGION 区域(这个先放着.先暴力写入吧)
	 * @param cOURIERNAME 员工姓名
	 * @param cOURIERPWD 员工密码
	 * @param cOURIERTEL 员工电话
	 */
	public Courier(int cOURIERNO, String cOURIERREGION, String cOURIERNAME, String cOURIERPWD, String cOURIERTEL) {
		super();
		COURIERNO = cOURIERNO;
		COURIERREGION = cOURIERREGION;
		COURIERNAME = cOURIERNAME;
		COURIERPWD = cOURIERPWD;
		COURIERTEL = cOURIERTEL;
	}

	
	
	/**
	 * 完整构造
	 * @param cOURIERNO
	 * @param cOURIERREGION
	 * @param cOURIERNAME
	 * @param cOURIERPWD
	 * @param cOURIERTEL
	 * @param cOURIERSTATUS
	 * @param cOURIERCREATE
	 * @param cOURIERMODIFIED
	 */
	public Courier(int cOURIERNO, String cOURIERREGION, String cOURIERNAME, String cOURIERPWD, String cOURIERTEL,
			int cOURIERSTATUS, String cOURIERCREATE, String cOURIERMODIFIED) {
		super();
		COURIERNO = cOURIERNO;
		COURIERREGION = cOURIERREGION;
		COURIERNAME = cOURIERNAME;
		COURIERPWD = cOURIERPWD;
		COURIERTEL = cOURIERTEL;
		COURIERSTATUS = cOURIERSTATUS;
		COURIERCREATE = cOURIERCREATE;
		COURIERMODIFIED = cOURIERMODIFIED;
	}
	
	public int getCOURIERNO() {
		return COURIERNO;
	}
	public void setCOURIERNO(int cOURIERNO) {
		COURIERNO = cOURIERNO;
	}
	public String getCOURIERREGION() {
		return COURIERREGION;
	}
	public void setCOURIERREGION(String cOURIERREGION) {
		COURIERREGION = cOURIERREGION;
	}
	public String getCOURIERNAME() {
		return COURIERNAME;
	}
	public void setCOURIERNAME(String cOURIERNAME) {
		COURIERNAME = cOURIERNAME;
	}
	public String getCOURIERPWD() {
		return COURIERPWD;
	}
	public void setCOURIERPWD(String cOURIERPWD) {
		COURIERPWD = cOURIERPWD;
	}
	public String getCOURIERTEL() {
		return COURIERTEL;
	}
	public void setCOURIERTEL(String cOURIERTEL) {
		COURIERTEL = cOURIERTEL;
	}
	public int getCOURIERSTATUS() {
		return COURIERSTATUS;
	}
	public void setCOURIERSTATUS(int cOURIERSTATUS) {
		COURIERSTATUS = cOURIERSTATUS;
	}
	public String getCOURIERCREATE() {
		return COURIERCREATE;
	}
	public void setCOURIERCREATE(String cOURIERCREATE) {
		COURIERCREATE = cOURIERCREATE;
	}
	public String getCOURIERMODIFIED() {
		return COURIERMODIFIED;
	}
	public void setCOURIERMODIFIED(String cOURIERMODIFIED) {
		COURIERMODIFIED = cOURIERMODIFIED;
	}

	@Override
	public String toString() {
		return "Courier [COURIERNO=" + COURIERNO + ", COURIERREGION=" + COURIERREGION + ", COURIERNAME=" + COURIERNAME
				+ ", COURIERPWD=" + COURIERPWD + ", COURIERTEL=" + COURIERTEL + ", COURIERSTATUS=" + COURIERSTATUS
				+ ", COURIERCREATE=" + COURIERCREATE + ", COURIERMODIFIED=" + COURIERMODIFIED + "]";
	}
}
