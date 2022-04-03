package dao;

import dto.Product;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
@Component
public class Dao {

    public Flux<Product> getProductStream()
    {
        return Flux.range(1,10).delayElements(Duration.ofSeconds(1)).
                doOnNext(i-> System.out.println("Processing count:"+i)).map(i-> new Product(i, "product"+i));
    }
}
