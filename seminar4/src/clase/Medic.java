package clase;

public class Medic extends PersonalSpital{
    public  int vechime;

    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    public Medic(String nume, int salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public void afisare() {
        System.out.println("Medicul" + super.getNume() + "are salariul " +super.getSalariu()+ "si o vechime de " + vechime);

    }
}
