import java.util.Random;

public class Salon extends Room implements Saloninterface{
    public void gethaircut(Dog dog, Services service){
        if (service == Services.PIGTAILS){
            Pigtails(dog);
        }

        if (service == Services.HAIRCUT){
            Haircut(dog);
        }

        if (service == Services.TAILCUT){
            Tailcut(dog);
        }

        if (service == Services.CURLS){
            Curls(dog);
        }

        if (service == Services.GREASE){
            Grease(dog);
        }

        if (service == Services.MAKEUP){
            Makeup(dog);
        }
    }

    private static void Pigtails(Dog dog){
        System.out.print(dog.getName() + " заплели косички\n");
    }

    private static void Haircut(Dog dog){
        System.out.print(dog.getName() + " подстригли морду\n");
    }

    private static void Tailcut(Dog dog){
        System.out.print(dog.getName() + " подстригли хвост\n");
    }

    private static void Curls(Dog dog){
        System.out.print(dog.getName() + " подвили щипцами кудряшки\n");
    }

    private static void Grease(Dog dog){
        System.out.print(dog.getName() + " смазали шерсть бриолином\n");
    }

    private static void Makeup(Dog dog){
        System.out.print(dog.getName() + " подкрасили черной краской ресницы, подрисовали синькой глаза\n");
    }


}

interface Saloninterface{
    void gethaircut(Dog dog, Services service);
}
