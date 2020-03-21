package execution;


import definition.MyStack;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        MyStack<Integer> stack=new MyStack<> ();
        final Scanner sc=new Scanner ( System.in );
        int var=0;
        while(true){
            System.out.println ("press 1 to \"Push\" a node at top");
            System.out.println ("press 2 to \"Pop\" a node");
            System.out.println ("press 3 to \"Peek\" a node");
            System.out.println ("press 4 to exit...");

            var=sc.nextInt();
            switch(var){
                case 1:
                    System.out.println ("enter a data to be push in stack");
                    int data=sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    int popedElement=stack.pop ();
                    System.out.println ("remove top element...");
                    break;
                case 3:
                    System.out.println ("Top of Node: "+stack.peek ());
                    break;
                case 4:
                    System.out.println ("you r now exit from code..thanks for this implementation");
                    System.exit ( 0 );
                default:
                    System.out.println ("enter a valid input!!!!!");
            }
        }
    }
}
