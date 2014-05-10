package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("29c9df37-9007-453f-a034-2219fdec1aa0")
public class Epee extends Capacite {
    @objid ("4d6f2c02-204e-448a-a2de-fdf0d42784b1")
    private int impact;

    @objid ("c16c511b-5486-46cc-a80a-59265653e079")
    private int parade;

    @objid ("6f785fc0-1a3d-4b17-8226-93b28cfadcc4")
    private int maniabilite;

    @objid ("710720c3-8c3c-4036-84f9-d24e23b8ddce")
    public Epee(int imp, int para, int mani) {
    	super();
        this.impact = imp;
        this.parade = para;
        this.maniabilite = mani;
    }

    @objid ("af31861a-60c2-4f25-89e6-206e15370dd9")
    public void use(Perso p) {
        if (p==super.getPerso()){
            System.out.println(this.getPerso().getNom() + " pare");
        }else{
            System.out.println(this.getPerso().getNom() + " attaque " + p.getNom());
        }
    }

    @objid ("c5408822-811d-4d41-9776-5a4eead7af11")
    public int getImpact() {
        return impact;
    }

    @objid ("f6b5ec53-fadd-44d0-8e33-82135b6b394d")
    public void setImpact(int impact) {
        this.impact = impact;
    }

    @objid ("6badddee-6197-4534-a376-21b41bd211b1")
    public int getParade() {
        return parade;
    }

    @objid ("a0cfbb67-1f85-4db1-a48e-8fcd815836f7")
    public void setParade(int parade) {
        this.parade = parade;
    }

    @objid ("5ffa7598-b0c9-43d2-a7b5-f5a24e399714")
    public int getManiabilite() {
        return maniabilite;
    }

    @objid ("f293d797-1628-497c-a3c8-b0bd111ed859")
    public void setManiabilite(int maniabilite) {
        this.maniabilite = maniabilite;
    }

	@Override
	public String toString() {
		String s = "Eppe";
		s = s + "	| impact	=	" + this.impact;
		s = s + "	| parade	=	" + this.parade;
		s = s + "	| maniabilite	=	" + this.maniabilite + "	|";
				
		return s;
	}

}
