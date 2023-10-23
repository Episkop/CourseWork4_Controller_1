package ua.student.coursework4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.student.coursework4.Entity.Profit;
import ua.student.coursework4.Service.ProfitService;

import java.util.List;

@Controller
@RequestMapping("/profit")
public class profitController {

    private final ProfitService profitService;

    public profitController(ProfitService profitService) {
        this.profitService = profitService;
    }

    @GetMapping()
    public String profit(Model model){
        List<Profit> listProfit = profitService.listProfit();
        model.addAttribute("listProfit",listProfit);
        return "index";
    }

}
