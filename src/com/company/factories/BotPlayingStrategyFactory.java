package com.company.factories;

import com.company.models.BotDifficultyLevel;
import com.company.strategies.botplayingstrategy.BotPlayingStrategy;
import com.company.strategies.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        return new RandomBotPlayingStrategy();
    }
}
