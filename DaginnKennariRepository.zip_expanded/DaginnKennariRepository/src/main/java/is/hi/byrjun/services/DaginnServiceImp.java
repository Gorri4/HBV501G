
package is.hi.byrjun.services;

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

    @Override
    public boolean erNafnRett(String nafn) {
        return true;
    }
    
}
