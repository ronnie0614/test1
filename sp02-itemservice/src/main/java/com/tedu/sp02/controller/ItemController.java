package com.tedu.sp02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.service.ItemService;
import com.tedu.web.util.JsonResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@Value("${server.port}")
	private int port;
	
	@GetMapping("/{orderId}")
	public JsonResult<List<Item>> getItems(@PathVariable String orderId){
		log.info("server.port="+port+",orderId="+orderId);
		List<Item> items = itemService.getItems(orderId);
		return JsonResult.ok(items).msg("port="+port);
	}
	
	@PostMapping("/decreaseNumbers")
	public JsonResult decreaseNumbers(@RequestBody List<Item> list){
		log.info("减少商品库存");
		itemService.decreaseNumbers(list);
		return JsonResult.ok();
	}
}
