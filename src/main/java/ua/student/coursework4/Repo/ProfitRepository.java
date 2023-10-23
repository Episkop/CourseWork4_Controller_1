package ua.student.coursework4.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.student.coursework4.Entity.Profit;

import java.util.List;

@Repository
public interface ProfitRepository extends JpaRepository <Profit,Long> {
    List<Profit> findByArticle (String article);
    boolean existsByArticle (String article);
}
