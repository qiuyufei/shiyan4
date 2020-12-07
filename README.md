# 计G202 2020322099 邱煜斐
# 实验4

## 实验内容：
    某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
    1）设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
    2）设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
    3）编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。

## 实验要求：
    1）在 博士研究生类中实现各个接口定义的抽象方法;
    2）对年学费和年收入进行统计，用收入减去学费，求得纳税额；
    3）国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
    4）实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
    5）根据输入情况，要在程序中做异常处理。

## 实验目的：
    ·掌握Java中抽象类和抽象方法的定义； 
    ·掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
    ·了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验过程：
    ·首先在Student.java与Teacher.java中使用set与get创建接口，从而完成Students.java与Teacher.java。
    ·然后在PHD.java中构建博士类赋予其相应的元素与相应的运算。
    ·再在Tist.java中进行scanner的语法来实现键盘的键入
    ·其他具体详情见核心代码环节
## 核心代码：
    ·1，建立接口，使用set与get的代码展示：
    ···
    public interface student {
		 public abstract void setFee(double fee);
		 public abstract void getFee(double fee);
         }
    ···
    ·2，调用接口的代码展示。
    ···
    public abstract class graduate implements student,teacher
    ···
    ·3，使用scanner来实现键盘的键入。
    ···
    System.out.println("请输入姓名：");
			Scanner canner = new Scanner(System.in);
    ···
    ·4，使用try方法和if.else来实现税率的运算
    ···
    try{
		if((salary-fee)<3000) {
			System.out.println("应纳税款"+(salary-fee)*0.03);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.03)));
		}else if((salary-fee)>3000 && (salary-fee)<=12000){
			
			System.out.println("应纳税款"+(salary-fee)*0.1);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.1)));
		}
     ···
## 输出结果：

![](https://github.com/qiuyufei/shiyan4/blob/main/%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C/qyf.PNG)

## 实验感想：
    ·首先学会了新建接口，和调用接口。
    ·其次目前可以很熟练的使用set和get方法，来达成自己的目的。
    ·学会了try方法，并可以熟练使用if.else.else if.来实现运算的多种情况
    ·然后此次代码的完成在没有思路时完成的很困难，去同学哪里取了不少经，以后会匀出时间去钻研研究。
