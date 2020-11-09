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
}