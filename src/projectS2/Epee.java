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
            System.out.println("[ reussite = " + this.getReussite() + " ; efficacite : " + this.getParadePuissance() + " ]" );
        }else{
            System.out.println(this.getPerso().getNom() + " attaque " + p.getNom());
            System.out.println("[ reussite = " + this.getReussite() + " ; efficacite : " + this.getAttaquePuissance() + " ]" );
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

    @objid ("b881c18c-c582-40cd-bba2-ff2bdfb8f1ff")
    @Override
    public String toString() {
        String s = "Eppe";
        s = s + "\t| impact\t=\t" + this.impact;
        s = s + "\t| parade\t=\t" + this.parade;
        s = s + "\t| maniabilite\t=\t" + this.maniabilite + "\t|";
        return s;
    }

    @objid ("d0c4d3f9-db6e-41df-aa3d-a7a2b255c672")
    public double getReussite() {
        return ( this.getPerso().getDexterite() * this.maniabilite / 10000.0);
    }

    @objid ("774f48e9-9c86-48ec-b2e4-f2aa9c50aa29")
    public double getAttaquePuissance() {
        return ( this.getPerso().getForce() * this.impact / 100.0 );
    }

    @objid ("676c318d-3ff7-4c6d-81de-65e591a801f0")
    public double getParadePuissance() {
        return ( this.getPerso().getForce() * this.parade / 100.0 );
    }

	@Override
	public String serialise() {
		return ("eppe;" + this.impact + ";" + this.parade + ";" + this.maniabilite);
	}

}
