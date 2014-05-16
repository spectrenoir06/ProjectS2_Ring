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

    @objid ("155649d5-b9e6-40a2-901e-ec5b096488fd")
    public String toString() {
        return super.getInfo("guerrier");
    }

    @objid ("777ebe2e-f179-4fee-ad90-1c265f064430")
    @Override
    public String serialise() {
        return getSerialise("guerrier");
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

}
