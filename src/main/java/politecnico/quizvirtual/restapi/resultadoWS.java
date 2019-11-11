/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politecnico.quizvirtual.restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import politecnico.quizvirtual.model.resultados;
import politecnico.quizvirtual.repository.resultadoRepository;

/**
 *
 * @author Mario
 */
@RestController()
@RequestMapping("/api/WSresultado")
public class resultadoWS {
    
    @Autowired
    resultadoRepository resultadorepository;
    
    @RequestMapping(method = RequestMethod.GET, value="/getA")
    public List<resultados> getAllQuizes() {
        return resultadorepository.findAll();
    }
}
