public class Library{
static String bookName="Rich dad and poor dad";
static int numOfBooks=9;
static boolean isAvaliable=true;

public static void library(String bookName){
	
System.out.println("name of book:"+bookName);
library("the brave",10);
}

public static void library(String bookName,int numOfBooks){
	
System.out.println("name of book:"+bookName+" "+"numOfBooks:"+numOfBooks);
library("the brave",10,false);
}

public static void library(String bookName,int numOfBooks,boolean isAvaliable){
System.out.println("name of book:"+bookName+" "+"numOfBooks:"+numOfBooks+" "+"isAvaliable:"+isAvaliable);
}

}