package midterm;

public enum Size {
    S("S"), M("M"), L("L"), X("X");
    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
