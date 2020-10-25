package ex2;

import java.util.Scanner;

public class Test {
    public static void main(String[] arg) {
        int d, z=0;
        int v = 1;
        String a[] = new String[2];
        a[0] = " ";
        a[1] = " ";
        String k = "\0";
        course PUBG = new course(213, "PUBG", "301", "68:79");
        course ksby = new course(6324, "0基础拿毕业证（上）", "6324", "00:00");
        TEACHER sb = new TEACHER(213, "嬲", "J·C·J", PUBG);
        TEACHER lc = new TEACHER(6324, "嬲", "梁成", ksby);
        STUDENT s = new STUDENT(1, "animal", "monkey", " ");
        while (true) {
            System.out.println(PUBG);
            System.out.println(ksby);
            a:
            while (true) {

                System.out.println("输入学号，没有的可以滚");
                Scanner u = new Scanner(System.in);
                int c = u.nextInt();
                if (c == 1) {
                    System.out.println("学生信息" + s);

                    System.out.println("输入课程号选课");
                    while (z != 2) {
                        Scanner b = new Scanner(System.in);
                        d = b.nextInt();
                        switch (d) {
                            case 6324: {
                                a[z] = PUBG.name;
                                break;
                            }
                            case 213: {
                                a[z] = ksby.name;
                                break;
                            }

                        }z = z+1;
                        s.Lesson= a[0] +"    "+ a[1];
                        System.out.println(s);}
                        System.out.println("输入课程序号来退课,0来结束退课");
                        z:while (true) {
                            Scanner x = new Scanner(System.in);
                            int l = x.nextInt();
                            l = l-1;
                            if (l == -1) break z;
                            a[l] = " ";
                            s.Lesson= a[0] +"    "+ a[1];
                            System.out.println(s);


                        }


                    System.out.println("还选吗，不选就输入0");
                    Scanner e = new Scanner(System.in);
                    int f = e.nextInt();
                    if (f == 0) {
                        break a;
                    } else continue;
                }
            }
            System.out.println(s);
            System.out.println("已保存");

        }
    }


}