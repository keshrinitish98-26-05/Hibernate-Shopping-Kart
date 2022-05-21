package com.ty.product.controller;

import com.ty.shopping.dao.ProductDao;

public class TestRating {
public static void main(String[] args) {
	ProductDao dao=new ProductDao();
	dao.productRating(4, 2);
}
}
