package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00ca71f7-3659-487b-88f1-78c4fc3a1a0a")
public class Bouclier extends Capacite {
    @objid ("53093309-83ee-4828-81ae-97c2591249ac")
    private int maniabilite;

    @objid ("ef1fb900-e25b-4f68-a9d0-3501bf6a2756")
    private int protection;

    public Bouclier(int maniabilite, int protection) {
    	super();
		this.maniabilite 	= maniabilite;
		this.protection		= protection;
	}

	@objid ("56df0985-cd99-4cf1-b986-d21405b84f02")
    @Override
    public void use(Perso p) {
        // TODO Auto-generated method stub
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

	@Override
	public String toString() {
		String s = "Bouclier";
		s = s + "	| maniabilite	=	" + this.maniabilite;
		s = s + "	| protection	=	" + this.protection + "	|";
		return s;
	}

}
