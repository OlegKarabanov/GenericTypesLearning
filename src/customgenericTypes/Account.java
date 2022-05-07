package customgenericTypes;

public class Account implements Accountable <String> {
    private String  id;
    private int sum;

    public Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
