package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a827da51-b76b-44a5-a4e1-11249dbbe4d0")
public class Remede extends Capacite {
    @objid ("db398088-eb19-45e9-8e48-6e769ee6f5dc")
    private int facilite;

    @objid ("a51f6917-cad5-4ab4-8ece-084a026b385b")
    private int efficacite;

    @objid ("5f2187a1-a2ce-4d50-84fd-b4355348e1a1")
    public Remede(int facilite, int efficacite) {
        super();
        this.facilite     = facilite;
        this.efficacite    = efficacite;
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
        // TODO Auto-generated method stub
    }

    @objid ("3d8eeb68-8e48-4e19-b2bc-1c09ca8d3771")
    @Override
    public String toString() {
        String s = "Remede";
        s = s + "    | facilite    =    " + this.facilite;
        s = s + "     | efficacite    =    " + this.efficacite + "    |";
        return s;
    }

}
