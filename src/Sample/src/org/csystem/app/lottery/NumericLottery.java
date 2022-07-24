package org.csystem.app.lottery;

import java.util.Random;

public class NumericLottery {
    private final Random m_random;

    private static int [] getNumbers(boolean [] flags)
    {
        int [] numbers = new int[6];

        int idx = 0;

        for (int i = 1; i < 50; ++i)
            if (flags[i])
                numbers[idx++] = i;

        return numbers;
    }

    private boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];

        for (int i = 0; i < 6; ++i) {
            int a;

            for (;;) {
                a = m_random.nextInt(1, 49);
                if (!flags[a])
                    break;
            }
            flags[a] = true;
        }

        return flags;
    }

    public NumericLottery()
    {
        m_random = new Random();
    }

    public NumericLottery(Random r)
    {
        m_random = r;
    }

    public int[] getNumbers()
    {
        return getNumbers(getFlags());
    }

    public int [][] getNumbers(int count)
    {
        int [][] numbers = new int[count][];

        for (int i = 0; i < count; ++i)
            numbers[i] = getNumbers();

        return numbers;
    }
}
