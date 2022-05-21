package com.ty.shoppong.userService;

import java.util.List;

import com.ty.product.util.AES;
import com.ty.shopping.dao.ProductDao;
import com.ty.shopping.dto.Product;

public class ServiceProduct {
	ProductDao productdao=new ProductDao();
	public Product saveProduct(Product product)
	{
		String encDescription=AES.encrypt(product.getDescription(),"nits");
		product.setDescription(encDescription);
		return productdao.saveProduct(product);
	}
	
	public Product getProductById(int id)
	{
		 Product product=productdao.getProductById(id);
		 String decDescription=AES.decrypt(product.getDescription(),"nits");
		 product.setDescription(decDescription);
		 return product;
	}
	
	public List<Product> getProductByBrand(String brand)
	{
		List<Product> list=productdao.getProductByBrand(brand);
		for(Product product:list)
		{
			String decDescription=AES.decrypt(product.getDescription(),"nits");
			product.setDescription(decDescription);
		}
		return list;
	}
	
	public List<Product> getProductByPrice(double price)
	{
		List<Product> list=productdao.getProductByPrice(price);
		for(Product product:list)
		{
			String decDescription=AES.decrypt(product.getDescription(),"nits");
			product.setDescription(decDescription);
		}
		return list;
	}
	
	public List<Product> getProductByType(String type)
	{
		List<Product> list=productdao.getProductByType(type);
		for(Product product:list)
		{
			String decDescription=AES.decrypt(product.getDescription(),"nits");
			product.setDescription(decDescription);
		}
		return list;
	}
	
	public List<Product> getProductBySize(double size)
	{
		List<Product> list=productdao.getProductBySize(size);
		for(Product product:list)
		{
			String decDescription=AES.decrypt(product.getDescription(),"nits");
			product.setDescription(decDescription);
		}
		return list;
	}
	
	public Product productRating(double rating,int id)
	{
		return null;
	}


}
