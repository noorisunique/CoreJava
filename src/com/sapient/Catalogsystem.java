package com.sapient;

import java.util.ArrayList;

interface Catalog {
	public void showAllProducts();

	public void addDiscount(double discountPercent);
}

class Product implements Catalog {
	private String prodId;
	private String prodName;
	private double price;

	public Product(String prodId, String prodName, double price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}

	@Override
	public void addDiscount(double discountPercent) {
		price = price - ((discountPercent * price) / 100);
	}

	@Override
	public void showAllProducts() {
		System.out.println("Product id: " + prodId + " " + "prodName: " + prodName + " price : " + price + "");
	}
}

class Department implements Catalog {
	private ArrayList<Catalog> subCatalogList = new ArrayList<Catalog>();
	private String departmentId;
	private String departmentName;

	public Department(String departmentId, String departmentName) {
		this.departmentName = departmentName;
		this.departmentId = departmentId;
	}

	public void addProduct(Catalog catalog) {
		subCatalogList.add(catalog);
	}

	public void addSubDepartment(Catalog catalog) {
		subCatalogList.add(catalog);
	}

	@Override
	public void addDiscount(double discountPercent) {
		for (Catalog subCatalog : subCatalogList) {
			subCatalog.addDiscount(discountPercent);
		}
	}

	@Override
	public void showAllProducts() {
		for (Catalog subCatalog : subCatalogList) {
			subCatalog.showAllProducts();
		}
	}
}

class CatalogDirectory implements Catalog {
	private ArrayList<Catalog> departmentList = new ArrayList<Catalog>();

	public void addDepartment(Catalog department) {
		departmentList.add(department);
	}

	@Override
	public void addDiscount(double discountPercent) {
		for (Catalog subCatalog : departmentList) {
			subCatalog.addDiscount(discountPercent);
		}
	}

	@Override
	public void showAllProducts() {
		for (Catalog subCatalog : departmentList) {
			subCatalog.showAllProducts();
		}
	}
}

public class Catalogsystem {
	public static void main(String args[]) {
		CatalogDirectory directory = new CatalogDirectory();
		Department groceries = new Department("1", "Groceries");
		Department furniture = new Department("2", "furniture");
		Department perishables = new Department("7", "Perishables");

		Product bed = new Product("3", "bed", 13000);
		Product almirah = new Product("4", "almirah", 15000);
		Product apple = new Product("5", "apple", 100);
		Product guava = new Product("6", "guava", 200);
		Product cheese = new Product("8", "cheese", 50);
		Product chocolate = new Product("9", "chocolate", 20);

		perishables.addProduct(chocolate);
		perishables.addProduct(cheese);
		
		groceries.addSubDepartment(perishables);
		groceries.addProduct(apple);
		groceries.addProduct(guava);

		groceries.addSubDepartment(perishables);

		furniture.addProduct(bed);
		furniture.addProduct(almirah);

		directory.addDepartment(groceries);
		directory.addDepartment(furniture);

		directory.showAllProducts();

		directory.addDiscount(5);

		directory.showAllProducts();

	}
}
