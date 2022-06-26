package org.csystem.app.simulation.lotto;

import org.csystem.app.game.lotto.Lotto;

public class LottoProbabilitySimulation {
    public int count;
    public double game1Prob;
    public double game2Prob;
    public double game3Prob;

    public LottoProbabilitySimulation(int n)
    {
        count = n;
    }

    public void run()
    {
        java.util.Random r = new java.util.Random();

        int winCount1, winCount2, winCount3;

        winCount1 = winCount2 = winCount3 = 0;

        for (int i = 0; i < count; ++i) {
            Lotto lotto = new Lotto(r);

            lotto.play();

            if (lotto.winGame1)
                ++winCount1;

            if (lotto.winGame2)
                ++winCount2;

            if (lotto.winGame3)
                ++winCount3;
        }

        game1Prob = (double)winCount1 / count;
        game2Prob = (double)winCount2 / count;
        game3Prob = (double)winCount3 / count;
    }
}