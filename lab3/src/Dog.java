import java.util.Objects;
public class Dog implements Bark, Walk {
    private String name;
    private HairConditions HairCondition;
    public Sizes size;

    public String getName() {
        return name;
    }

    public Sizes getSize() {
        return size;
    }

    public HairConditions getHairCondition() {
        return HairCondition;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHairCondition(HairConditions hairCondition) {
        this.HairCondition = hairCondition;
    }

    public void setSize(Sizes size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", HairCondition='" + HairCondition + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(HairCondition, dog.HairCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, HairCondition);
    }

    public void bark(){
        if (size == Sizes.SMALL) {
            System.out.print(name + " тихо залаяла от счастья\n");
        } else {
            System.out.print(name + " громко залаял от счастья\n");
        }
    }

    public void walk(){
        if (size == Sizes.SMALL){
            System.out.print(name + " грациозно прошлась по комнате быстро переставляя ножки\n");
        } else {
            System.out.print(name + " переваливаясь с ноги на ногу прошелся по комнате\n");
        }
    }
}
interface Bark{
    void bark();
}
interface Walk{
    void walk();
}