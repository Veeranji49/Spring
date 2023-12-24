package com.bean2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobSeekerTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("JobSeekers.xml");
		
		List<JobSeeker> jobseeker=(List<JobSeeker>)context.getBean("jobseekerbean");
		
		for(JobSeeker j:jobseeker)
		{
			System.out.println("Id:"+j.getId());
			System.out.println("JobName:"+j.getJobName());
			System.out.println(("JobLocatiion:"+j.getLocation()));
			System.out.println("Salary:"+j.getSalary());
		}
	}

}
