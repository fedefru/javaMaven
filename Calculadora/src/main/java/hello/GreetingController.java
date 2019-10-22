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
        model.addAttribute("cuentas", new Cuentas());
        return "operaciones";
    }

    @PostMapping("/operaciones")
    public String greetingSubmit(@ModelAttribute Cuentas cuentas, float sum1, float sum2,float resta1,float resta2,float mult1,float mult2,float div1,float div2) {
    	cuentas.suma(sum1,sum2);
    	cuentas.resta(resta1, resta2);
    	cuentas.multiplicacion(mult1,mult2);
    	cuentas.division(div1,div2);
        return "operaciones";
    }
    
 

}
