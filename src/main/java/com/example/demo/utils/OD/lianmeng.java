package com.example.demo.utils.OD;

public class lianmeng {
    int ans;
    int sum;
    int[] a;
    public static void main(String[] args) {
        lianmeng l=new lianmeng();
        l.getInfo(new int[]{1,2,3,4,5,6,7,8,9,10
        });
    }
    public void getInfo(int[] a){
        int sum=0;
        for(int o:a){
            sum+=o;
        }
        this.a=a;
        this.sum=sum;
        System.out.println(sum);
        getIn(0,0);
        System.out.println(ans);

    }
    public  void  getIn(int index,int tmpsum){
        if(index>=10){
            return;
        }
        cucl(tmpsum);
//        System.out.println(index);
//        for(int i=index;i<this.a.length;i++){
        getIn(index+1,tmpsum);
        tmpsum+=a[index];
        getIn(index+1,tmpsum);
//        }
    }
    public  void cucl(int a){
        int another=this.sum-a;
        this.ans=Math.min(this.ans,Math.abs(another-a));
    }
}
