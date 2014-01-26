/**
/*You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?*/

public class Euler_19 {
  
  
  public static void main(String[] args) { 
    System.out.println(daysInYear());
  }
  
  public static int daysInYear(){
  int year = 365;
  int leapyear = 366;
  int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
  int[] daysnumber = {0, 1, 2, 3, 4, 5, 6};
    int firstYear = 1901;
    int lastYear = 2000;
    int currentYear = 1901;
    int firstDay = 1;
    int currentDay = 1;
    int temp = 0;
    int i = 1;
    int k = 0;
    
    int sundayCount = 0;
    
    for(int y = firstYear; y <= lastYear; y++){
    k = 0;
    i = firstDay;
    if(y%4 == 0){
    months[1] = 29;
    }else if (y%4 != 0){
    months[1] = 28;
    }
    
    
    for(int j = 0; j < months[k]; j++){
      if(j == 0 && i == 6){
      sundayCount++;
      }
      
      if(j == months[k] - 1 && k != 11){
      j = -1;
      k++;
      }
      
      if(i < 6){
        i++;
        firstDay = i;
      } else if(i == 6){
        i = 0;
        firstDay = i;
      }
    }
    }
    return sundayCount;
  }
}