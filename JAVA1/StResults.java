import java.util.*;

interface Sports {
    void getSportMark();
    void putSportMark();
}

class Student {
    int rno;
    String name;

    void getData(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    void putData() {
        System.out.println("Roll no: " + rno + "\nName: " + name);
    }
}

class Test extends Student {
    private int m1, m2;

    void getMark(int m1, int m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    void putMark() {
        System.out.println("Mark 1: " + m1 + "\nMark 2: " + m2);
    }
}

class Result extends Test implements Sports {
    private int sportMark;

    @Override
    public void getSportMark() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter sport mark:");
        sportMark = s.nextInt();
    }

    @Override
    public void putSportMark() {
        putMark();
        System.out.println("Sport mark: " + sportMark);
        System.out.println("Sport mark: " + (sportMark+m1+m2));

    }
}

public class StResults {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input student details
        System.out.println("Enter roll no:");
        int rno = s.nextInt();
        s.nextLine(); // Consume leftover newline
        System.out.println("Enter name:");
        String name = s.nextLine();

        // Input marks
        System.out.println("Enter mark 1:");
        int m1 = s.nextInt();
        System.out.println("Enter mark 2:");
        int m2 = s.nextInt();

        // Create Result object
        Result r = new Result();

        // Set data and marks
        r.getData(rno, name);
        r.getMark(m1, m2);

        // Input sport mark
        r.getSportMark();

        // Output details
        r.putData();
        r.putSportMark();
    }
}
