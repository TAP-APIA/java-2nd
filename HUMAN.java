package ex2;

public class HUMAN {
    int code;
    String sex;
    String name;

    HUMAN(int code,String sex,String name){
        setCode(code);
        setName(name);
        setSex(sex);
    }

    int getCode(){
        return code;
    }
    String getSex(){
        return sex;
    }
    String getName(){
        return name;
    }
    void setCode(int X){
        this.code = X;
    }
    void setSex(String X){
        this.sex = X;
    }
    void setName(String X){
        this.name = X;
    }

}
