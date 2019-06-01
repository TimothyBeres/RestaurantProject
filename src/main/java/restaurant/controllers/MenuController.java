package restaurant.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import restaurant.Application;
import restaurant.Services.MenuService;
import restaurant.models.FoodItem;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/menu")
@RestController
public class MenuController  {
    @Autowired
    private MenuService menuService;

    @GET
    @Produces("application/json")
    public JsonArray getAll()
    {
        logger.info("In menu controller");
        JsonArrayBuilder builder = Json.createArrayBuilder();
        for(FoodItem foodItem: menuService.getAll(null,null) )
        {
            builder.add(Json.createObjectBuilder().add("id", foodItem.getID()));
        }
        return builder.build();
    }
    private static Logger logger = LoggerFactory.getLogger(Application.class);
}
