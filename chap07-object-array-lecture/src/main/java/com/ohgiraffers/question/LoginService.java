package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService {

    public void login(){
        Scanner sc = new Scanner(System.in);
        LoginRepository loginRepo = new LoginRepository();

        System.out.println("아이디 입력 :");
        String id = sc.nextLine();
        System.out.println("비밀번호 입력 :");
        int pwd = sc.nextInt();

        if(loginRepo.loginok(id,pwd)==true){
            System.out.println("로그인 되었습니다");
        }else{
            System.out.println("가입된 회원이 없습니다.");
        }


    }


    public void signup(){
        Scanner sc = new Scanner(System.in);
        LoginRepository loginRepo = new LoginRepository();
        UserDTO userDTO = new UserDTO();
    //데이터를 받아와서 값을 전달 해줄때
        // dto객체를 생성해 생성자로 넘겨주거나
        // dto객체를 생성하여 setter로 각각 값을 넘겨받고
        //데이터 처리하는 메소드로 각 전달인자를 getter로 넘겨준다.
        System.out.println("회원가입할 아이디 입력");
        userDTO.setId(sc.nextLine());
        System.out.println("이름입력");
        userDTO.setName(sc.nextLine());
        System.out.println("비밀번호 입력 :");
        userDTO.setPwd(sc.nextInt());
        System.out.println("비밀번호 확인");
        userDTO.setPwdOK(sc.nextInt());


        if(userDTO.pwd == userDTO.pwdOK){

            loginRepo.gaip(userDTO.getId(), userDTO.getName(), userDTO.getPwd(), userDTO.getPwdOK());
            System.out.println("회원가입 성공");
        }else{
            System.out.println("비밀번호 확인이 비밀번호와 다릅니다.");
        }
/*
        public void signup(){
            Scanner sc = new Scanner(System.in);
            LoginRepository loginRepo = new LoginRepository();
            UserDTO userDTO = new UserDTO();

            System.out.println("회원가입할 아이디 입력");
            String id = sc.nextLine();
            System.out.println("이름입력");
            String name = sc.nextLine();
            System.out.println("비밀번호 입력 :");
            int pwd = sc.nextInt();
            System.out.println("비밀번호 확인");
            int pwdOK = sc.nextInt();

            UserDTO user = new UserDTO(id,name,pwd,pwdOK);

            if(userDTO.pwd == userDTO.pwdOK){
                loginRepo.gaip(user);

                System.out.println("회원가입 성공");
            }else{
                System.out.println("비밀번호 확인이 비밀번호와 다릅니다.");
            }
*/



    }
}//class
