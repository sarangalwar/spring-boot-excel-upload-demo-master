package com.github.chen0040.bootslingshot.services;


import com.github.chen0040.bootslingshot.viewmodels.Product;
import com.github.chen0040.bootslingshot.viewmodels.Provider;

import java.util.List;


/**
 * Created by xschen on 9/11/2017.
 */
public interface ProductApi {
   Product saveProduct(Product newProduct);
   Provider saveProvider(Provider newProvider);
   List<Product> findAll();
}
