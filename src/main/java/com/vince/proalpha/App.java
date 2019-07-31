package com.vince.proalpha;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import java.util.*;

public class App 
{
    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
      test1();
    }

    public static void test1() {
      ObjectMapper om = new ObjectMapper();
      String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
      try {
        Car car = om.readValue(json, Car.class);
        logger.info("car: {}: {}", car.getType(), car.getColor());
      }
      catch (JsonParseException e) { e.printStackTrace(); }
      catch (JsonMappingException e) { e.printStackTrace(); }
      catch (IOException e) { e.printStackTrace(); }
    }
}
