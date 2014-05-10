package projectS2;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3c87cb07-e5b2-4706-ac36-e5a91104d80f")
public class Game {
    @objid ("6bb69aa6-f3c6-43d8-a09d-3b5746f3dce7")
    private Perso perso1;

    @objid ("4336642f-3f98-416d-b1eb-dd71724cd0b9")
    private Perso perso2;

    @objid ("b66a9408-4028-4110-a68e-f822f0e32bd0")
    public Perso getPerso1() {
        return perso1;
    }

    @objid ("c6ee85ac-f034-4ae7-9e70-8fbea0d2c25c")
    public void setPerso1(Perso perso1) {
        this.perso1 = perso1;
    }

    @objid ("57d1e580-dcc5-4f1b-94b4-36782cafbe8d")
    public Perso getPerso2() {
        return perso2;
    }

    @objid ("a42a2edd-1499-43f3-a0f4-de026a1ddf00")
    public void setPerso2(Perso perso2) {
        this.perso2 = perso2;
    }

}
