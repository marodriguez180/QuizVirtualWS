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

import politecnico.quizvirtual.model.carreraObservacion;
import politecnico.quizvirtual.repository.carreraObservacionRepository;


/**
 *
 * @author Mario
 */
@RestController()
@RequestMapping("/api/WScarreraObservacion")
public class carreraObserbacionWS {
    
    @Autowired
    carreraObservacionRepository carreraobservacionrepository;
    
    @RequestMapping(method = RequestMethod.GET, value="/getA")
    public List<carreraObservacion> getAllObservationRace() {
        return carreraobservacionrepository.findAll();
    }

}
