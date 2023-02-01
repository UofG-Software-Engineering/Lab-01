package seit_1;

/**
 * @Description Assign person
 * @Author Chris
 * @Date 2023/1/31
 */
public class Assigner {

    public static void assign(Boss boss, Worker worker) {
        remove(boss, worker);
        boss.addWorker(worker);
        worker.setBoss(boss);
    }

    public static void remove(Boss boss, Worker worker) {
        boss.removeWorker(worker);
        worker.setBoss(null);
    }
}
