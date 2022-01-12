public class Home extends Room implements Homeinterface{
    public void presentdogs(Shorty shorty,Dog[] dogs) {
        System.out.print(shorty.getName() + " презентует собак госпоже Миноге\n");
        for (Dog i : dogs){
            i.walk();
            i.bark();
        }
    }
}

interface Homeinterface{
    void presentdogs(Shorty shorty, Dog[] dogs);
}
