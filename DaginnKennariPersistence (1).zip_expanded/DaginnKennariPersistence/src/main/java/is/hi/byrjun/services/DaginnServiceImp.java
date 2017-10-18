
package is.hi.byrjun.services;

import is.hi.byrjun.model.Kennari;
import is.hi.byrjun.repository.KennariRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ebba Þóra Hvannberg 
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */

@Service
public class DaginnServiceImp implements DaginnService{

    // Tenging yfir í safn af kennurum 
    @Autowired
    KennariRepository kennariRep;
    
    @Override
    public boolean erNafnRett(String nafn) {
        return true;
    }

    @Override
    public void addKennari(Kennari k) {
         kennariRep.save(k);    // Notum save en ekki add
    }

    @Override
    public List<Kennari> allirKennarar() {
        return kennariRep.findAll();    // Notum findAll í staðinn fyrir getAll
    }
    
    @Override
    public Kennari save(Kennari kennari) {
        return kennariRep.save(kennari);
    }

    @Override
    public List<Kennari> finnaAlla3Stafi() {
        return kennariRep.findAllWithNameLongerThan3Chars();
    }
    
}
