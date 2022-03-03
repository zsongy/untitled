package com.atgui.stack;

import com.sun.xml.internal.ws.api.server.Adapter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Parse {
    public static void main(String[] args) {
        Random random = new Random();
        float x = random.nextFloat();//产生0.0与1.0之间的一个符点数
        int n = Math.round(20*x);  //构造20以内的一个整数
        long f = 1 ;  //保存阶乘的结果
        int k = 1 ;  //循环变量
        //*********Found********
        do{f*=k;
            k++;
            //*********Found********
        }while(k<=n);
        System.out.println(n+"!= "+f);
        System.out.println("第二个版本");
        System.out.println("分支的操作");
    }
    public static List<String> parseSuffidExpressionList(List<String> s){
        Stack<String> stack1=new Stack<String>();

        Stack<String> stack2=new Stack<String>();
        List<String> list=new ArrayList<String>();//存放中间结果
        for (String item:s) {
            if (item.matches("\\d+")){
                 stack1.push(item);
            }else if (item.equals("(")){
                stack2.push(item);
            }else if (item.equals(")")){
                while (!stack2.peek().equals("(")){
                    stack1.push(stack2.pop());
                }
                stack2.pop();
            }else {

            }
        }
        return null;
    }
}
