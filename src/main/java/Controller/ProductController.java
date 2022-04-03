package Controller;


import dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import service.Service;

@RestController
@RequestMapping("/Product")

public class ProductController {

    @Autowired
    private Service service;

    @GetMapping("/")
    public Flux<Product> getAllProduct()
    {
        return service.loadAllProduct();
    }


}
