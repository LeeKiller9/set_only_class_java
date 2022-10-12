public class Student {
    private String name = "John";
    private String classId = "C02";
    private int team = 1;
    static String universityName = "UTE";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setClassId(String classId) {
        this.classId = classId;
    }

    void setTeam(int team) {
        this.team = team;
    }

    public static void setUniversityName(String universityName) {
        Student.universityName = universityName;
    }

    public String getName() {
        return name;
    }

    public String getClassId() {
        return classId;
    }

    public int getTeam() {
        return team;
    }

    public static String getUniversityName() {
        return universityName;
    }

    @Override
    public String toString() {
        return "Name: " + name + "----Class: " + classId + "----Team: " + team + "----University: " + universityName;
    }
}
