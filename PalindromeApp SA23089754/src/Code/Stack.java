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
public class Stack {
    
    LinkedList words;

    public Stack() {
        words = new LinkedList();
    }
    
    public void push(char w){
        words.insertFirst(w);
    }
    
    public Link pop(){
        return words.deleteFrist();
    }
            
            
    public Link peek(){
        return words.getFirst();
    }
    
    public boolean isEmpty(){
        return words.isEmpty();
    }
    
}
