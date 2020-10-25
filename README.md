# 计191 董梓潇 2019310187
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
![流程图](https://github.com/TAP-APIA/java-2nd/blob/main/%E7%BB%98%E5%9B%BE7.jpg)


### 五、核心代码
#### 以下代码展示了选课与退课的重要逻辑组成，是本次实验的核心内容。
```
while (true) {
            System.out.println(PUBG);
            System.out.println(ksby);
            a:
            while (true) {

                System.out.println("输入学号，没有的差不多得了" + "\uD83D\uDE05");
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
```
### 六、实验结果
![实验运行截图](https://github.com/TAP-APIA/java-2nd/blob/main/()U%60KICNFHHZB_XZ%25YO(%5DA0.png)
### 七、实验感想
####  本次实验，让我理解了继承的应用方法，同时对复杂逻辑在JAVA中如何实现这一问题有了答案。
