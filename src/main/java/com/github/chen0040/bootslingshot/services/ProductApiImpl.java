package com.github.chen0040.bootslingshot.services;


import com.github.chen0040.bootslingshot.viewmodels.Product;
import com.github.chen0040.bootslingshot.viewmodels.Provider;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by xschen on 9/11/2017.
 */
@Service
public class ProductApiImpl implements ProductApi {
   private List<Product> products = new ArrayList<>();
   private List<Provider> providers = new ArrayList<>();
   

   @Override public Product saveProduct(Product newProduct) {
      products.add(newProduct);      
      System.out.println("Products list is "+ products);
      return newProduct;
   }
   
   @Override public Provider saveProvider(Provider newProvider) {	   
	   providers.add(newProvider);      
	   System.out.println("providers list is "+ newProvider.toString());
	   
	   return newProvider;
   }


   @Override public List<Product> findAll() {
      return products;
   }
}
