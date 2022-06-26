package org.csystem.app.game.lotto;

import org.csystem.util.numeric.NumberUtil;

public class Lotto {
    public boolean winGame1;
    public boolean winGame2;
    public boolean winGame3;
    java.util.Random random;

    public int getFirst()
    {
        return random.nextInt(1, 100);
    }

    public int getSecond(int first)
    {
        int second;

        while ((second = random.nextInt(1, 100)) == first)
            ;

        return second;
    }

    public int getThird(int first, int second)
    {
        int third;

        while ((third = random.nextInt(1, 100)) == first || third == second)
            ;

        return third;
    }

    public void playGame1(int first, int second, int third)
    {
        winGame1 = first + second + third < 150;
    }

    public void playGame2(int first, int second, int third)
    {
        winGame2 = NumberUtil.isPrime(first + second + third);
    }

    public void playGame3(int first, int second, int third)
    {
        int min = NumberUtil.min(first, second, third);
        int mid = NumberUtil.mid(first, second, third);
        int max = NumberUtil.max(first, second, third);

        winGame3 = max - min > mid;
    }

    public Lotto(java.util.Random r)
    {
        random = r;
    }

    public void play()
    {
        int first = getFirst();
        int second = getSecond(first);
        int third = getThird(first, second);

        playGame1(first, second, third);
        playGame2(first, second, third);
        playGame3(first, second, third);
    }
}