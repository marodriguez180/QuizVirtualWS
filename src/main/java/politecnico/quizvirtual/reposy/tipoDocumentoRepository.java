/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politecnico.quizvirtual.reposy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import politecnico.quizvirtual.model.tipoDocumento;

/**
 *
 * @author Mario
 */
public interface tipoDocumentoRepository extends JpaRepository<tipoDocumento, Long> {
    
}
