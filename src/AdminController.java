import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
import com.Admin;
import dao.AdminDAO;

@Controller
public class AdminController {
	@Autowired  
	AdminDAO dao;
	
	@RequestMapping("/adminform")  
    public ModelAndView showform(){  
        return new ModelAndView("adminform","command",new Admin());  
    }  
	
	@RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("ad") Admin admin){  
        dao.saveData(admin);  
        return new ModelAndView("redirect:/");//will redirect to viewemp request mapping  
    }  
}
