public class Data {
    int id, income;
    public Data(int id, int income) {
        this.id = id;
        this.income = income;
    }
    @Override
    public String toString() {
        return "[ID = " + this.id + ", INCOME = " + this.income + "]";
    }
}