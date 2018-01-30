package com.toyota.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController
{
    @RequestMapping("/car")
    public String cardisplay(HttpServletRequest parm)
    {
        Car v = new Car();
        int accele ;
        String color = parm.getParameter("carcolor");
        v.setColor(color);
        String model = parm.getParameter("model");
        v.setModel(model);
        String speed = parm.getParameter("speed");
        v.setSpeed(speed);
        accele = Integer.parseInt(speed);
        if (accele > 65){v.setAccelerate("is accelerating");}
        else {v.setAccelerate("is not accelerating");}


        return "The " + v.getColor() + " " + v.getModel() + " is " + v.start() + "<br/>" +
               "The " + v.getColor() + " " + v.getModel() + " is going  " + v.getSpeed()+ " mph" + "<br/>" +
               "The " + v.getColor() + " " + v.getModel() + " is going  " + v.getAccelerate()+ "<br/>" +
               "The " + v.getColor() + " " + v.getModel() + " is " + v.stop();

        // return v.start() + v.getColor() +v.getModel() + "is going " + v.getSpeed() + v.stop();

    }

}

