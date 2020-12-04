class Main {
  public static void main(String[] args) {
    Frazione f1 = new Frazione(-3,4);
    Frazione f2 = new Frazione(5,6);
    System.out.println("Primo operando: " + f1.toString());
    System.out.println("Secondo operando: " + f2.toString());
    System.out.println("f1 + f2: " + f1.somma(f2).toString());
    System.out.println("f1 * f2: " + f1.prodotto(f2).toString());
    System.out.println("f1 - f2: " + f1.somma(f2.opposto()).toString());
    System.out.println("f1 : f2: " + f1.prodotto(f2.reciproco()).toString());
  }
}