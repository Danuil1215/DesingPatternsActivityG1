package Exercise3;

public class Employee {

    private String name;
    private Integer earned;
    private Integer deducted;
    private Integer balance;

    public Employee(String name, Integer earned, Integer deducted) {
        this.name = name;
        this.earned = earned;
        this.deducted = deducted;
        this.balance = earned-deducted;
    }

    public String getName() {
        return name;
    }

    public Integer getEarned() {
        return earned;
    }

    public Integer getDeducted() {
        return deducted;
    }

    public Integer getBalance() {
        return balance;
    }
}
