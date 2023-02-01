package seit_1;

/**
 * @Description Base Person Entity
 * @Author Chris
 * @Date 2023/1/31
 */
public class Person {

    private final String name;
    private final int dob_d, dob_m, dob_y; // date of birth
    private int type; // 1 = Boss, 2 = Worker

    public Person(String n, int d, int m, int y) {
        this.name = n;
        this.dob_d = d;
        this.dob_m = m;
        this.dob_y = y;
    }

    public Person(String n, int d, int m, int y, int type) {
        this.name = n;
        this.dob_d = d;
        this.dob_m = m;
        this.dob_y = y;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDob_d() {
        return dob_d;
    }

    public int getDob_m() {
        return dob_m;
    }

    public int getDob_y() {
        return dob_y;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
