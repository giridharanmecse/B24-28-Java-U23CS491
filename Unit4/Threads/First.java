public class First extends Thread {
    public void run(){
        for(int i =1;i<=10;i++){           
            System.out.println("Name :"+this.getName()+" State "+this.getState()+" "+i);
        }
    }
    
}
