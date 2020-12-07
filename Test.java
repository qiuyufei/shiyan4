import java.util.Scanner;

public class Test {
    static final int qb=5000;
    public static void main(String args[]){


        Dc dc1 = new Dc();
        Dc dc2 = new Dc();

        Test t = new Test();

        try {
            t.catM(dc1);
            //System.out.println("\n");
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            t.catM(dc2);}
        catch (Exception e){
            System.out.println("输入有误，请按规则输入！");
        }

    }



    float Ssal(float sal){                               //年薪水
        return sal*12;
    }

    float Stu(float tu){                                 //年学费
        return tu;
    }

    float Ssum(float nsal,float ntu){                    //年收益
        float x;
        x=nsal-ntu;
        return x;
    }

    float tax(float sum){                                //年纳税
        double y=0;
        if(sum<=qb){
            y=0;
        }else if(sum>qb&&sum<=8000){
            y= (float) (sum*0.03);
        }else if(sum>8001&&sum<=17000){
            y=sum*0.1;
        }else if(sum>17001&&sum<=30000){
            y=sum*0.2;
        } else{
            System.out.println("博士研究生不应有这么多的收入");
        }
       return (float) y;
    }

    void catM(Dc dc){                                    //输出信息
        float x,y,z,a;

        Test t =new Test();
        System.out.println("输入姓名，年龄，性别，薪水，学费");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        dc.name=sc.next();
        dc.age=sc.nextInt();
        dc.sex=sc.next();
        dc.sal=sc.nextFloat();
        dc.tu=sc.nextFloat();


        x=t.Ssal((float) dc.sal);
        y=t.Stu((float) dc.tu);
        z=t.Ssum(t.Ssal((float) dc.sal),t.Stu((float) dc.tu));
        a=t.tax(z);

        //System.out.println(dc.name+"的每学期学费为:"+dc.tu+",每月薪水为:"+dc.sal);
        dc.catSal((float) dc.sal);
        dc.catT((float) dc.tu);
        System.out.println(dc.name+"的年薪水为:"+x+",年学费为:"+y+",年纳税为:"+a);

    }
}
