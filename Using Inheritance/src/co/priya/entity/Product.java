package co.priya.entity;

public class Product {

	private int id;
	private String name;
	private double price;
	
	public Product() {
		
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void print()
	{
		System.out.println("Id     = " + id);
		System.out.println("Name   = " + name);
		System.out.println("Price  = " + price);
	}
}
