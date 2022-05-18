package Q2;

import java.util.ArrayList;

public class MyStack<E> {

    private ArrayList<E> list = new ArrayList<>();
    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E result = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return result;
    }

    public E peek(){
        return list.get(list.size() - 1);
    }

    public int getSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return "Stack: " + list.toString();
    }

    public boolean search(E o){
        for(E temp : list){
            if(temp == o){
                return true;
            }
        }
        return false;
    }
}

