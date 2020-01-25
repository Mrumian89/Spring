package com.example.demo2.Dzieci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Mikolaj {

    private Dziecko Jas;
    private Dziecko Malgosia;
    private Dziecko Zbys;

    public Mikolaj(@Qualifier("Jan") Dziecko jas, @Qualifier("Malgorzata") Dziecko malgosia, @Qualifier("Lobuz") Dziecko zbys) {
        this.Jas = jas;
        this.Malgosia = malgosia;
        this.Zbys = zbys;
    }

    @Autowired
    public void setDlaJasia(Present dlaJasia) {
        this.Jas.daj(dlaJasia);
    }
    @Autowired
    public void setDlaMalgosi(Present dlaMalgosi) {
        this.Jas.daj(dlaMalgosi);
    }
    @Autowired
    public void setDlaZbysia(Present dlaZbysia) {
        this.Jas.daj(dlaZbysia);
    }

}
