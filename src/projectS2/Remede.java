package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a827da51-b76b-44a5-a4e1-11249dbbe4d0")
public class Remede extends Capacite {
    @objid ("db398088-eb19-45e9-8e48-6e769ee6f5dc")
    private int facilite;

    @objid ("a51f6917-cad5-4ab4-8ece-084a026b385b")
    private int efficacite;

    @objid ("5f2187a1-a2ce-4d50-84fd-b4355348e1a1")
    public Remede(int facilite, int efficacite) throws CapaciteException {
        super();
        if (( facilite>=20) && (efficacite>=20)&& ((facilite+efficacite)==100)) { 
            this.facilite = facilite;
            this.efficacite = efficacite;
        }else {
            throw new CapaciteException("Remede non conforme.");
        }
    }

    @objid ("bdb7bad0-c16f-470d-9019-3b5175d57cdb")
    public int getFacilite() {
        return facilite;
    }

    @objid ("c1b266b1-ba70-4990-b481-8ae79cdd49a4")
    public void setFacilite(int facilite) {
        this.facilite = facilite;
    }

    @objid ("c95c8642-948f-4c03-bfaf-b966cbea3963")
    public int getEfficacite() {
        return efficacite;
    }

    @objid ("9f60bfb4-59ea-482d-9c3e-59340a941e41")
    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    @objid ("6b9901c7-aafb-4c27-9821-df03f9f91230")
    @Override
    public void use(Perso p) {
        super.use(p);
        if (this.getReussite() >= Math.random()){
        	if ((getPerso().getVitalite() + getPuissance()) < getPerso().getMaxVitalite()){
        		getPerso().setVitalite(getPerso().getVitalite() + getPuissance());
        	}else{
        		getPerso().setVitalite(getPerso().getMaxVitalite());
        	}
            System.out.println("soin reussi vitalite de " + this.getPerso().getNom() + " = " + this.getPerso().getVitalite());
        }else{
            System.out.println("Capacite rate !");
        }
    }

    @objid ("3d8eeb68-8e48-4e19-b2bc-1c09ca8d3771")
    @Override
    public String toString() {
        String s = "Remede";
        s = s + "\t| facilite\t=\t" + this.facilite;
        s = s + "\t| efficacite\t=\t" + this.efficacite + "\t|";
        return s;
    }

    @objid ("6ac79c40-7d26-43e5-8633-081270566b6a")
    @Override
    public double getReussite() {
        return this.getPerso().getDexterite() * this.facilite / 10000;
    }

    @objid ("06f4ccc7-061b-4090-a5d0-94b6433b5263")
    @Override
    public String serialise() {
        return ("remede;" + this.facilite + ";" + this.efficacite);
    }

    @objid ("f1794c57-2fd6-4b6f-a6a2-3e99c1a99dd5")
    @Override
    public double getPuissance() {
        return this.getPerso().getDexterite() * this.efficacite / 100;
    }

    @objid ("f9c5f898-2a8a-4953-abc5-85e75a292d0d")
    @Override
    public String getCapaciteInfo() {
        return ("Remede    :    reussite = " + this.getReussite() + "    ; efficacite : " + this.getPuissance() );
    }

}
