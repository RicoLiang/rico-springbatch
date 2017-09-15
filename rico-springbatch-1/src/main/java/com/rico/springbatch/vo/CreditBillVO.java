package com.rico.springbatch.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class CreditBillVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2499679270577798000L;

	/**
	 * 银行卡账号ID
	 */
	private String accountID;

	/**
	 * 持卡人姓名
	 */
	private String name;

	/**
	 * 消费金额
	 */
	private double amount;

	/**
	 * 消费日期，格式：YYYY-MM-DD HH:MM:SS
	 */
	private String date;

	/**
	 * 消费场所
	 */
	private String address;
}
