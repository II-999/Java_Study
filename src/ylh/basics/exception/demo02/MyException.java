package ylh.basics.exception.demo02;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 9:56
 */
public class MyException extends Exception {
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    @Override
    public String toString() {
        return "MyException{" + "detail=" + detail + '}';
    }
}
