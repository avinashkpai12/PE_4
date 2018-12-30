package com.stackroute.practcice4;

public class IndexWrapper {

    int start;
    int end;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public IndexWrapper(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "IndexWrapper{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
