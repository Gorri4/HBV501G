/*
 * Copyright (C) 2017 Ebba Þóra Hvannberg 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Ebba Þóra Hvannberg 
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * 
 * Kennari klasi inniheldur nafn kennarans og heimilisfang
 */

// Skilgreinum Entity og Table fyrir gagnagrunninn
@Entity
@Table (name="kennari")
public class Kennari {
    
    // Skilgrein id sem auðkenni (e. identity)  hlutarins 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nafn;
    private String heimilisfang;

    // Smiður til að búa til tóman hlut. Hefur enga parametra
    public Kennari() {
    }

    public String getNafn() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn = nafn;
    }

    public String getHeimilisfang() {
        return heimilisfang;
    }

    public void setHeimilisfang(String heimilisfang) {
        this.heimilisfang = heimilisfang;
    }
   
    
    public Kennari (String n, String h) {
        nafn = n;
        heimilisfang = h;
    }
    
    @Override
    public String toString() {
        return String.format("<BR>" + "nafn: "+nafn + "<BR>" +"heimilisfang: "+heimilisfang);
    }
    
}
