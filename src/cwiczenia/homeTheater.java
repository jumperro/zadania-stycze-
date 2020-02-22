package cwiczenia;

public class homeTheater extends speakers {
    private TV screen = new TV();
    private speakers speak = new speakers();

    public homeTheater(int volume) {
        super(volume);
    }

    void TVon(){
        System.out.println("TV is on");
    }

    void TVoff(){
        System.out.println("TV is off");
    }


}
