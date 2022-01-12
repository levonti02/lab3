import java.util.Objects;

public class Shorty implements Shortyinterface{
    private String name;
    private String RoomAt;
    private Time time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomAt(String roomAt){
        this.RoomAt = roomAt;
    }

    public void settime(Time time){
        this.time = time;
        if (time == Time.MORNING){
            System.out.print("Наступило утро, пора мыть собак\n");
        }
        if (time == Time.DAY){
            System.out.print("Наступил день, пора мыть собак\n");
        }
        if (time == Time.NIGHT){
            System.out.print("Наступил вечер, пора мыть собак\n");
        }
    }

    public void movetosalon(){
        System.out.print( name + " и собаки пришли в собачью парикмахерскую\n");
        this.RoomAt = "salon";
        this.time = Time.DAY;
    }

    public void movetohome(){
        System.out.print(name + " и собаки возращаются домой\n");
         this.RoomAt = "home";
         this.time = Time.NIGHT;
    }




    @Override
    public String toString() {
        return "Shorty{" +
                "name='" + name + '\'' +
                ", RoomAt=" + RoomAt +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shorty shorty = (Shorty) o;
        return Objects.equals(name, shorty.name) && Objects.equals(RoomAt, shorty.RoomAt) && time == shorty.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, RoomAt, time);
    }
}

interface Shortyinterface{
    void settime(Time time);
    void movetosalon();
    void movetohome();
}