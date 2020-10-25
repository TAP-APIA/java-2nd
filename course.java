package ex2;

public class course{
    int code;
    String name;
    String Classroom;
    String time;
    course(int code,String name,String Classroom,String time){
        setClassroom(Classroom);
        setCode(code);
        setName(name);
        setTime(time);
    }


    int getCode(){
        return code;
    }
    String getName(){
        return  name;
    }
    String getClassroom(){
        return  Classroom;
    }
    String getTime(){
        return  time;
    }
    void setCode(int X){
        this.code = X;
    }

    void setName(String X){
        this.name = X;
    }

    void setClassroom(String X){
        this.Classroom = X;
    }

    void setTime(String X){
        this.time = X;
    }
    public String toString() {
        return "   课程号:"+code+ "   课程名:" + name+ "   教室:" + Classroom + "   上课时间:" + time;
    }

}
