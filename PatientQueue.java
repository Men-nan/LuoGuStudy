import java.util.*;

public class PatientQueue {
    static class Patient {
        String id;
        int age;
        int priority;
        Patient(String id, int age, int priority) {
            this.id = id;
            this.age = age;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Patient[] p = new Patient[num];
        for (int i = 0; i < num; i++) {
            String id = sc.next();
            int age = sc.nextInt();
            p[i] = new Patient(id, age, i);
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                boolean swap = false;
                boolean bigAge1 = p[j].age >= 60;
                boolean bigAge2 = p[j + 1].age >= 60;
                if (!bigAge1 && bigAge2)
                    swap = true;
                else if (bigAge1 && bigAge2) {
                    if (p[j].age < p[j + 1].age) swap = true;
                    else if (p[j].age == p[j + 1].age && p[j].priority > p[j + 1].priority) swap = true;
                }
                if (swap) {
                    Patient l = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = l;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(p[i].id);
        }
    }
}
