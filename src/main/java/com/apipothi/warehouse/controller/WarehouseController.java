package com.apipothi.warehouse.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
	private final static Logger Logger = LoggerFactory.getLogger(WarehouseController.class);
	
	@Autowired
	WarehouseServiceImpl warehouseservice;
	
	@Value("${server.port}")
	int port;
	
	@Value("${spring.application.name}")
    String appname;
	
	@PostMapping("/createproduct")
	public WarehouseResponse createproduct(@RequestBody List<WarehouseRequest> productlist) {
		Logger.info("***START---createproduct() productlist{}" + productlist);
		WarehouseResponse response = new WarehouseResponse();
		String StatusMsg = "";
		//logic
		
		warehouseservice.createproduct(productlist);
		
		Logger.info("***END----createproduct()");
		return response;
	}
	@GetMapping("/getallproductid")
	   public WarehouseResponse getallproduct() {
		WarehouseResponse response = new WarehouseResponse();
		Logger.info("***START---getallproductid()");
		//logic
		
		Logger.info("***END---getallproductid() RESPONSE{} ***" + response);
		return response;
}
	}
	@GetMapping("/getproductid/{id}")
	public WarehouseResponse getproductbyid(@PathVariable int id) {
		Logger.info("***START---getproductbyid() id{}" + id);
		WarehouseResponse response = new WarehouseResponse();
		
		Logger.info("***getproductbyid() RESPONSE{} ***" + response);
		return response;
		
	}
}
