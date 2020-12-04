/**
 * La classe modella un numero razionale (sotto forma di frazione).
 * Espone i metodi per ciascuna operazione consentita:
 * - addizione          Frazione somma(Frazione f)
 * - moltiplicazione    Frazione prodotto(Frazione f)
 * - reciproco          Frazione reciproco()
 * - opposto            Frazione opposto()
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Frazione
{
    // variabili d'istanza
    private int num;
    private int den;

    /**
     * Costruttore degli oggetti di classe  Frazione
     */
    public Frazione()
    {
        num = 0;
        den = 1;
    }
    public Frazione(int n, int d){
        num = n;
        den = d;
        semplifica();
    }
    
    public int getNum()
    {
        return num;
    }
    public int getDen()
    {
        return den;
    }
    public Frazione reciproco(){
        return new Frazione(den,num);
    }
    public Frazione opposto(){
        return new Frazione(-num, den);
    }
    public Frazione prodotto(Frazione f){
        return new Frazione(num * f.getNum(), den * f.getDen());
    }
    public Frazione somma(Frazione f){
        int sommaNum = num * f.getDen() + den * f.getNum();
        int sommaDen = den * f.getDen();
        return new Frazione(sommaNum, sommaDen);
    }
    private int mcd(int a, int b){
      int r;
      a = Math.abs(a);
      b = Math.abs(b);
      do{
        r = a % b;
        a = b;
        b = r;
      }while (r!=0);
      return a;
    }
    private void semplifica(){
      int m = mcd(num,den);
      num = num / m;
      den = den / m;
    }
    public String toString(){
      return num + "/" + den;
    }
}
