import java.util.*;

interface operation{


    void insert();
    void delet();

                }
          
              public class Innerqueue implements operation{
                int rare;
                int front;
                front=-1;
                rare=-1;
                int size=5;

                int a[]=new int[10];
               public  insert(int item){
                
                if(rare==size-1){
                    System.out.println("insertion is not possible the queueue is full");
                }
        
               else if(front==-1){
                    front=0;
                    rare=0;
                    a[rare]=item;


                }else{
                    rare++;
                    a[rare]=item;
                    

                }


                }
                 public void delet(){
                    if(front==-1){
                        System.out.println("the queue is empty");
                    }else if(rare==front){
                        System.out.println("the deleted element is "+a[front]);
                        rare=-1;
                        front=-1;
    
                        
                    }else{
                        System.out.println("the deleted element is "+a[front]);
                        front++;
                    }


                 }
                 public display(){
                    if(rare==-1){
                        System.out.println("the quueue is empty");

                    }else {
                        for(int i=front;i<rare;i++){
                            System.out.print(a[rare]+"\t");
                        }
                    }
                 }
                
              }
                public class queue {
                    public static void main(String ah[]){
                        Scanner sc=new Scanner(System.in);
                    int item,opt;
                    Innerqueue obj=new Innerqueue();
                    do{
                        
                    System.out.println("enter the option");
                    System.out.println("\t 1 FOR INSERT  \t2 FOR DELET \t 3 FOR DISPLAY \t4 FOR EXIT");

                    switch(opt){
                        case 1:
                        System.out.println("enter the number to be inserted");
                        item=sc.nextInt();
                        obj.insert(item);
                        break;
                        case 2:
                        obj.delet();
                        break;
                        case 3:
                       obj. display();
                        break;
                        case 4:
                            break;

                    }

                    }while(opt!=4);
                                                     }
                                   }
