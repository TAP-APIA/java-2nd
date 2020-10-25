package ex2;

public class STUDENT extends HUMAN{
    String Lesson;
    STUDENT(int code, String sex, String name,String Lesson){
        super(code, sex, name);
        setLesson(Lesson);
    }

    public void setLesson(String lesson) {
        this.Lesson = lesson;
    }

    public String getLesson() {
        return Lesson;
    }
    public String toString() {
        return "学号:"+code+ "   学生姓名:" + name+ "   学生性别:" + sex + "   所选课程: " +Lesson ;
    }
}
