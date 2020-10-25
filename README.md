# 计191 高萌 2019310175
# java-2nd
😅
### 一、	实验目的
#### 	初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法.
### 二、实验要求	
#### 1.	编写上述实体类以及测试主类（注意类之间继承关系的适用）
#### 2.	在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 ）；模拟学生退课操作，再打印课程信息。
#### 3.	编写实验报告。
### 三、实验过程	
#### 1.	根据实验要求，建立父类：人员类(Human),对象属性包含，人员编号，姓名，性别。
#### 2.	建立子类，教师类，继承父类的方法，并添加特有属性，所授课程。
#### 3.	建立子类，学生类，继承父类的方法，并添加特有属性，所选课程。
#### 4.	建立课程类，要求：
##### 1)  添加属性code，并通过构建setCode来设置code的值。	
##### 2)  添加属性name，并通过构建setName，来设置name的值。	
##### 3)	添加属性time，并通过构建setTime，来设置time的值。
##### 4)	添加教师类变量t，使教师类中的所授课程和对应的授课教师能与课程类关联，避免出现课程类与教师类，内容存在冲突的情况。
##### 5)  添加属性Classroom，并通过构建setClassroom，来设置Classroom的值。	
#### 5.	通过对教师类地址的重写，使其结果满足：教师编号:" + getCode() + " 教师姓名:" + getName() + " 性别:" + getSex() + " 所授课程:" + Lesson;
#### 6.	通过对学生类地址的重写，使其结果满足：学生编号:" + getCode() + " 学生姓名:" + getName() + " 性别:" + getSex() + " 所授课程:" + Lesson;
#### 7.	创建Test测试类(主类)，要求如下：
##### 对类进行赋值，依据逻辑关系创建必须的数组，使用必须的switch，while等类型语句。

### 四、流程图
![流程图](https://github.com/GM-01/JavaExperiment-2/blob/main/%E9%80%89%E8%AF%BE%E7%B3%BB%E7%BB%9F%E6%B5%81%E7%A8%8B%E5%9B%BE.png)


### 五、核心代码
#### 以下代码，是我本次实验耗时最多的时间，其中课程类中，定义了教师类的变量，并在最后对课程类地址重写中，调用教师类中的所选课程和对应的授课教师变量的值，这样可以避免出现，老师与课程冲突这个问题。
```
package Experiment2;

public class Teacher extends Human {     //继承Human类
    String TeachLesson;
    String name;
    Teacher(int code, String name, char sex, String lesson) {
        super(code, name, sex);          //调用Human的方法
        this.TeachLesson = lesson;       
        this.name = name;
    }
    public String toString() {           //对地址重写
        return "教师编号:" + getCode() + " 教师姓名:" + getName() + " 性别:" + getSex() + " 所授课程:" + TeachLesson;
    }
}
```
```
package Experiment2;

public class Course {
    int number;
    String site;
    String time;
    Teacher t;                          //定义教师类变量
    Course(int number,String site,String time,Teacher t) {
        setNumber(number);
        setSite(site);
        setTime(time);
        this.t = t;                    //设置教师类变量的值
    }

    void setNumber(int number) {
        this.number = number;
    }

    void setSite(String site) {
        this.site = site;
    }

    void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return "课程编号:"+ number +" 课程名称:"+t.TeachLesson+" 上课地点:"+site+" 时间:"+time+" 授课教师:"+t.name;
    }
}
```
#### 这段代码展示了，如何将多个学生进行选课与退课，首先，建立一个学生类数组，将学生类对象的值赋给学生类数组，然后，用循环里的值调用数组下标，进行退选课操作。 
```
while (z < 3) {
            Scanner scan = new Scanner(System.in);
            System.out.println("学生是否选课？？？" + "\n" + "Y or N");
            String i = scan.next();
            switch (i) {
                case "Y":
                case "y":
                    System.out.println("开始选课,请输入课程编号");
                    Scanner ch = new Scanner(System.in);
                    int j = ch.nextInt();
                    switch (j) {
                        case 13:
                            a[z].setLearnLesson(t1.TeachLesson);
                            System.out.println(a[z]);
                            break;
                        case 20:
                            a[z].setLearnLesson(t2.TeachLesson);
                            System.out.println(a[z]);
                            break;
                        case 21:
                            a[z].setLearnLesson(t3.TeachLesson);
                            System.out.println(a[z]);
                            break;
                        default:
                            System.out.println("输入编号有误");
                    }
                    break;
                case "n":
                case "N":
                    System.out.println("不选课你搁这里骗技能呢？？？妹妹");
                    break;
//                    continue;
                default:
                    System.out.println("输入有误");
            }
            System.out.println("学生是否退课？？？" + "\n" + "Y or N");
            Scanner scan1 = new Scanner(System.in);
            String u = scan1.next();
            switch (u) {
                case "y":
                case "Y":
                    a[z].setLearnLesson("无");
                    System.out.println(a[z]);
                    break;
                case "n":
                case "N":
                    System.out.println("祝您生活愉快");
                    break;
                default:
                    System.out.println("输入有误");
            }
            z++;
        }
```
### 六、实验结果
![实验运行截图](https://github.com/GM-01/JavaExperiment-2/blob/main/ALOJ%400622PWO%5B5N2%60%25RF6RS.png)
### 七、实验感想
####  本次实验，除了继承了上一个实验的基本内容，即类与主类之间的联系，程序并不一定要写在一个文件里面，自定义类增加了代码的自由度与功能性之外，继承，成为了本次实验的重点，在编写本次实验程序时，通过与同学交流，大家普遍认为难点在于选课退课的实现，但是对于我来说，在测试主类中实现的退课选课并没有花费我大量的时间，反而是，对教师，学生，课程类中关键变量的关联，即如何能在课程类中调用教师类的授课教师姓名与其对应的所授课程，避免课程类与教师类内容冲突，以及，如何在学生选课中，使学生类与教师类中，所选课程与所授课程统一，这些需求，给我造成了不小的困难，花费了不少功夫去解决。  
####  另外，又一次在Java中学到了以往学不到的，super方法和子类继承父类，这个看起来很鸡肋，不就是和数学类似的思想，提取公因式，但是，我认为这个方法能使各类之间建立联系，保持相对的统一性，同时，也大大减少了相同代码的复写，提高了工作效率。
####  最终，这个选课系统并不完美，依旧存在一些漏洞，但是这个实验足以将我目前所学，进行不断的深化，也学到了各类之间变量的调用，地址的复写，这些都使我的代码不断的简化。
