package main.java.com.ohgiraffers.question;

public class LoginRepository {

    private final static UserDTO [] user = new UserDTO[10];

    private static int count;

    public static void gaip(String id,String name,int pwd,int pwdOK){
        if(count != 10 ){
            user[count++] = new UserDTO(id,name,pwd,pwdOK);
        }else {
            System.out.println("정원을 초과하였습니다");
        }

    }//gaip

    public static boolean loginok(String id, int pwd){

        for (int i = 0; i < user.length; i++) {
            if (user[i] != null && user[i].getId().equals(id) && user[i].getPwd() == pwd  ){
                    return true;
            }
        }
        return  false;
    }


}//class
