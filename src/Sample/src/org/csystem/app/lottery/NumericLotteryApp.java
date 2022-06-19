package org.csystem.app.lottery;

import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery lottery = new NumericLottery();

        for (;;) {
            System.out.print("Kaç tane kupon oynamak istersiniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            while (n-- > 0)
                ArrayUtil.print(2, lottery.getNumbers());
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
