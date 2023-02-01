package seit_1;

/**
 * @Description Worker Entity
 * @Author Chris
 * @Date 2023/1/31
 */
public class Worker extends Person {

    private Boss boss;

    public Worker(String n, int d, int m, int y) {
        super(n, d, m, y, 2);
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
