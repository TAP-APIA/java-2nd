package ex2;

public class TEACHER extends HUMAN{
    course c;
    String Name;
    TEACHER(int code, String sex, String name,course c) {
        super(code, sex, name);
        this.c=c;
    }

    @Override
    public String toString() {
        return code+ " " + name+ " " + sex + " " + c.name;
    }
}