package com.xx.homework;

public class MyStack {


    //向栈中存储元素，我们这里使用一堆数组模拟
    //private Object[] element;
    private Object[] element ;
    //栈帧，永远指向栈顶部元素
    //默认初始值，最初的栈是空的，一个元素都没有
    private int index = -1;//如果index的值是0，表述栈帧指向元素上方、如果是-1，则栈帧指向顶部元素

    /*
    * 无参构造方法。默认初始化栈容量10；
    * */

    public MyStack(){
        //一维数组动态初始化
        //默认初始化容量是10
        this.element = new Object[10];//无参构造 //赋值
        this.index = -1;
    }
    /*0 5
    * 压栈的方法
    * */
    public  void push(Object obj){
        if (this.index >= this.element.length -1){
            System.out.println("压栈失败，栈已满!");
            return;
        }
        //程序走到这一步，说明栈没满。
        //栈中加1个元素，栈向上移动一个位置
        index++;
        element[index] = obj;

    }
    //set和get也许用不上，但是必须写上，这是规矩。
    //封装，第一步：属性私有化。第二：对外提供set和get方法
    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }
}
