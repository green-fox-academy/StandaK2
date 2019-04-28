public class Status {

    private int statusIndex;
    private String[] statusText = {"[ ]", "[x]"};

    public Status(int statusIndex) {
        this.statusIndex = statusIndex;
    }

    public String getStatus() {
        return this.statusText[statusIndex];
    }

    public int getStatusIndex() {
        return this.statusIndex;
    }

    public void setStatus(int statusIndex) {
        this.statusIndex = statusIndex;
    }

}
