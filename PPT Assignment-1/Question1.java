interface showtable{
    void showTable(int num);
}

abstract class chkchar{
    abstract void chkChar(char ch);
}

class Child extends chkchar implements showtable{
    void chkChar(char ch){
        if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
            System.out.println(ch + " is vovel");
        }
        else{
            System.out.println(ch + " is consonent");
        }
        
    }

    public void showTable(int num) {
        for(int i=1; i<=10; i++){
            System.out.println(num+ " * " + i + " = " + num*i);
        }
    }
}

class Question1{
    public static void main(String args[]){
        Child obj = new Child();
        obj.chkChar('a');
        obj.showTable(5);
    }
}