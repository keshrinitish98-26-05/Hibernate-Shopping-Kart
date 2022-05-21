package com.ty.product.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shoppong.userService.ServiceProduct;

public class TestGetProductByPrice {
	
	public static void main(String[] args) {
		
		ServiceProduct serviceProduct=new ServiceProduct();
		List<Product> list=serviceProduct.getProductByPrice(3000);
		if(list.size()>0)
		{
			for(Product product : list)
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
		}
		else
		{
			System.out.println("Not a single product present of this price ");
		}
	}

}
