package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("41eafe41-1d9a-4f32-94c0-6bd897c7f407")
public class SortilegeOffensif extends Capacite {
    @objid ("a0a056da-4f4d-4593-a24d-1770d37419a4")
    private int facilite;

    @objid ("75e44a13-d38d-475c-84e8-cffe64112450")
    private int efficacite;

    @objid ("0e6ec284-b0d8-49c2-ad30-b421748be7f2")
    public SortilegeOffensif(int facilite, int efficacite) {
        super();
        this.facilite = facilite;
        this.efficacite = efficacite;
    }

    @objid ("7638945c-a33f-4603-87ac-988d6e7c81f7")
    @Override
    public void use(Perso p) {
        System.out.println(this.getPerso().getNom() + " utilise s.offensif sur " + p.getNom());
        System.out.println("[ reussite = " + this.getReussite() + " ; efficacite : " + this.getAttaquePuissance() + " ]" );
    }

    @objid ("f95d7c3e-2791-401e-bb25-1f627b307000")
    public int getFacilite() {
        return facilite;
    }

    @objid ("94eeea82-48e8-40a7-8402-e846f1a4ff5f")
    public void setFacilite(int facilite) {
        this.facilite = facilite;
    }

    @objid ("43082dca-1b93-4546-b493-60ef93d5984d")
    public int getEfficacite() {
        return efficacite;
    }

    @objid ("6b4fbdbf-b90b-491b-8b37-69ecbc03f015")
    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    @objid ("bb31c821-0e62-430f-9cbb-33543f2d8733")
    @Override
    public String toString() {
        String s = "S.Offensif";
        s = s + "\t| facilite\t=\t" + this.facilite;
        s = s + "\t| efficacite\t=\t" + this.efficacite + "\t|";
        return s;
    }

    @objid ("2d98bcd8-62ed-48f1-b8bb-f1b60a5e6b4b")
    @Override
    public double getReussite() {
        return ( (this.getPerso().getConcentration() * this.facilite) * 10000.0 );
    }

    @objid ("4f4fce42-d7f1-4e33-afa6-2c5cd545670c")
    @Override
    public double getParadePuissance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @objid ("1b9696cb-b605-4731-8541-7a2b62aa62f3")
    @Override
    public double getAttaquePuissance() {
        return ( (this.getPerso().getIntelligence() * this.efficacite) / 100.0);
    }
    
    @Override
	public String serialise() {
		return ("SO;" + this.facilite + ";" + this.efficacite);
	}

}
