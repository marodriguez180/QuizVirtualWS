/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politecnico.quizvirtual.zS;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import politecnico.quizvirtual.model.quiz;
import politecnico.quizvirtual.reposy.quizRepository;

/**
 *
 * @author Mario
 */
@RestController()
@RequestMapping("/api/")
public class personaWS {
    
    @Autowired
    quizRepository quizrepository;
    
    @GetMapping("/WS")
    public List<quiz> postController(@PathVariable String token) {
        System.out.println(token);
        if ("2".equals(token)){
            System.out.println("same");
            return quizrepository.findAll();
        }
        return null;
    }
}
