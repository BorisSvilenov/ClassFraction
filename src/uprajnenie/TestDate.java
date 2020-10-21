package uprajnenie;

import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		Date d1=new Date();
		d1.setSec(a);
		a=scan.nextInt();
		d1.setMin(a);
		a=scan.nextInt();
		d1.setHour(a);
		a=scan.nextInt();
		d1.setDay(a);
		a=scan.nextInt();
		d1.setMonth(a);
		a=scan.nextInt();
		d1.setYear(a);
		a=scan.nextInt();
		Date d2=new Date();
		d2.setSec(a);
		a=scan.nextInt();
		d2.setMin(a);
		a=scan.nextInt();
		d2.setHour(a);
		a=scan.nextInt();
		d2.setDay(a);
		a=scan.nextInt();
		d2.setMonth(a);
		a=scan.nextInt();
		d2.setYear(a);
		System.out.println(d1.compareTo(d2));
		if(d1.IsLeap()==true) {
			System.out.println("Leap year");
		}else System.out.println("Common year");
		
		if(d2.IsLeap()==true) {
			System.out.println("Leap year");
		}else System.out.println("Common year");
		System.out.println(d1.checkDate(d1));
		System.out.println(d1.checkWeek(d1));
		System.out.println(d2.checkDate(d2));
		System.out.println(d2.checkWeek(d2));
		d1.addSec(d1);
		int n=scan.nextInt();
		Date[] dm=new Date[n];
		for(int i=0;i<n;i++) {
			dm[i]=new Date();
			a=scan.nextInt();
			dm[i].setSec(a);
			a=scan.nextInt();
			dm[i].setMin(a);
			a=scan.nextInt();
			dm[i].setHour(a);
			a=scan.nextInt();
			dm[i].setDay(a);
			a=scan.nextInt();
			dm[i].setMonth(a);
			a=scan.nextInt();
			dm[i].setYear(a);
		}  
		BubbleSort(dm);
		for(int i=0;i<n;i++) {
			System.out.println(dm[i].getSec()+":"+dm[i].getMin()+":"+dm[i].getHour()+":"+dm[i].getDay()+":"+dm[i].getMonth()+":"+dm[i].getYear());
		}
		scan.close();
	}
	public static void BubbleSort(Date[] d1) {
		Date temp;
		for(int i=0;i<d1.length-1;i++) {
			for(int j=1;j<d1.length;j++) {
				if(d1[i].compareTo(d1[j])==-1) {
					temp=d1[i];
					d1[i]=d1[j];
					d1[j]=temp;
				}
			}
		}
	}

}
