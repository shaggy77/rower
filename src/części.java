public class części {

    private String waga;
    private  int ilosc;
    private String funkcja;
    private boolean prawy;
    private boolean przedni;

    public części(String waga, int ilosc, String funkcja, boolean prawy, boolean przedni)
    {
        this.waga=waga;
        this.ilosc=ilosc;
        this.funkcja=funkcja;
        this.prawy=prawy;
        this.przedni=przedni;
    }

    public String getWaga()
    {
        return waga;
    }
    public int getIlosc()
    {
        return ilosc;
    }

    public String getFunkcja() {
        return funkcja;
    }

    public boolean isPrawy() {
        return prawy;
    }

    public boolean isPrzedni() {
        return przedni;
    }
}
