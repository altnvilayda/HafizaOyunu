
public class Kart {
    
    private char deger;
    private boolean tahmin = false;

    //ctor.
    public Kart(char deger) {
        this.deger = deger;
    }

    //getter-setter
    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
    
    
}
