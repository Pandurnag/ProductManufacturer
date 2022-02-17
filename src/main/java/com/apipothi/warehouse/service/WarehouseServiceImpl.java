package com.apipothi.warehouse.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipothi.warehouse.model.WarehouseProduct;

@Service
public class WarehouseServiceImpl implements WarehouseService {
	
	private final static Logger Logger = LoggerFactory.getLogger(WarehouseServiceImpl.class);

	@Autowired
	public String createmyproduct(List<WarehouseRequest>product) {
		Logger.info("***START--createmyproduct()-- product{}" + product);
		String statusMsg = "";
		List<WarehouseRequest> myproduct = product;
		List<WarehouseProduct> toproduct = new ArrayList<WarehouseProduct>();
		//Logic
		
		for (WarehouseRequest WarehouseRequest : myproduct) {
			
			WarehouseRequest.
			
		}
		
		Logger.info("***END--createmyproduct()-- product{}");
		return statusMsg;
	}
	
}
