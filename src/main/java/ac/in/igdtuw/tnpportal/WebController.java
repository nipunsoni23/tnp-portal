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
    public String index() {
    	return "redirect:/dashboard.html";
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
    
    @RequestMapping("/register.html")
    public String policy() {
        return "register.html";
    }
    
    @RequestMapping("/procedure.html")
    public String procedure() {
        return "procedure.html";
    }

    @RequestMapping("/students.html")
    public String studentLife() {
        return "students.html";
    }
    
    @RequestMapping("/dashboard.html")
    public String dashboard() {
        return "dashboard.html";
    }
    
    @RequestMapping("/calendar.html")
    public String calendar() {
        return "calendar.html";
    }
    
    @RequestMapping("/notifications.html")
    public String notifications() {
        return "notifications.html";
    }
    
    @RequestMapping("/results.html")
    public String results() {
        return "results.html";
    }
    
    @RequestMapping("/user.html")
    public String user() {
        return "user.html";
    }
    
}