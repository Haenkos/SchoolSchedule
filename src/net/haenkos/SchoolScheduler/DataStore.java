package net.haenkos.SchoolScheduler;

import java.util.ArrayList;

public class DataStore {
    private ArrayList<Block> blockList;
    private ArrayList<Room> roomList;
    private ArrayList<Course> courseList;
    private ArrayList<Teacher> teacherList;
    private ArrayList<Student> studentList;
    private ArrayList<Entry> entryList;

    public DataStore() {
        blockList = new ArrayList<>();
        blockList.add(new Block(9,10));
        blockList.add(new Block(10,11));
        blockList.add(new Block(11,12));

        roomList = new ArrayList<>();
        roomList.add(new Room(101));
        roomList.add(new Room(201));

        courseList = new ArrayList<>();
        courseList.add(new Course("Konijnverzorging"));
        courseList.add(new Course("Konijngedrag"));
        courseList.add(new Course("Hokken timmeren"));

        teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Frits", 1));
        teacherList.add(new Teacher("Hans", 2));
        teacherList.add(new Teacher("Gerrit", 3));

        studentList = new ArrayList<>();
        studentList.add(new Student("Hannie", new int[] {1,2}));
        studentList.add(new Student("Joost", new int[] {2,3}));
        studentList.add(new Student("Frida", new int[] {3,1}));

        entryList = new ArrayList<>();
    }

    public ArrayList<Block> getblockList() {
        return this.blockList;
    }

    public Block getBlock(int index) {
        return this.blockList.get(index);
    }

    public void addBlock(Block block) {
        blockList.add(block);
    }

    public ArrayList<Room> getRoomList() {
        return this.roomList;
    }

    public Room getRoom(int index) {
        return this.roomList.get(index);
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public ArrayList<Course> getCourseList() {
        return this.courseList;
    }

    public Course getCourse(int index) {
        return this.courseList.get(index);
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public ArrayList<Teacher> getTeacherList() {
        return this.teacherList;
    }

    public Teacher getTeacher(int index) {
        return this.teacherList.get(index);
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }

    public Student getStudent(int index) {
        return this.studentList.get(index);
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList<Entry> getEntryList() {
        return this.entryList;
    }

    public Entry getEntry(int index) {
        return this.entryList.get(index);
    }

    public void addEntry(Entry entry) {
        this.entryList.add(entry);
    }
}
