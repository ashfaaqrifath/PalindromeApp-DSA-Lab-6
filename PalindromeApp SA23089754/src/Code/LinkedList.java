/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class LinkedList {
    
    private Link first;

    public LinkedList() {
        first = null;
    }
    
    public Link getFirst(){
        return first;
    }
    
    public void insertFirst(char w){
        Link obj = new Link(w);
        obj.next = first;
        first = obj;
    }
    public Link deleteFrist(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    
    public boolean isEmpty(){
        Link current = first;
        if(current == null){
            return true;
        }
        else{
            return false;
        }
    }
    
}
