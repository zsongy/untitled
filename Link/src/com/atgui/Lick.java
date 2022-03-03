package com.atgui;

public class Lick {
    public static void main(String[] args) {
        CricleLinkList t=new CricleLinkList();
        t.addBoy(5);
        t.show();
        System.out.println("-------");
        t.count(2,2,5);
    }
}
class CricleLinkList{
    private Boy frist=null;
    public void count(int startNo,int count,int nums){
        if(frist==null||startNo<1||count>nums){
            System.out.println("数据错误,重新输入");
            return;
        }
        Boy help=frist;
        while (true){
          if (help.getNext()==frist){
              break;
          }
          help=help.getNext();
        }
        for (int i=0;i<startNo-1;i++){
            frist=frist.getNext();
            help=help.getNext();
        }
        while (true){
            if (help==frist){
                break;
            }
            for (int i=0;i<count-1;i++){
                frist=frist.getNext();
                help=help.getNext();
            }
            System.out.println("第"+frist.getNo()+"个孩子出圈了");
            frist=frist.getNext();
            help.setNext(frist);
        }
        System.out.println("最后在圈中的是"+frist.getNo());
    }
    public void show(){
        if (frist==null){
            System.out.println("链表为空");
            return;
        }
        Boy curBoy=frist;
        while (true){
            System.out.println("小孩的编号是"+curBoy.getNo());
            if (curBoy.getNext()==frist){
                break;
            }
            curBoy=curBoy.getNext();
        }
    }
    public void addBoy(int sum){
        if(sum<1){
            System.out.println("sum的值不能少于1");
            return;
        }
        Boy cur=null;
        for (int i=1;i<=sum;i++){
            Boy boy=new Boy(i);
            if (i==1){
                frist=boy;
                frist.setNext(frist);
                cur=frist;
            }else {
                cur.setNext(boy);
                boy.setNext(frist);
                cur=boy;
            }
        }
    }
}
class Boy{
    private int no;
    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "no=" + no +
                ", next=" + next +
                '}';
    }
}
