package couplings;

interface Topic 
{ 
    void understand(); 
} 

class Topic1 implements Topic
{ 
    public void understand() 
    { 
        System.out.println("Got it"); 
    } 
}
class Topic2 implements Topic { 
    public void understand() 
    { 
        System.out.println("understand"); 
    } 
} 
public class LooseCoupling 
{ 
    public static void main(String[] args) 
    { 
        Topic t = new Topic2(); 
        t.understand(); 
    } 
} 
