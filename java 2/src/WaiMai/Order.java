package WaiMai;

public class Order {
    // 订单编号
    private String id;
    // 订单状态
    private String state;
    // 订单处理人员
    private Person person;

    public Order(String id, String state) {
        this.id = id;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void orderInfo() {
        System.out.println("订单编号：" + this.id + ",订单状态：" + this.state);
    }
}