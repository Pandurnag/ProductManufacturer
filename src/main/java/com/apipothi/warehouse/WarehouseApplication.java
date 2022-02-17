package com.apipothi.warehouse;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

public class WarehouseApplication {
	private final static org.slf4j.Logger Logger = LoggerFactory.getLogger(WarehouseApplication.class);
	
	public static void main(String[]args) {
		Logger.info("*******-WarehouseApplication-START");
		SpringApplication.run(WarehouseApplication.class, args);
	    Logger.info("*******-WarehouseApplication-START");
	}
	

}
