package FactoryMethod.main;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.fabrici.FabricaAsistent;
import FactoryMethod.fabrici.FabricaInfirmier;
import FactoryMethod.fabrici.FabricaMedic;
import FactoryMethod.fabrici.FactoryAngajati;

public class Main {
    public static void main(String[] args) {
        FactoryAngajati factoryAngajati = new FabricaAsistent();

        procesareAngajat(factoryAngajati, " rares ", 10000);
        procesareAngajat(new FabricaMedic()," vlad ", 12000);
        procesareAngajat(new FabricaInfirmier(), " razvan ", 1000);
    }

    public static void procesareAngajat(FactoryAngajati factory,String nume, int salariu)
    {
        PersonalSpital angajat= factory.creareAngajat(nume,salariu);
        angajat.afisare();
    }

}
