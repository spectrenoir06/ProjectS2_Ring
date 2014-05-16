package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f5244599-2cfc-4b08-ac78-23c366dc4a5a")
public class Mage extends Perso {
    @objid ("bc7132a3-b3ed-4191-88f0-78cf71ad56c3")
    public Mage(String nom, int force, int dexterite, int intelligence, int concentration) throws PersoException {
        super(nom, force, dexterite, intelligence, concentration);
        if ((intelligence >= (Math.max(force,dexterite) + 15)) && (concentration >= Math.max(force,dexterite) + 15)){
            
        }else{
            throw new PersoException("Erreur mage non conforme\n");
        }
    }

    @objid ("5d584aa6-6075-4bb0-8fdc-5f21ebaf0602")
    public String toString() {
        return super.getInfo("mage");
    }

    @objid ("69984f1d-e41d-491f-b53a-fa060701f048")
    @Override
    public String serialise() {
        return getSerialise("mage");
    }

    @objid ("9012d071-049c-425c-b9a4-30a08743b42c")
    public Mage(String nom, int exp, int force, int dexterite, int intelligence, int concentration) throws PersoException {
        super(nom,exp, force, dexterite, intelligence, concentration);
        if ((intelligence >= (Math.max(force,dexterite) + 15)) && (concentration >= Math.max(force,dexterite) + 15)){
            
        }else{
            throw new PersoException("Erreur mage non conforme\n");
        }
    }

}
