public class Block {
    private int startTime;
    private int endTime;

    public Block(int start, int end) {
        startTime = start;
        endTime = end;
    }

    public String getBlockString() {
        return String.format("{}-{}", startTime, endTime);
    }
    public int getStartTime() {
        return this.startTime;
    }

    public int getEndTime() {
        return this.endTime;
    }
}
