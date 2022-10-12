import package2.Teacher;
public class TeacherInfo extends Teacher {
    public TeacherInfo(String name, String classId) {
        super(name, classId);
    }

    public static void main(String[] args) {
        TeacherInfo teacher1 = new TeacherInfo("name","123");
        teacher1.setName("Mane");
        System.out.println(teacher1.toString());
    }
}
