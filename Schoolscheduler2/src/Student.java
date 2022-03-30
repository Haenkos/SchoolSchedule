public class Student {
    private String name;
    private String studentNumber;
    private int[] vakken;

    public Student(String name, int[] vakken) {
        this.name = name;
        this.vakken = vakken;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public int[] getVakken() {
        return this.vakken;
    }
}
