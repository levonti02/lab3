public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Shorty d = new Shorty();
        Bath bath = new Bath();
        Salon salon = new Salon();
        d.setName("Незнайка");
        d.settime(Time.MORNING);
        d.setRoomAt("home");
        dog1.setName("Мими");
        dog1.setSize(Bath.randomSize());
        dog1.setHairCondition(Bath.randomHairCondition());
        dog2.setName("Роланд");
        dog2.setSize(Bath.randomSize());
        dog2.setHairCondition(Bath.randomHairCondition());
        Dog[] dogs =new Dog[2];
        dogs[0] = dog1;
        dogs[1] = dog2;
        bath.cleandog(dog1, d);
        bath.cleandog(dog2, d);
        d.movetosalon();
        if (dog1.size != Sizes.BIG){
            bath.cleandog(dog1, d);
        }
        if (dog2.size != Sizes.BIG){
            bath.cleandog(dog2, d);
        }
        salon.gethaircut(dog1, Salon.randomService());
        salon.gethaircut(dog2, Salon.randomService());
        d.movetohome();
        if (dog1.size == Sizes.SMALL){
            bath.cleandog(dog1, d);
        }
        if (dog2.size == Sizes.SMALL){
            bath.cleandog(dog2, d);
        }
        home.presentdogs(d, dogs);
    }
}
