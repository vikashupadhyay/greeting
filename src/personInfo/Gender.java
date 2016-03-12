package personInfo;

public  enum Gender {
    Male("Mr"),Female("Ms");
    private final String honour;

    @Override
    public String toString() {
        return honour;
    }

    Gender(String honour) {
        this.honour = honour;
    }
}

