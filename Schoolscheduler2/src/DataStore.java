import java.util.ArrayList;

public class DataStore {
    private ArrayList<Object> blocksList;
    private ArrayList<Object> roomList;
    private ArrayList<Object> courseList;
    private ArrayList<Object> teacherList;
    private ArrayList<Object> studentList;

    public DataStore() {
        blocksList.add(new Block(9,10));
        blocksList.add(new Block(10,11));
        blocksList.add(new Block(11,12));

        roomList.add(new Room(101));
        roomList.add(new Room(201));

        courseList.add(new Course("Konijnverzorging"));
        courseList.add(new Course("Konijngedrag"));
        courseList.add(new Course("Hokken timmeren"));

        teacherList.add(new Teacher("Frits", 1));
        teacherList.add(new Teacher("Hans", 2));
        teacherList.add(new Teacher("Gerrit", 3));

        studentList.add(new Student("Hannie", new int[] {1,2}));
        studentList.add(new Student("Joost", new int[] {2,3}));
        studentList.add(new Student("Frida", new int[] {3,1}));
    }
}
