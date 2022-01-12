import java.util.Random;

public class Bath extends Room implements Bathinterface{
    public void cleandog(Dog dog, Shorty shorty){
        if (dog.getSize() == Sizes.BIG) {
            System.out.print(dog.getName() + " помещают в большую ванну\n");
            System.out.print(dog.getName() + " помыли\n");
            if (dog.getHairCondition() == HairConditions.PERFECT) {
                System.out.print("Волосы в шикарном состоянии\n");
            } else {
                System.out.print(shorty.getName() + " забыл распустить косички, волосы не в шикарном состоянии\n");
            }
        }
        if (dog.getSize() == Sizes.MEDIUM) {
            System.out.print(dog.getName() + " помещают в среднюю ванну\n");
            System.out.print(dog.getName() + " помыли\n");
            if (dog.getHairCondition() != HairConditions.PERFECT) {
                System.out.print("Волосы в шикарном состоянии\n");
            } else {
                System.out.print(shorty.getName() + " забыл распустить косички, волосы не в шикарном состоянии\n");
            }
        }
        if (dog.getSize() == Sizes.SMALL) {
            System.out.print(dog.getName() + " помещают в маленькую ванночку\n");
            System.out.print(dog.getName() + " помыли\n");
        }
    }
}

interface Bathinterface{
    void cleandog(Dog dog, Shorty shorty);
}