package in.stackroute;

public class Mentor {

    private int mentorId;
    private String name;
    private Gender gender;

    public Mentor(int mentorId) {
        this.mentorId = mentorId;
    }

    public int getMentorId() {
        return mentorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\tmentorId: " + mentorId +
                "\tname: " + name +
                "\tgender: " + gender;
    }
}
