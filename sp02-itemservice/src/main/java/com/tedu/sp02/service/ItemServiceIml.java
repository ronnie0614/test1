package com.tedu.sp02.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ItemServiceIml implements ItemService{
	
	@Override
	public List<Item> getItems(String orderId) {
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item(1,"aaa",999));
		list.add(new Item(2,"bbb",999));
		list.add(new Item(3,"ccc",999));
		list.add(new Item(4,"ddd",999));
		list.add(new Item(5,"eee",999));
		list.add(new Item(6,"fff",999));
		return list;
	}

	@Override
	public void decreaseNumbers(List<Item> list) {
		if(log.isInfoEnabled()) {
			for (Item item : list) {
				log.info("减少库存！"+item);
			}
		}
		
	}

}
