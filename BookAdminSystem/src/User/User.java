package User;

import Operation.operation;
import Book.BookList;

abstract public class User {//因为user分为管理员和普通用户两类 两类用户的用户界面不一样 所以使用抽象方法和抽象类
    public String name;
    protected operation[] operations;
    //因为不同类型用户所能使用的功能不同 需要不同的实现方法
    //而这些方法又是通过接口实现的 因此用一个接口数组
    public User(String name){
        this.name=name;
    }
    abstract public int menu();
    public void choose(int option, BookList bookList){
        operations[option].work(bookList);
    }
}