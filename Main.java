public class Main {
    public static void main(String[] args) {

        Fighter f1= new Fighter("Alex",13,100,90,40,50);
        Fighter f2= new Fighter("Anya", 18,89,80,30,50);
        Match match=new Match(f1,f2,80,110);
        match.run();
    }
}
