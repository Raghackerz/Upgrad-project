package com.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Main {
public class student{
  String name;
  float cgpa,tokenno;
  public student(){}
}
    
    public static int minIndex(Queue<student> list, int sortIndex) 

    { 

    int min_index = -1; 
Main m=new Main();
    Main.student min_val=m.new student();
    min_val.cgpa=10;

    int s = list.size(); 

    for (int i = 0; i < s; i++) 

    { 

        student current = list.peek(); 

        list.poll(); 

        if (current.cgpa <= min_val.cgpa && i <= sortIndex) 

        { 

            min_index = i; 

            min_val.cgpa = current.cgpa; 

        } 

        list.add(current);  

    } 

    return min_index; 
} 


    public static void insertMinToRear(Queue<student> list, 

                                             int min_index) 

     { 

        Main m=new Main();
    Main.student min_val=m.new student();

        int s = list.size(); 

        for (int i = 0; i < s; i++) 

        {  
        
        
        Main.student current=m.new student();

        current = list.peek(); 

        list.poll(); 

        if (i != min_index) 

            list.add(current); 

        else

            min_val= current; 

        } 

        list.add(min_val); 

    } 

      

    public static void sortlist(Queue<student> list) 

    { 

        for(int i = 1; i <= list.size(); i++) 

        { 

            int min_index = minIndex(list,list.size() - i); 

            insertMinToRear(list, min_index); 

        } 
        
        Stack<student> stack = new Stack<>(); 

        while (!list.isEmpty()) { 

            stack.add(list.peek()); 

            list.remove(); 

        } 

        while (!stack.isEmpty()) { 

            list.add(stack.peek()); 

            stack.pop(); 

        } 

    } 
    
  public static void main(String[] args) {
  int inputno;
  String s,name;
  int cgpa,tokenno;
  Main m=new Main();
    Main.student stu=m.new student();
  Queue<student> list = new LinkedList<>(); 
  Scanner sc = new Scanner(System.in);
  inputno=sc.nextInt();
      
      for(int i=0;i<inputno;++i){
        s=sc.nextLine();
        if(s=="ENTER"){
          stu.name=sc.nextLine();
          stu.cgpa=sc.nextInt();
          stu.tokenno=sc.nextInt();
          list.add(stu);
          sortlist(list);
        }
        else if(s=="SERVED"){
          list.remove();
        }
      }
      while(list.isEmpty()== false) 

        { 

            System.out.print(list.peek().name + " "); 

            list.poll(); 

        } 
  }
}

  

