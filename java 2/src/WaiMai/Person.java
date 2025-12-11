package WaiMai;

// 人员类
public abstract class Person {
    private String name;   // 姓名
    private String job;    // 职业

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void introduction(); // 人员简介

    // 服务员类
    public static class Waiter extends Person implements Delivery {

        public Waiter(String name, String job) {
            super(name, job);
        }

        @Override
        public void deliver(Order order) {
            order.setState("配送中");
            // 删除错误的 order.getClass(this) 调用
            System.out.println(getJob() + getName() +
                    "在配送订单编号为" + order.getId() + "订单");
        }


        @Override
        public void introduction() {
            System.out.println("{姓名：" + getName() + "，职业：" + getJob() + "}");
        }
    }
}
