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
        return "home.html";
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
    
    @RequestMapping("/home.html")
    public String home() {
        return "home.html";
    }
    
    @RequestMapping("/alumni.html")
    public String alumni() {
        return "alumni.html";
    }
    
    @RequestMapping("/contact-us.html")
    public String contactUs() {
        return "contact-us.html";
    }
    
    @RequestMapping("/courses-offered.html")
    public String coursesOffered() {
        return "courses-offered.html";
    }
    
    @RequestMapping("/faculty&research.html")
    public String facultyResearch() {
        return "faculty&research.html";
    }
    
    @RequestMapping("/history.html")
    public String history() {
        return "history.html";
    }
    
    @RequestMapping("/policy.html")
    public String policy() {
        return "policy.html";
    }
    
    @RequestMapping("/procedure.html")
    public String procedure() {
        return "procedure.html";
    }
    
    @RequestMapping("/students.html")
    public String studentLife() {
        return "students.html";
    }
}