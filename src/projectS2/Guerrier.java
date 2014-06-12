package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2ce96164-7a3d-4f46-a392-c34b3df934d2")
public class Guerrier extends Perso {
    @objid ("b1291678-4f68-41ba-8d0a-4cf112ce1b7e")
    public Guerrier(String nom, int force, int dexterite, int intelligence, int concentration) throws PersoException {
        super(nom,force, dexterite, intelligence, concentration);
        
        if ((force >= (dexterite + 10))
                && ((dexterite + 10) >= (intelligence + 10))
                && ((intelligence + 10) >= concentration)) {
        //System.out.println("guerrier conforme");
        } else {
            throw new PersoException("Erreur guerrier non conforme\nforce >= dexterite+10 >= inteligence+10 >= concentration");
        }
    }

    @objid ("4416b9a3-f9ae-4601-9000-02e72ae675bb")
    public Guerrier(String nom, int exp, int force, int dexterite, int intelligence, int concentration) throws PersoException {
        super(nom, exp ,force, dexterite, intelligence, concentration);
        
        if ((force >= (dexterite + 10))
                && ((dexterite + 10) >= (intelligence + 10))
                && ((intelligence + 10) >= concentration)) {
        //System.out.println("guerrier conforme");
        } else {
            throw new PersoException("Erreur guerrier non conforme\nforce >= dexterite+10 >= inteligence+10 >= concentration");
        }
    }

    @objid ("777ebe2e-f179-4fee-ad90-1c265f064430")
    @Override
    public String serialise() {
        return ("guerrier" + super.serialise());
    }

    @objid ("311de2df-a4e5-4388-9769-504a27cee1d6")
    @Override
    void setConcentration(int value) throws PersoException {
        if ((force >= (dexterite + 10))
                && ((dexterite + 10) >= (intelligence + 10))
                && ((value + 10) >= value)) {
            this.concentration = value;
        } else {
            throw new PersoException("Erreur guerrier non conforme\nforce >= dexterite+10 >= inteligence+10 >= concentration");
        }
    }

    @objid ("a36251a7-f978-422b-9b68-829dce9c1227")
    @Override
    void setDexterite(int value) throws PersoException {
        if ((intelligence >= (value + 10))
                && ((value + 10) >= (intelligence + 10))
                && ((intelligence + 10) >= concentration)) {
            this.dexterite = value;
        } else {
            throw new PersoException("Erreur guerrier non conforme\nforce >= dexterite+10 >= inteligence+10 >= concentration");
        }
    }

    @objid ("0ae4ed82-f7ad-4966-9dcf-a0e291c9a884")
    @Override
    void setForce(int value) throws PersoException {
        if ((value >= (dexterite + 10))
                && ((dexterite + 10) >= (intelligence + 10))
                && ((intelligence + 10) >= concentration)) {
            this.force = value;
        } else {
            throw new PersoException("Erreur guerrier non conforme\nforce >= dexterite+10 >= inteligence+10 >= concentration");
        }
    }

    @objid ("4c299e3b-1567-4d52-b18e-f0b6da608f66")
    @Override
    void setIntelligence(int value) throws PersoException {
        if ((force >= (dexterite + 10))
                && ((dexterite + 10) >= (value + 10))
                && ((value + 10) >= concentration)) {
            this.intelligence = value;
        } else {
            throw new PersoException("Erreur guerrier non conforme\nforce >= dexterite+10 >= inteligence+10 >= concentration");
        }
    }

    @objid ("155649d5-b9e6-40a2-901e-ec5b096488fd")
    public String toString() {
        return super.getInfo("guerrier");
    }

}
