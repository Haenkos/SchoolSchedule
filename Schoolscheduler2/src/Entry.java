public class Entry {
    private int date;
    private int blockIndex;
    private int roomIndex;
    private int courseIndex;
    private int teacherIndex;
    private int[] studentsIndexArray;

    public Entry(){}

    public Entry(int date, int blockIndex, int roomIndex, int courseIndex, int teacherIndex, int[] studentsIndexArray) {
        this.date = date;
        this.blockIndex = blockIndex;
        this.roomIndex = roomIndex;
        this.courseIndex = courseIndex;
        this.teacherIndex = teacherIndex;
        this.studentsIndexArray = studentsIndexArray;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getBlockIndex() {
        return this.blockIndex;
    }

    public void setBlockIndex(int blockIndex) {
        this.blockIndex = blockIndex;
    }

    public int getRoomIndex() {
        return this.roomIndex;
    }

    public void setRoomIndex(int roomIndex) {
        this.roomIndex = roomIndex;
    }

    public int getCourseIndex() {
        return this.courseIndex;
    }

    public void setCourseIndex(int courseIndex) {
        this.courseIndex = courseIndex;
    }

    public int getTeacherIndex() {
        return this.teacherIndex;
    }

    public void setTeacherIndex(int teacherIndex) {
        this.teacherIndex = teacherIndex;
    }

    public int[] getStudentsIndexArray() {
        return this.studentsIndexArray;
    }

    public void setStudentsIndexArray(int[] studentsIndexArray) {
        this.studentsIndexArray = studentsIndexArray;
    }

}
