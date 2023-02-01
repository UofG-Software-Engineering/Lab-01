package seit_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Boss Entity
 * @Author Chris
 * @Date 2023/1/31
 */
public class Boss extends Person {

    private final List<Worker> workers;
    private int workNum;

    public Boss(String n, int d, int m, int y) {
        super(n, d, m, y, 1);
        workers = new ArrayList<>();
        workNum = 0;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
        workNum++;
    }

    public void removeWorker(Worker worker) {
        workers.remove(worker);
        workNum--;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public int getWorkNum() {
        return workNum;
    }
}
