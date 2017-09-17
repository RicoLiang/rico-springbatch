package com.rico.springbatch.processor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

import com.rico.springbatch.vo.CreditBillVO;

/**
 * 数据处理类
 * 
 * @author Administrator
 *
 */
public class CreditBillProcessor implements ItemProcessor<CreditBillVO, CreditBillVO> {

	private static Logger LOGGER = LogManager.getLogger(CreditBillProcessor.class);

	@Override
	public CreditBillVO process(CreditBillVO bill) throws Exception {
		LOGGER.info(bill.toString());
		return bill;
	}
}
