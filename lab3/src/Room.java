import java.util.Random;

abstract class Room extends Shorty {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static Services randomService() {
        int f = new Random().nextInt(Services.values().length);
        return Services.values()[f];
    }

    public static Sizes randomSize(){
        int f = new Random().nextInt(Sizes.values().length);
        return Sizes.values()[f];
    }

    public static HairConditions randomHairCondition() {
        int f = new Random().nextInt(HairConditions.values().length);
        return HairConditions.values()[f];
    }
}
