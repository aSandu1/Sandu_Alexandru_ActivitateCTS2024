package FactoryMethod.fabrici;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.clase.Infirmier;

public class FabricaInfirmier implements FactoryAngajati{

    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}
