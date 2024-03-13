package clase;

import static clase.TipAngajat.ASISTENT;

public class FactoryPersonal{

    public PersonalSpital creareAngajat(TipAngajat tipAngajat,String nume,int salariu, int vechime)
    {

        switch (tipAngajat)
        {
            case BRANCARDIER:return new Brancardier(nume,salariu);
            case ASISTENT: return new Asistent(nume,salariu);
            case MEDIC: return new Medic(nume,salariu,vechime);
            default: return null;
        }
    }

}
