package com.yedam.store;

public class Store {
//	store_id NUMBER PRIMARY KEY,
//	store_name VARCHAR2(100),
//	store_tel VARCHAR2(15),
//	store_addr VARCHAR2(100),
//	store_sales NUMBER
	private int storeId;
	private String storeName;
	private String storeTel;
	private String storeAddr;
	private int storeSales;
	private int sum;
	
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreTel() {
		return storeTel;
	}
	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}
	public String getStoreAddr() {
		return storeAddr;
	}
	public void setStoreAddr(String storeAddr) {
		this.storeAddr = storeAddr;
	}
	public int getStoreSales() {
		return storeSales;
	}
	public void setStoreSales(int storeSales) {
		this.storeSales = storeSales;
	}
	
	
	
	
}
