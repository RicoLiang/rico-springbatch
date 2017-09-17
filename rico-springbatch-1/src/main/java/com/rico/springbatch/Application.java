package com.rico.springbatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	private static Logger LOGGER = LogManager.getLogger(Application.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("job/job.xml");
			JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
			Job job = (Job) context.getBean("billJob");
			JobExecution result = jobLauncher.run(job, new JobParameters());
			LOGGER.info("作业执行的结果：[{}]", result);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		} finally {
			if (null != context) {
				context.close();
			}
		}
	}
}
