package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3b77d382-6f41-4706-b8fb-4ada146d0e49")
public class Athlete extends Perso {
    @objid ("55aeeff6-eeca-497b-aa34-d71a1242777c")
    public Athlete(String nom, int force, int dexterite, int intelligence, int concentration) throws PersoException {
        super(nom, force, dexterite, intelligence, concentration);
        if ((force >= 20) && (dexterite >= 20) && (intelligence >= 20) && (concentration >= 20) ){
            
        }else{
            throw new PersoException("Erreur athlete non conforme\n");
        }
    }

    @objid ("95ef73d3-a29c-4da3-95f9-169f2b607499")
    public String toString() {
        return super.getInfo("Athlete");
    }

    @objid ("edbbf7f5-0084-498a-af83-12995226b7fb")
    @Override
    public String serialise() {
        return getSerialise("athlete");
    }

    @objid ("734b10e0-efa5-46e0-8674-79a99c9e5765")
    public Athlete(String nom, int exp, int force, int dexterite, int intelligence, int concentration) throws PersoException {
        super(nom, exp, force, dexterite, intelligence, concentration);
        if ((force >= 20) && (dexterite >= 20) && (intelligence >= 20) && (concentration >= 20) ){
            
        }else{
            throw new PersoException("Erreur athlete non conforme\n");
        }
    }

	@Override
	void setForce(int value) throws PersoException {
		if ((value >= 20) && (getDexterite() >= 20) && (getIntelligence() >= 20) && (getConcentration() >= 20) ){
            this.force = value;
        }else{
            throw new PersoException("Erreur athlete non conforme\n");
        }
		
	}

	@Override
	void setDexterite(int value) throws PersoException {
		if ((getForce() >= 20) && (value >= 20) && (getIntelligence() >= 20) && (getConcentration() >= 20) ){
            this.dexterite = value;
        }else{
            throw new PersoException("Erreur athlete non conforme\n");
        }
		
	}

	@Override
	void setIntelligence(int value) throws PersoException {
		
		if ((getForce() >= 20) && (getDexterite() >= 20) && (value >= 20) && (getConcentration() >= 20) ){
            this.intelligence = value;
        }else{
            throw new PersoException("Erreur athlete non conforme\n");
        }
	}

	@Override
	void setConcentration(int value) throws PersoException {
		if ((getForce() >= 20) && (getDexterite() >= 20) && (getIntelligence() >= 20) && (value >= 20) ){
            this.concentration = value;
        }else{
            throw new PersoException("Erreur athlete non conforme\n");
        }
	}
    
}
