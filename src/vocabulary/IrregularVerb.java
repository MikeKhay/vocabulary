package vocabulary;

import java.io.Serializable;

public class IrregularVerb extends Word implements Serializable {

    private String w2;
    private String w3;

    public IrregularVerb(String w, String w2, String w3, String t) {
        super(w, t);
        this.w2 = w2;
        this.w3 = w3;
    }

    public String getW2() {
        return w2;
    }

    public void setW2(String w2) {
        this.w2 = w2;
    }

    public String getW3() {
        return w3;
    }

    public void setW3(String w3) {
        this.w3 = w3;
    }

    @Override
    public String toString() {
        return "IrregularVerb: " + this.getW() + ", " + w2 + ", " + w3 + ", translate: " + this.getT();
    }
}
