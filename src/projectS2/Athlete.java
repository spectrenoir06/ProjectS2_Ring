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

}
