package com.dunystudios.hytale.plugins;

import java.util.UUID;

public interface IEcoAPI {
    float getBalance(UUID playerId);
    void addBalance(UUID playerId, float amount);
    void removeBalance(UUID playerId, float amount);
    void setBalance(UUID playerId, float amount);

    class Service {
        private static IEcoAPI instance;

        public static IEcoAPI getInstance() {
            return instance;
        }

        public static void setInstance(IEcoAPI api) {
            instance = api;
        }
    }
}
