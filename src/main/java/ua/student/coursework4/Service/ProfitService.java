package ua.student.coursework4.Service;

import org.springframework.stereotype.Service;
import ua.student.coursework4.Entity.Profit;
import ua.student.coursework4.Repo.ProfitRepository;

import java.util.List;

@Service
public class ProfitService {
    private final ProfitRepository profitRepository;

    public ProfitService(ProfitRepository ProfitRepository) {
        this.profitRepository = ProfitRepository;
    }

    public List<Profit> listProfit (){
//        if (article != null)
//            return profitRepository.findByArticle(article);
        return profitRepository.findAll();
    }

    public boolean addProfit (String article, Double january, Double february, Double march, Double april, Double may, Double june,
                              Double july, Double august, Double september, Double october, Double november, Double december, Double year){
        if(profitRepository.existsByArticle(article))
            return false;
        Profit profit = new Profit(article,january,february,march,april,may,june,july,august,september,october,november,december,year);
        profitRepository.save(profit);
        return true;
    }

}
