package com.ty.product.controller;
import com.ty.shopping.dto.Product;
import com.ty.shoppong.userService.ServiceProduct;

public class TestSaveProduct {
	
	public static void main(String[] args) {
		
		Product product=new Product();
		product.setName("Shoe");
		product.setBrand("Rashmi");
		product.setPrice(2500);
		product.setSize(6);
		product.setType("muttu");
		product.setDescription("cvcv");
		ServiceProduct serviceProduct=new ServiceProduct();
		Product product2=serviceProduct.saveProduct(product);
		if(product2!=null)
		{
			System.out.println("Product inserted");
		}
		else
		{
			System.out.println("Not inserted");
		}
	}

}
