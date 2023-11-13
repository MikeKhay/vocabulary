package vocabulary;

import java.io.Serializable;

public class Word implements Serializable {
    private String w;
    private String t;

    public Word(String w, String t) {
        this.w = w;
        this.t = t;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Word: " + w + ", translate: " + t;
    }
}
