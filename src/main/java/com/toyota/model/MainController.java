package com.toyota.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController
{
    @RequestMapping("/car")
    public String cardisplay(HttpServletRequest parm, HttpServletRequest parm2,HttpServletRequest parm3)
    {
        Car v = new Car();
        String color = parm.getParameter("carcolor");
        v.setColor(color);
        String model = parm2.getParameter("model");
        v.setModel(model);

        v.setAccelerate();
       // System.out.println(v.getColor());

    }
        @Override
        public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}

