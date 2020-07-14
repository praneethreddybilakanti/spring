package com.config;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Validate {

    @RequestMapping("/hello")  
    //read the provided form data  
    public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model m)  
    {  
        if(name.equals("praneeth"))  
        {  
            String msg="Hello "+ name;  
            //add a message to the model  
            m.addAttribute("message", msg);  
            return "success";  
        }  
        else  
        {  
            String msg="Sorry "+ name+". You entered an incorrect password";  
            m.addAttribute("message", msg);  
            return "error";  
        }     
    }  

}
