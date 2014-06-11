package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00ca71f7-3659-487b-88f1-78c4fc3a1a0a")
public class Bouclier extends Capacite {
    @objid ("53093309-83ee-4828-81ae-97c2591249ac")
    private int maniabilite;

    @objid ("ef1fb900-e25b-4f68-a9d0-3501bf6a2756")
    private int protection;

    @objid ("57a1386a-d2d6-470b-bd32-f9a0faf6807a")
    public Bouclier(int maniabilite, int protection) throws CapaciteException {
        super(); 
        if (( maniabilite>=20) && (protection>=20)&& ((maniabilite+protection)==100)) { 
            this.protection = protection;
            this.maniabilite = maniabilite;
        }else {
        	throw new CapaciteException("Bouclier non conforme.");
        }
    }

    @objid ("56df0985-cd99-4cf1-b986-d21405b84f02")
    @Override
    public void use(Perso p) {
        System.out.println(this.getPerso().getNom() + " pare");
        System.out.println("[ reussite = " + this.getReussite() + " ; efficacite : " + this.getParadePuissance() + " ]" );
    }

    @objid ("c3145c17-3708-4879-8965-4e0934f2e1b3")
    public int getManiabilite() {
        return maniabilite;
    }

    @objid ("d3828d7d-1879-408a-a8b2-721cae1049ef")
    public void setManiabilite(int maniabilite) {
        this.maniabilite = maniabilite;
    }

    @objid ("c726886d-8f7f-44da-a9d1-6e8a00cf709f")
    public int getProtection() {
        return protection;
    }

    @objid ("767702db-8667-47ea-bb4a-b1aca6318f8a")
    public void setProtection(int protection) {
        this.protection = protection;
    }

    @objid ("f7c44198-99cd-41f8-bc67-1aa8d55d31b8")
    @Override
    public String toString() {
        String s = "Bouclier";
        s = s + "\t| maniabilite\t=\t" + this.maniabilite;
        s = s + "\t| protection\t=\t" + this.protection + "\t|";
        return s;
    }

    @objid ("a0a62c16-f43d-41a5-bf21-d0721eac1b50")
    @Override
    public double getReussite() {
        return ( (this.getPerso().getDexterite() * this.maniabilite) / 10000.0);
    }

    @objid ("2c6a75da-4f7e-42ab-ba03-df3814a7e5be")
    @Override
    public double getParadePuissance() {
        return (this.getPerso().getForce() * this.protection / 100.0);
    }

    @objid ("cefb9962-a69c-4704-ab09-aed47c41a9f8")
    @Override
    public double getAttaquePuissance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @objid ("39b4e3ce-57ff-4e70-b63d-91dfa54597e6")
    @Override
    public String serialise() {
        return ("bouclier;" + this.maniabilite + ";" + this.protection);
    }

}
