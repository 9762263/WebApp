package ru.unlimit;

public class Radiator {
	public String type;
	public String size;
	public int count;
	public Double price; 
	
	public  Radiator(String type,String size,int count,Double price){
		this.type=type;
		this.size=size;
		this.count=count;
		this.price=price;
		
	}
	
	
	@Override
	public String toString() {
		return "тип=" + type + ", размер=" + size + ", кол-во=" + count + ", цена за штуку=" + price ;
	}
	
	
}
