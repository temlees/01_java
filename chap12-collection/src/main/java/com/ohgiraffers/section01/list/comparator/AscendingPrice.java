package main.java.com.ohgiraffers.section01.list.comparator;


import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    //정렬기준 메소드
    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        int result = 0;

        if (o1.getPrice() > o2.getPrice()) {
            result = 1;

        }else if (o1.getPrice() < o2.getPrice()) {
            result = -1;
        }else if (o1.getPrice() == o2.getPrice()) {
            result = 0;
        }
        return result;
    }

}
