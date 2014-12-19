package com.javakurs.personelbilgi.service;

import com.javakurs.personelbilgi.entity.Kisi;
import com.javakurs.personelbilgi.facede.KisiFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author SBN
 */
@Stateless
public class KisiService {

    @EJB
    private KisiFacade kisiFacade;
    
    public void ekle(Kisi p_kisi) {
        kisiFacade.create(p_kisi);
    }
    
}
