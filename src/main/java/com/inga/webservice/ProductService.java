package com.inga.webservice;

import com.inga.bean.Product;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by abing on 2016/10/20.
 */
@WebService
public interface ProductService {

    @GET
    @Path("/products")
    @Produces("application/json")
    List<Product> retriveAllProduects();


    @GET
    @Path("/product/{id}")
    @Produces("application/json")
    Product retriveProductById(@PathParam("id") long id);


    @POST
    @Path("/products")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    List<Product> retriveProductsByName(@FormParam("name") String name);


    @POST
    @Path("/product")
    @Consumes("application/json")
    @Produces("application/json")
    Product createProduct(Product product);

    @PUT
    @Path("/product/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    Product updateProductById(@PathParam("id") long id );


    @DELETE
    @Path("/product/{id}")
    @Produces("application/json")
    Product deleteProductById(@PathParam("id") long id);



}
