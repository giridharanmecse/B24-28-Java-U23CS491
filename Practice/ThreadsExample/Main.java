public class Main {
    public static void main(String[] args) {
        First t1=new First();
        First t2=new First();
        t1.setName("T1");
        t2.setName("T2");
        System.out.println("Name : "+t1.getName()+" State "+t1.getState());
        System.out.println("Name : "+t2.getName()+" State "+t2.getState());
        System.out.println("t1 Started");              
        t1.start();
        System.out.println("T1 is invoked and Moved to Next State");
        System.out.println("t2 Started");
        System.out.println("Name : "+t1.getName()+" State "+t1.getState());
        System.out.println("Name : "+t2.getName()+" State "+t2.getState());  
        t2.start();
        System.out.println("Name : "+t1.getName()+" State "+t1.getState());
        System.out.println("Name : "+t2.getName()+" State "+t2.getState());
        try{
            t1.join();
            t2.join();
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Name : "+t1.getName()+" State "+t1.getState());
        System.out.println("Name : "+t2.getName()+" State "+t2.getState());
    }
    
}
