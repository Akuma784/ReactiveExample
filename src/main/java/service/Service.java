package service;

import dao.Dao;
import dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;


public class Service {
    @Autowired
    Dao dao;

    public Flux<Product> loadAllProduct()
    {
        long start = System.currentTimeMillis();
        Flux<Product> product = dao.getProductStream();
        long end = System.currentTimeMillis();
        System.out.println("Total execution time"+(end-start));
        return product;
    }
}
