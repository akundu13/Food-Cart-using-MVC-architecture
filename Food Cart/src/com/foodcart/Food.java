package com.foodcart;

public class Food
{
	 int id;
	 String item;
	 String price;
	
	
	public Food(int id,String item,String price)
	{
		this.id=id;
		this.item=item;
		this.price=price;
	}

	//Getters & Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	
}
