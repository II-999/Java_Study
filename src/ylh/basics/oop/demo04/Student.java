package ylh.basics.oop.demo04;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 19:33
 */
public class Student {
    /*
    封装:
    该露的露，该藏的藏
        我们程序设计要追求“高内聚，低耦合”。高内聚就是类的内部数据细节由自己完成，不允许外部干涉；低耦合：仅暴露少量的方法给外部使用。
    封装（数据的隐藏）
        通常，应禁止直接访问一个对象中数据的实际表示，而应通过操作接口来访问，称为信息隐藏。
    作用:
        提高程序的安全性，保护数据
        隐藏代码的实现细节
        统一接口
        系统可维护性增加了

     */
    private String name;
    private int id;
    private char sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
