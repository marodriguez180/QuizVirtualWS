/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politecnico.quizvirtual.restapi;

import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import politecnico.quizvirtual.model.persona;
import politecnico.quizvirtual.model.quiz;
import politecnico.quizvirtual.repository.quizRepository;

/**
 *
 * @author Mario
 */
@RestController()
@RequestMapping("/api/WSquiz")
public class quizWS {
    
    @Autowired
    quizRepository quizrepository;
    
    @RequestMapping(method = RequestMethod.GET, value="/getA")
    public List<quiz> getAllQuizes() {
        return quizrepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value="/saveQ")
    public String saveQuiz(@RequestBody String quiz) {
        try {
            JsonFactory factory = new JsonFactory();
            factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
            ObjectMapper mapper = new ObjectMapper(factory);
        
            User user = mapper.reader().forType(User.class)
            .readValue(json);
            //quizrepository.save(quiz);
            return quiz;
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
        
    }

    

    @RequestMapping(method = RequestMethod.POST, value="/getQByP")
        public List<quiz> getQuizezByPeople(@RequestBody persona person) {
        return quizrepository.findAllquizesByPeople(Integer.toString(person.getId_persona()));
    }
    
}
