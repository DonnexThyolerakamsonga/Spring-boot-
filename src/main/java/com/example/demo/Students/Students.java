package com.example.demo.Students;

public class Students {
    private long id;
    private String name;
    private int age;
    private String email;
    private String dod;
    public Students(){

    }
    public Students(long id, String name, int age, String email, String dod){
        this.id = id;
        this.name = name;
        this.age =age;
        this.dod = dod;
        this.email =email;

    }

    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getemail(){
        return this.email;
    }
    public void setemail(String email){
        this.email = email;
    }
    public String getdod(){
        return this.dod;
    }
    public void setdod(String dod){
        this.dod = dod;
    }
    public int getage(){
        return this.age;
    }
    public void setage(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Students{"+
        "id=" +id + ", name='"+name +'\''+ ", email='"+email + '\''+ ", dob=" + dod + ", age ="+ age +
        '}';
    }


}
