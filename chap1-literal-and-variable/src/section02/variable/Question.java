package section02.variable;

public class Question {
    public static void main(String[] args) {

        /*
        * 김경리가 4명의 직원의 월급을 입금
        * 각각 직책은 대리/과장/차장/부장이며
        * 대리 100만원 과장120 차장 130 부장150만원 월급을 받는다
        * 보너스는 각 월급 * 0.5만큼 부여한다
        *
        * 화면에 김대리의 월급은 100만원 + 보너스 90만원으로 총 150 입금되었습니다 출력
        *
        * */
        int dae =100;
        int dbonus = (int)(dae*0.5);
        int gua = 120;
        int gbonus = (int)(gua*0.5);
        int cha = 130;
        int cbonus = (int)(cha*0.5);
        int bu = 150;
        int bbonus = (int)(bu*0.5);

        System.out.println("김대리의 월급은 "+ dae +"만원"+ "+"+"보너스"+ dbonus +"만원으로 총"+(dae+dbonus)+"입급되었습니다");
        System.out.println("김과장의 월급은 "+ gua +"만원"+ "+"+"보너스"+ gbonus +"만원으로 총"+(gua+gbonus)+"입급되었습니다");
        System.out.println("김차장의 월급은 "+ cha +"만원"+ "+"+"보너스"+ dbonus +"만원으로 총"+(cha+cbonus)+"입급되었습니다");
        System.out.println("김부장의 월급은 "+ bu +"만원"+ "+"+"보너스"+ bbonus +"만원으로 총"+(bu+bbonus)+"입급되었습니다");

    }//main
}//class
