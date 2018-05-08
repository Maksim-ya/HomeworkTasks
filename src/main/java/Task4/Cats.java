package Task4;


public class Cats extends MyEnum {

    public static final Cats PUMA;
    public static final Cats BARSIK;
    public static final Cats MURKA;
    public static final Cats VASKA;

    private static  final Cats VALUES[];
    static {
        PUMA = new Cats("PUMA",0);
        BARSIK = new Cats("BARSIK",1);
        MURKA = new Cats("MURKA",2);
        VASKA = new Cats("VASKA",3);
        VALUES = (new Cats[]{PUMA,BARSIK,MURKA,VASKA});
    }
    public Cats(String name, int ordinal) {
        super(name, ordinal);
    }

    public static Cats[] values(){
        return  VALUES.clone();
    }
    public  static  Cats valuesOf(String s) {
        Cats neededCat=null;
        for (Cats cat : VALUES) {
            if (cat.getName().equals(s))
                neededCat=cat;
        }
        return neededCat;
    }


}
