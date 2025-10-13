class Ex1{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        String str = null;
        System.out.println("Trying to print Array Values");
       try{
        System.out.println(10/5);
        System.out.println(arr[4]);
        System.out.println(str.length());
       } catch (ArithmeticException e){
        System.out.println("Divided by zero Occured");
       } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Array size is Less");
       } catch (Exception e){
        System.out.println("other Exception");
       }
        System.out.println("The 2 values Printed");
    }
}