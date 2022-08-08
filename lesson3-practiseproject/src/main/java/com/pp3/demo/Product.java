package com.pp3.demo;


public class Product {
	
	private int pid;
	private String pname;
	private String ptype;
	private int price;
	
	public Product() {
		
	}
	
	
	public Product(String pname, String ptype, int price){
		this.pname = pname;
		this.ptype = ptype;
		this.price = price;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}