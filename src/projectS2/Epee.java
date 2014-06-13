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
    public Epee(int imp, int para, int mani) throws CapaciteException {
        super(); 
        if (( imp>=20) && (para>=20) && (mani>=20)&& ((imp+para+mani)==100)) { 
            this.impact = imp;
            this.parade = para;
            this.maniabilite = mani;
        }else {
            throw new CapaciteException("Epee non conforme.");
        }
    }

    @objid ("4185125d-7741-4687-8249-b07e826ba361")
    public String getCapaciteInfo() {
        return ("Epee att\t:    reussite = " + this.getReussite() + " ; puissance att : " + this.getPuissance() + " ; puissance para : " + this.getPuissanceParade() );
    }
    
    public String getCapaciteInfoParade() {
        return ("Epee para\t:    reussite = " + this.getReussite() + "    ; puissance : " + this.getPuissanceParade() );
    }

    @objid ("c5408822-811d-4d41-9776-5a4eead7af11")
    public int getImpact() {
        return impact;
    }

    @objid ("5ffa7598-b0c9-43d2-a7b5-f5a24e399714")
    public int getManiabilite() {
        return maniabilite;
    }

    @objid ("6badddee-6197-4534-a376-21b41bd211b1")
    public int getParade() {
        return parade;
    }

    @objid ("48f8d036-49ca-4556-8027-f4d985ea5fed")
    @Override
    public double getPuissance() {
        return ( this.getPerso().getForce() * this.impact / 50.0 );
    }
    
    public double getPuissanceParade() {
        return ((this.getPerso().getForce() * this.parade) / 50.0 );
    }


    @objid ("d0c4d3f9-db6e-41df-aa3d-a7a2b255c672")
    public double getReussite() {
        return ( this.getPerso().getDexterite() * this.maniabilite / 1000.0);
    }

    @objid ("7f64b56f-2c28-49f6-9cfc-538506750fbe")
    @Override
    public String serialise() {
        return ("eppe;" + this.impact + ";" + this.parade + ";" + this.maniabilite);
    }

    @objid ("f6b5ec53-fadd-44d0-8e33-82135b6b394d")
    public void setImpact(int impact) {
        this.impact = impact;
    }

    @objid ("f293d797-1628-497c-a3c8-b0bd111ed859")
    public void setManiabilite(int maniabilite) {
        this.maniabilite = maniabilite;
    }

    @objid ("a0cfbb67-1f85-4db1-a48e-8fcd815836f7")
    public void setParade(int parade) {
        this.parade = parade;
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

    @objid ("af31861a-60c2-4f25-89e6-206e15370dd9")
    public void use(Perso p) {
        if (p==getPerso()){	// parade
        	
        	System.out.println(this.getPerso().getNom() + " utilise " + getCapaciteInfoParade());
        	if (this.getReussite() >= Math.random()){
        		
        		getPerso().setParade(getPerso().getParade() + getPuissanceParade());
        		System.out.println("parade reussite parade = "+ getPerso().getParade());
        	
        	}else{
        		
        		System.out.println("Capacite rate !");
        	
        	}
        }else{ // attack
        	
        	System.out.println(this.getPerso().getNom() + " utilise " + getCapaciteInfo());
        	
        	if (this.getReussite() >= Math.random()){
        		
        		System.out.println("attaque reussite" );
        		p.setParade(p.getParade() - getPuissance() );
        	
        	}else{
        		System.out.println("Capacite rate !");
        	}
        
        }
        
    }

}
