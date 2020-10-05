/*
package com.xx.homework;

public class Room {

    private int no;
    private String type;
    private boolean status;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
        //Idea 工具默认生成is方法（get方法）
    //public boolean isStatus() {
        public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean equals(Object obj){
        //重写equals方法
        if (obj == null || ! (obj instanceof Room )) return false;
        if (this == obj) return true;
        Room room = (Room)obj;
        //认为同一房间编号
        return this.getNo() == room.getNo();
    }
    //equals：用来比较两个对象是否相同的
    //toString方法重写！
    //toString方法为了吧给出的对象转化为字符串
    public Room(int no, String type, String status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }
    public String toString(){
        return "["+no+","+type+","+(status ? "空闲":"占用")+"]";
    }

    public static void main(String[] args) {
        Room room =new Room(101,"单人间",true);
        System.out.println(room.toString());
    }

}
*/
