package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/operaciones")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Cuentas());
        return "operaciones";
    }

    @PostMapping("/operaciones")
    public String greetingSubmit(@ModelAttribute Cuentas greeting, float n1, float n2, 
    		float n3, float n4, float n5, float n6, float n7, float n8) {
    	greeting.suma(n1,n2);
    	greeting.resta(n3, n4);
    	greeting.multiplicacion(n5,n6);
    	greeting.division(n7,n8);
        return "operaciones";
    }

}
