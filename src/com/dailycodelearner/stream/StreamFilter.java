package com.dailycodelearner.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	private int id;
	private String name;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list=getAllProducts();
		
		List<Product> collect = list.stream().filter(x->x.getPrice()>32000).collect(Collectors.toList());
		System.out.println(collect.toString());
	}
	
	public static List<Product> getAllProducts(){
		
		List<Product> products=new ArrayList<>();
		
		products.add(new Product(1,"dell",25000f));
		products.add(new Product(2,"sony",32422f));
		products.add(new Product(3,"lenovo",32425f));
		products.add(new Product(4,"mac",7648f));
		return products;
		
	}

}


