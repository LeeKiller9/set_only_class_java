package package2;

public class Teacher {
    private String name = "John";
    private String classId = "C02";
    static String universityName = "UTE";

    public Teacher(String name, String classId) {
        this.name = name;
        this.classId = classId;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClassId(String classId) {
        this.classId = classId;
    }

    protected static void setUniversityName(String universityName) {
        Teacher.universityName = universityName;
    }

    protected String getName() {
        return name;
    }

    protected String getClassId() {
        return classId;
    }


    protected static String getUniversityName() {
        return universityName;
    }

    @Override
    public String toString() {
        return "Name: " + name + "----Class: " + classId + "----University: " + universityName;
    }
}
