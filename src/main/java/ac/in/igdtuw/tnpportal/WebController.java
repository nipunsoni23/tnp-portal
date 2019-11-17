package ac.in.igdtuw.tnpportal;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;


@Controller
public class WebController {
    
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "You made it!";
    }

    // Login form
    @RequestMapping("/login.html")
    public String login() {
        return "login.html";
    }

    // Login form with error
    @RequestMapping("/login-error.html")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login.html";
    }

    @RequestMapping("/logout")
    public String logout(SessionStatus session) {
    	SecurityContextHolder.getContext().setAuthentication(null);
        session.setComplete();
    	return "redirect:/login.html";
    }
}