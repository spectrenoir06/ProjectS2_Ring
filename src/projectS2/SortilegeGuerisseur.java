package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b9a641c0-2695-481f-b92e-debb8df7c13a")
public class SortilegeGuerisseur extends Capacite {
    @objid ("07ceab59-a008-4753-b56b-c0a0c90ee742")
    private int facilite;

    @objid ("f4206970-5518-4091-9fd7-84f935698ee0")
    private int efficacite;

    @objid ("27a1ddeb-dfc5-4b6b-872d-194587056bcc")
    public SortilegeGuerisseur(int facilite, int efficacite) {
        super();
        this.facilite = facilite;
        this.efficacite = efficacite;
    }

    @objid ("930cb00d-d9a9-48f0-b562-380e5da4129d")
    @Override
    public void use(Perso p) {
    }

    @objid ("7e698428-7dbc-465e-b9b0-779d33c13a26")
    public int getFacilite() {
        return facilite;
    }

    @objid ("1d6b168c-dab0-4577-8412-c977e67ceb67")
    public void setFacilite(int facilite) {
        this.facilite = facilite;
    }

    @objid ("65c6711d-feff-400b-82b7-581e46e8ce68")
    public int getEfficacite() {
        return efficacite;
    }

    @objid ("33aec797-3e94-477b-9b7d-b2665b91d6f4")
    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    @objid ("f45552d4-3bad-46f1-aa3e-afbf63fd9bf2")
    @Override
    public String toString() {
        String s = "S.Gueriss.";
        s = s + "    | facilite    =    " + this.facilite;
        s = s + "     | efficacite    =    " + this.efficacite + "    |";
        return s;
    }

}
