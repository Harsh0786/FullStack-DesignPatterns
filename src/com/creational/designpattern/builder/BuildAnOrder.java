package com.creational.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class BuildAnOrder {
	
	List<Item> items = new ArrayList<>();
	
	public List<Item> addItems(Item it){
		items.add(it);
		return items;
	}
	
	public int getBill(){
		int amount=0;
		for(Item item:items){
			amount=amount+item.price();
		}
		return amount;
		
	}
	
	public void showItems(){
		for(Item item:items){
			item.item();
			System.out.println("Price : "+item.price());
			item.getPacking().pack();
		}
	}

}
