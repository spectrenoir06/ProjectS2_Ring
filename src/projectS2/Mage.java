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
        return ("mage" + super.serialise());
    }

    @objid ("9012d071-049c-425c-b9a4-30a08743b42c")
    public Mage(String nom, int exp, int force, int dexterite, int intelligence, int concentration) throws PersoException {
        super(nom,exp, force, dexterite, intelligence, concentration);
        if ((intelligence >= (Math.max(force,dexterite) + 15)) && (concentration >= Math.max(force,dexterite) + 15)){
            
        }else{
            throw new PersoException("Erreur mage non conforme\n");
        }
    }

    @objid ("40579d81-06e2-42de-b206-8c1b1c4d8d3b")
    @Override
    void setForce(int value) throws PersoException {
        if ((intelligence >= (Math.max(value,dexterite) + 15)) && (concentration >= Math.max(value,dexterite) + 15)){
            force = value;
        }else{
            throw new PersoException("Erreur mage non conforme\n");
        }
    }

    @objid ("6a01cbe0-20af-4d0a-9d8f-f709941b0426")
    @Override
    void setDexterite(int value) throws PersoException {
        if ((intelligence >= (Math.max(force,value) + 15)) && (concentration >= Math.max(force,value) + 15)){
            this.dexterite= value;
        }else{
            throw new PersoException("Erreur mage non conforme\n");
        }
    }

    @objid ("1560dd54-687e-4b7e-bfef-13dd8b6308c8")
    @Override
    void setIntelligence(int value) throws PersoException {
        if ((value >= (Math.max(force,dexterite) + 15)) && (concentration >= Math.max(force,dexterite) + 15)){
            this.intelligence = value;
        }else{
            throw new PersoException("Erreur mage non conforme\n");
        }
    }

    @objid ("a14a0857-a7be-44ec-b679-06699988f240")
    @Override
    void setConcentration(int value) throws PersoException {
        if ((intelligence >= (Math.max(force,dexterite) + 15)) && (value >= Math.max(force,dexterite) + 15)){
            this.concentration = value;
        }else{
            throw new PersoException("Erreur mage non conforme\n");
        }
    }

}
