package seit_1;

import java.io.PrintStream;

/**
 * @Description Print information of person
 * @Author Chris
 * @Date 2023/1/31
 */
public class Printer {

    public static void print(PrintStream printStream, Person person) {
        printBirth(printStream, person);
        switch (person.getType()) {
            case 1:
                printWorker(printStream, (Boss) person);
                break;
            case 2:
                printBoss(printStream, (Worker) person);
                break;
            default:
                break;
        }
        printStream.print("\n");
    }

    private static void printBirth(PrintStream printStream, Person person) {
        printStream.print(
                String.format("%s: born on %02d/%02d/%4d", person.getName(), person.getDob_d(), person.getDob_m(),
                        person.getDob_y()));
    }

    private static void printWorker(PrintStream printStream, Boss boss) {
        printStream.print(" bosses: ");
        for (int i = 0; i < boss.getWorkNum(); i++) {
            printStream.print(boss.getWorkers().get(i).getName() + " ");
        }
    }

    private static void printBoss(PrintStream printStream, Worker worker) {
        if (null != worker.getBoss()) {
            printStream.print(" is   by " + worker.getBoss().getName());
        }
    }
}
