package com.example.action;



import com.example.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yonyou on 2/06/2017.
 */
@RestController
public class HelloConroller
{
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }
}
