package Test;


import Base.RequestBase;
import Request.RequestBody;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Rener {


    Setenviroment env = new Setenviroment();
    RequestBase base = new RequestBase();
    RequestBody body = new RequestBody();

    @Test
    @Order(1)
    @DisplayName("Valida Metodo Post")
    public void validaMetodoPost(){
        String jsonBody = body.jsonMetodoPost("teste","02");
        Response teste = base.executePostMethod(env.setEnviromentPost(),jsonBody);
        Assert.assertEquals(teste.statusCode(), 201);
    }

    @Test
    @Order(2)
    @DisplayName("Valida Metodo Get single Users")
    public void validaMetodoGetSingleUser(){
        Response teste = base.executeGetMethod(env.setEnviromentGetSingleUsers());
        Assert.assertEquals(teste.statusCode(), 200);
        Assert.assertNotNull(teste.path("data"));
    }

    @Test
    @Order(3)
    @DisplayName("Valida Metodo Get List Users")
    public void validaMetodoGetListUser(){
        Response teste = base.executeGetMethod(env.setEnviromenGetListUsers("?page=5"));
        Assert.assertEquals(teste.statusCode(), 200);
        Assert.assertNotNull(teste.path("data"));
    }

    @Test
    @Order(4)
    @DisplayName("Valida Metodo Path")
    public void validaMetodoPath(){
        String jsonBody = body.jsonMetodoPath("ValidaPath","Rener");
        Response teste = base.executePathMethod(env.setEnviromentPost(),jsonBody);
        Assert.assertEquals(teste.statusCode(), 200);
    }



}

/**
 * Carlos Eduardo de Moura Saores
 */