package practice1;

import java.util.Stack;

@FunctionalInterface
public interface BinaryOperation<T> {      //super타입  //interface조건기술
    public T apply(T x, T y);
}
// //<T>는 실제 동작하는 코드가 아님
// class Stack<T> {
//     //코드를 찍어내는 
//     // public stack() {}
//     // public Stack push(T newElem) {}
//     // public Stack pop() {}
//     // public Object top() {}


// public static void main(String[] args) {
//     int x = 4;
//     Integer y = new Integer(4);//4가 들어있는 메모리의 주소
//     String s = new String("");
//     Object s = s;
//     String s2 = (String)o;
//     System.out.println(s == 0);
//     }
// }