package com.my.design.strategy;

public class Context {
	 private IStrategy strategy;
     //���캯����Ҫ��ʹ���ĸ�����
     public Context(IStrategy strategy){
          this.strategy = strategy;
     }
     public void setStrategy(IStrategy strategy){
          this.strategy = strategy;
     }
     public void operate(){
          this.strategy.operate();
     }

}
