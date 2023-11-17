package com.barclays;

import com.barclays.utility.VehiclePopulator;
import com.barclays.utility.PersonPopulator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConsignmentAppApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(ConsignmentAppApplication.class, args);

//		PersonPopulator personPopulator = appContext.getBean("personPopulator", PersonPopulator.class);
//		personPopulator.populate();

//		VehiclePopulator vehiclePopulator = appContext.getBean("vehiclePopulator", VehiclePopulator.class);
//		vehiclePopulator.populate();


	}

}
