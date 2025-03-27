package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sim.AirtelSim;
import com.sim.IdeaSim;
import com.sim.RelianceSim;
import com.sim.Sim;
import com.sim.VodafoneSim;

public class RelianceMobile {
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	
		private Sim r =context.getBean(Sim.class);
		public RelianceMobile()
		{
			startMobile();
			try {
			r.startSim();
			}catch(NullPointerException e ) {
				System.out.println("INSERT SIM!!!");
			}	
		}
		private void startMobile()
		{
			System.out.println("welcome to reliance mobile");
		}
		
}

