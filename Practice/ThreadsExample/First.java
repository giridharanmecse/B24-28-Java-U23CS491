public class First extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(this.getName()+" is running "+ i);
            try{
                System.out.println(this.getName()+" is in " + this.getState() + " state "+i);
                Thread.sleep(500);
                System.out.println(this.getName()+" is in " + this.getState() + " state "+i);
            } catch(Exception e){
                System.out.println(e);
            }
        }
    } 
    
    
    
}
