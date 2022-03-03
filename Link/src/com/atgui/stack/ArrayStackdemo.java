package com.atgui.stack;

import java.util.Arrays;

public class ArrayStackdemo {
    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(10);
        stack.addStack(2);
        stack.addStack(4);
        stack.addStack(7);
        stack.list();
    }
}
class ArrayStack{
    private int top=-1;
    private int maxSize;
    private int[] stack;
    public ArrayStack(int maxSize){
        this.maxSize=maxSize;
        stack=new int[this.maxSize];
    }
    public boolean ifFull(){
        return top==maxSize-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void addStack(int val){
        if (ifFull()){
            System.out.println("链表已满");
            return;
        }
        top++;
        stack[top]=val;
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈空");
        }
        int values=stack[top];
        top--;
        return values;
    }
    public void list(){
        if (isEmpty()){
            System.out.println("栈空");
            return;
        }
        for (int i=top;i>=0;i--){
            System.out.println("第"+i+"是"+stack[i]);
        }
    }
    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", maxSize=" + maxSize +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }
}