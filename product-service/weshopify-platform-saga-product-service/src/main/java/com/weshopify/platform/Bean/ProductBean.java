package com.weshopify.platform.Bean;

public class ProductBean {

	private int id;
	private String name;
	private String type;
	private int price;
	private int qauntityResereved;
	private String status;

	public ProductBean(int id, String name, String type, int price, int qauntityResereved, String status) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.setQauntityResereved(qauntityResereved);
		this.setStatus(status);
	}

	public ProductBean() {
		super();
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQauntityResereved() {
		return qauntityResereved;
	}

	public void setQauntityResereved(int qauntityResereved) {
		this.qauntityResereved = qauntityResereved;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
