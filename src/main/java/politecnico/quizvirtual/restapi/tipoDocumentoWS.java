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

import politecnico.quizvirtual.model.tipoDocumento;
import politecnico.quizvirtual.repository.tipoDocumentoRepository;

/**
 *
 * @author Mario
 */
@RestController()
@RequestMapping("/api/WStipoDocumento")
public class tipoDocumentoWS {
    
    @Autowired
    tipoDocumentoRepository tipodocumentorepository;
    
    @RequestMapping(method = RequestMethod.GET, value="/getA")
    public List<tipoDocumento> getAllDocumentType() {
        return tipodocumentorepository.findAll();
    }

}
