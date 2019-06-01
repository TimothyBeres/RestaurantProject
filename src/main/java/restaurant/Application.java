package restaurant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import restaurant.models.FoodItem;
import restaurant.repository.FoodItemRepository;
import restaurant.repository.OrderRepository;


@SpringBootApplication
@ComponentScan(basePackages= {"restaurant.controllers"})
public class Application extends javax.ws.rs.core.Application{

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner initMenu(FoodItemRepository foodItems, OrderRepository orders)
    {
        logger.info("adding 1 food item");
        return (args) -> {foodItems.save(new FoodItem("Chkn Wings", "Hot wings", 15.3, "Appertizer"));};
    }
}
