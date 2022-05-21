package com.ty.product.controller;

import com.ty.shopping.dto.Product;
import com.ty.shoppong.userService.ServiceProduct;

public class TestGetProductById {
	
	public static void main(String[] args) {
		
		ServiceProduct serviceProduct=new ServiceProduct();
		Product product =serviceProduct.getProductById(1);
		if(product!=null)
		{
			System.out.println("Id : "+product.getId());
			System.out.println("Name : "+product.getName());
			System.out.println("Brand : "+product.getBrand());
			System.out.println("Price : "+product.getPrice());
			System.out.println("Type : "+product.getType());
			System.out.println("Size : "+product.getSize());
			System.out.println("Description : "+product.getDescription());
			System.out.println("rating : "+product.getRating());
		}
		else
		{
			System.out.println("No such product present");
		}
	}

}
