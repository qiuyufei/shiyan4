package shiyan4;

import java.util.Scanner;

public class Test{
	
	
	public interface student {
		 public abstract void setFee(double fee);
		 public abstract double getFee();
	}
	public interface teacher {
		public abstract void setPay(double pay);
		public abstract double getPay();
	}
		
		public static void main(String[] args) {
			
			PHD graduate = new PHD();
			
			System.out.println("请输入姓名：");
			Scanner canner = new Scanner(System.in);
			
			graduate.name = canner.next();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("请输入你的月工资：");
			double pay = scanner.nextDouble();
			graduate.setPay(pay);
			
			System.out.println("请输入你一学期的学费：");
			double fee = scanner.nextDouble();
			graduate.setFee(fee);
			
		}
		
    }

