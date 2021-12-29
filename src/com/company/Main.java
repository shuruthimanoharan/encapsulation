package com.company;
class Data
{
    private int Id;
      private String password;

    public int getId()
    {
        int Id=78998;
        return Id;
    }
    public  void setId(int Id)
    {
        this.Id=Id;
    }
    public String getPassword()
    {
        String password="asasas";
        return password;
    }
    public  void setPassword(String password)
    {
        this.password=password;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Data data=new Data();
        data .getId();
        data .setId(1234);
        data .getPassword();
        data .setPassword("shuruthi");
    }
}
