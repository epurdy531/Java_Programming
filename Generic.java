 
public class Generic<T>  
{  
   
        public T dataField;       
        public T increment(){          
             return dataField + 1;
           }    
        public static void  main(String[] args)  {     
              Generic<Integer> number = new Generic<Integer>();     
              System.out.println("The result of increment is: " + number.increment());   
            }
   }  
