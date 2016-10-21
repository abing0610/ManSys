package com.inga.webservice.impl;

import com.inga.bean.Product;
import com.inga.webservice.ProductService;
import org.springframework.objenesis.instantiator.sun.MagicInstantiator;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.ws.rs.FormParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@WebService
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> retriveAllProduects() {
        List<Product> list = new ArrayList<>();
        Product product = new Product();
        product.setId(1);
        product.setCount(111);
        product.setDemo("inga");
        list.add(product);
        return list;
    }

    @Override
    public Product retriveProductById(long id) {

        return initProuuct();
    }

    @Override
    public List<Product> retriveProductsByName(@FormParam("name") String name) {
        List<Product> list = new ArrayList<>();
        list.add(initProuuct());
        list.add(initProuuct());
        list.add(initProuuct());

        return list;
    }

    @Override
    public Product createProduct(Product product) {
        return initProuuct();
    }

    @Override
    public Product updateProductById(long id ) {
        return initProuuct();
    }

    @Override
    public Product deleteProductById(long id) {
        return initProuuct();
    }


    public Product initProuuct(){
        Product product = new Product();
        product.setId(1);
        product.setCount(11);
        product.setName("inga");
        product.setDemo("demo");
        return  product;
    }
}
