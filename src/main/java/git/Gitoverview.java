package git;

public class Gitoverview {
    private long ig;

    public long getIg() {
        return ig;
    }

    public void setIg(long ig) {
        this.ig = ig;
    }

    @Override
    public String toString() {
        return "Gitoverview{" +
                "ig=" + ig +
                '}';
    }

    public boolean itsNew(){
        return(this.ig==null);
    }
}
