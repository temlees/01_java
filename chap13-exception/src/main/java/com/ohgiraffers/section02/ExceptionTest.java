package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNagativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMemory(int price, int money) throws PriceNegativeException, MoneyNagativeException, NotEnoughMoneyException {

        System.out.println("가지고 있는 돈은 "+money+"원 입니다");

        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다");
            
        
        }
        if (money < 0) {
            throw new MoneyNagativeException("가진 돈은 음수일 수 없습니다.");
            
        }
        if (price > money) {
            throw new NotEnoughMoneyException("가진 돈 보다 상품가격이 비쌉니다");
        }

        System.out.println("가진돈이 충분합니다. 즐거운 쇼핑하세요");

    }
}
