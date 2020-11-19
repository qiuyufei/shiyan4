package shiyan4;

import shiyan4.Test.student;
import shiyan4.Test.teacher;

public class PHD {
	public abstract class graduate implements student,teacher {
		}
    public String name,sex;
    int age;
    double fee,pay;
    public void setPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
    public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
    public void setFee(double fee) {
		this.fee = fee * 2;
		System.out.println("你每年的学费为：" + this.fee);
    }
    public void getFee(double fee) {
		this.fee = fee * 2;
		System.out.println("你两学期的学费为：" + this.fee);	
	}
    public static void ratepaying() {
		try{
		if((salary-fee)<3000) {
			System.out.println("应纳税款"+(salary-fee)*0.03);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.03)));
		}else if((salary-fee)>3000 && (salary-fee)<=12000){
			
			System.out.println("应纳税款"+(salary-fee)*0.1);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.1)));
		}else if((salary-fee)>12000 && (salary-fee)<=25000) {
			System.out.println("应纳税款"+(salary-fee)*0.2);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.2)));
		}else if((salary-fee)>25000 && (salary-fee)<=35000) {
			System.out.println("应纳税款"+(salary-fee)*0.25);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.25)));
		}else if((salary-fee)>35000 && (salary-fee)<=55000) {
			System.out.println("应纳税款"+(salary-fee)*0.3);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.3)));
		}else if((salary-fee)>55000 && (salary-fee)<=80000) {
			System.out.println("应纳税款"+(salary-fee)*0.35);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.35)));
		}else if((salary-fee)>80000) {
			System.out.println("应纳税款"+(salary-fee)*0.45);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.45)));
		}	
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
