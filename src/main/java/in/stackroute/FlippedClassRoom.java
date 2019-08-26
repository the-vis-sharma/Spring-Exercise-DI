package in.stackroute;

public class FlippedClassRoom extends Classroom {

    private int duration;

    public FlippedClassRoom(Mentor mentor) {
        super(mentor);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Duration: " + duration + " hrs");
    }
}
