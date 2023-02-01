package seit_1;

public class Main1 {

    public static void main(String[] args) {
        Person w1 = new Worker("aaa", 1, 2, 1991);
        Person w2 = new Worker("bbb", 3, 4, 1993);
        Person w3 = new Worker("ccc", 5, 6, 1995);

        Person b1 = new Boss("ddd", 7, 8, 1997);
        Person b2 = new Boss("eee", 9, 10, 1999);

        Assigner.assign((Boss) b1, (Worker) w1);
        Assigner.assign((Boss) b1, (Worker) w2);
        Assigner.assign((Boss) b2, (Worker) w3);

        Printer.print(System.err, b1);
        Printer.print(System.err, b2);
        Printer.print(System.err, w1);
        Printer.print(System.err, w2);
        Printer.print(System.err, w3);
    }

}
