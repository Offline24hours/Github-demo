package Q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //Declared 4 queue which are named with respective product code
        MyQueue<String> productCode = new MyQueue<>();
        MyQueue<String> P03 = new MyQueue<>();
        MyQueue<String> P02 = new MyQueue<>();
        MyQueue<String> P06 = new MyQueue<>();
        MyQueue<String> P04 = new MyQueue<>();

        String temp = "";

        try{
            //Implement scanner class into read the labtest2.txt
            Scanner sc = new Scanner(new FileInputStream("C:\\Users\\Jay Tan\\Downloads\\WIA 1002 YR1 SEM2\\labtest2.txt"));

            //Assign the product into different queue according to respective product code
            while(sc.hasNextLine()){
                //Assign the line into temp variable
                temp = sc.nextLine();

                //Assign each of the string in the temp into the arr
                String [] arr = temp.split(" ");

                //Using nested for loop to enqueue each of the product according to their product code into different queue
                int x = 0;
                int c = 0;
                int v = 0;
                int b = 0;
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j].equals("P03")) {
                        if(x == 1){
                            productCode.enqueue(arr[j]);
                        }
                        P03.enqueue(arr[j + 1]);
                        x++;
                    } else if (arr[j].equals("P02")) {
                        if(c == 1){
                            productCode.enqueue(arr[j]);
                        }
                        P02.enqueue(arr[j + 1]);
                        c++;
                    } else if (arr[j].equals("P06")) {
                        if(v == 1){
                            productCode.enqueue(arr[j]);
                        }
                        P06.enqueue(arr[j + 1]);
                        v++;
                    } else if (arr[j].equals("P04")){
                        if(b == 1){
                            productCode.enqueue(arr[j]);
                        }
                        P04.enqueue(arr[j + 1]);
                        b++;
                    }
                }

            }
            sc.close();
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }

        //Display the product code
        System.out.print("Product Code in Queue: ");
        while(!productCode.isEmpty()){
            System.out.print(productCode.dequeue() + " --> ");
        }
        System.out.println();

        System.out.println("List of product by categories");

        //Display the products in P03
        System.out.println("Product : P03");
        while(!P03.isEmpty()){
            System.out.print(P03.dequeue() + " --> ");
        }
        System.out.println();

        //Display the products in P02
        System.out.println("Product : P02");
        while(!P02.isEmpty()){
            System.out.print(P02.dequeue() + " --> ");
        }
        System.out.println();

        //Display the products in P06
        System.out.println("Product : P06");
        while(!P06.isEmpty()){
            System.out.print(P06.dequeue() + " --> ");
        }
        System.out.println();

        //Display the products in P04
        System.out.println("Product : P04");
        while(!P04.isEmpty()){
            System.out.print(P04.dequeue() + " --> ");
        }
        System.out.println();

    }
}
