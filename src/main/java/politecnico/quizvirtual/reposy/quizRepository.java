/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politecnico.quizvirtual.reposy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import politecnico.quizvirtual.model.quiz;

/**
 *
 * @author Mario
 */
@Repository
public interface quizRepository extends JpaRepository<quiz, Long>{
    
    @Query(nativeQuery = true, value = "SELECT q FROM quizes q INNER JOIN detalleQuizPersonas dqp ON dqp.Id_quiz = q.Id_quiz INNER JOIN personas p ON p.Id_persona = dqp.Id_persona ")
    List<quiz> findAllquizesByPeople(String idPeople);

}
