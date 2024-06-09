package main;

import Login_SignUp.Login;

public class Main {
    public Main(){
        Login login = new Login();
        login.setVisible(true);
    }
    
    public static void main(String[] args){
        new Main();
    }
}
