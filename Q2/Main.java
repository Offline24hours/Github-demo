package Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //Declared stack object
        MyStack<String> stack = new MyStack<>();
        String root = "";
        int i = 0;
        try{
            //Using scanner class to read the test.xml
            Scanner sc = new Scanner(new FileInputStream("C:\\Users\\Jay Tan\\Downloads\\WIA 1002 YR1 SEM2\\test.xml"));
            while(sc.hasNext()){
                if (sc.next().equals("<") || sc.next().equals(">")){
                    stack.push(sc.next());
                } else {
                    //Assign the root into root variable
                    if(i == 0){
                        root = sc.next();
                    }
                    stack.push(sc.next());
                }
                i++;
            }
            sc.close();
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }

        StringBuilder preference = new StringBuilder();
        int j = 0;
        int x = 0;
        while(!stack.isEmpty()){
            if (stack.peek().equals("<") || stack.peek().equals(">")){
                preference.append(stack.pop());
                j++;
            }else if (stack.peek().equals(root)){
                x++;
            }
        }

        //Display the XML file
        System.out.println("Contents of XML file");
        displayXML();

        //Check an XML document only have one root element or not
        if(x > 2){
            System.out.println("Duplicate root element <note>");
        }
    }

    public static void displayXML(){
        try{
            Scanner sc = new Scanner(new FileInputStream("C:\\Users\\Jay Tan\\Downloads\\WIA 1002 YR1 SEM2\\test.xml"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File is not found!");
        }
    }
}
