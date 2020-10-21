package uprajnenie;

public class Date {
	private int sec;
	private int min;
	private int hour;
	private int day;
	private int month;
	private int year;

	public Date() {
		sec=0;
		min=0;
		hour=0;
		day=1;
		month=1;
		year=0;

	}
	public Date(int s, int m, int h, int d, int mon, int y) {
		sec = s;
		min = m;
	    hour = h;
		day= d;
		month = mon;
		year = y;
		
	}
	public int getSec() {
		return (sec);
	}

	public int getMin() {
		return (min);
	}

	public int getHour() {
		return (hour);
	}

	public int getDay() {
		return (day);
	}

	public int getMonth() {
		return (month);
	}

	public int getYear() {
		return (year);
	}

	public void setSec(int s) {
		sec = s;
	}

	public void setMin(int m) {
		min = m;
	}

	public void setDay(int d) {
		day = d;
	}

	public void setHour(int h) {
		hour= h;
	}

	public void setMonth(int m) {
		month = m;
	}

	public void setYear(int y) {
		year = y;
	}
	public int compareTo(Date d1) {
		if (year > d1.getYear()) {
			return (-1);
		} else if (year < d1.getYear()) {
			return (1);
		} else {
			if (month > d1.getMonth()) {
				return (-1);
			} else if (month < d1.getMonth()) {
				return (1);
			} else {
				if (day > d1.getDay()) {
					return (-1);
				} else if (day  < d1.getDay()) {
					return (1);
				} else {
					if (hour> d1.getHour()) {
						return (-1);
					} else if (hour < d1.getHour()) {
						return (1);
					} else {
						if (min > d1.getMin()) {
							return (-1);
						} else if (min > d1.getMin()) {
							return (1);
						} else {
							if (sec > d1.getSec()) {
								return (-1);
							} else if (sec < d1.getSec()) {
								return (1);
							} else {
								return (0);
							}
						}
					}
				}
			}
		}
	}
	public boolean IsLeap()
	{
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0) return true;
				else return false;
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	public int checkDate(Date d1) {
		int sbor = 0;
		int i = 0;
		while (d1.getMonth()-1 > i) {
			if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
				sbor += 31;
			}
			else if (i == 1) {
				if (d1.IsLeap() == false) {
					sbor += 29;
				} else
					sbor += 28;

			} else
				sbor += 30;
			i++;
		}
		sbor+=d1.getDay();
		
		return (sbor);
	}
	public int checkWeek(Date d1) {
		int week = 0;
		week=checkDate(d1)/7+1;
		return (week);
	}
	public void addSec(Date d1) {
		d1.setSec(d1.getSec()+1);
		if(d1.getSec()>=60) {
			d1.setSec(d1.getSec()-60);
			d1.setMin(d1.getMin()+1);
			if(d1.getMin()>=60) {
				d1.setMin(d1.getMin()-60);
				d1.setHour(d1.getHour()+1);
				if(d1.getHour()>=24) {
					d1.setHour(d1.getHour()-24);
					d1.setDay(d1.getDay()+1);
					if(d1.getDay()>28&&d1.getMonth()==2&& d1.IsLeap()==true) {
						d1.setDay(d1.getDay()-28);
						d1.setMonth(d1.getMonth()+1);
						if(d1.getMonth()>=12) {
							d1.setMonth(d1.getMonth()-12);
							d1.setYear(d1.getYear()+1);
						}
					}
					else if(d1.getDay()>29&&d1.getMonth()==2&&  d1.IsLeap()==false) {
						d1.setDay(d1.getDay()-29);
						d1.setMonth(d1.getMonth()+1);
						if(d1.getMonth()>=12) {
							d1.setMonth(d1.getMonth()-12);
							d1.setYear(d1.getYear()+1);
						}
					}
					else if(d1.getDay()>30&&(d1.getMonth()==4||d1.getMonth()==6||d1.getMonth()==9||d1.getMonth()==11)) {
						d1.setDay(d1.getDay()-30);
						d1.setMonth(d1.getMonth()+1);
						if(d1.getMonth()>=12) {
							d1.setMonth(d1.getMonth()-12);
							d1.setYear(d1.getYear()+1);
						}
					}
					else if(d1.getMonth()>31) {
						d1.setDay(d1.getDay()-31);
						d1.setMonth(d1.getMonth()+1);
						if(d1.getMonth()>=12) {
							d1.setMonth(d1.getMonth()-12);
							d1.setYear(d1.getYear()+1);
						}
					}
				}
			}
		}
		System.out.println(d1.getSec()+":"+d1.getMin()+":"+d1.getHour()+" "+d1.getDay()+":"+d1.getMonth()+":"+d1.getYear());
	}
}
