package WeatherApplication.my.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping ("/weather-app")
    public String weather (Model model){
        model.addAttribute("text", "Witamy na naszej stronie!");
        return "WeatherForm";

    }




}
