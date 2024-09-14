package org.elos.keysgeneratorazure.config;

import java.util.HashMap;
import java.util.Map;

public class KeyConfig {

    // Define a map to hold the configuration data
    public static final Map<String, KeyDetails> KEY_CONFIGS = new HashMap<>();

    // Static block to initialize the configuration data
    static {
//        KEY_CONFIGS.put("TRAIN", new KeyDetails("82647f43-3f87-402d-88dd-09a90025313f", "c4480ac7-e178-4973-8061-9ed5b2e17954", 120000));
//        KEY_CONFIGS.put("CUBE", new KeyDetails("d1690a07-3780-4068-810f-9b5bbf2931b2", "b4170868-cef0-424f-8eb9-be0622e8e8e3", 20000));
//        KEY_CONFIGS.put("MERGE", new KeyDetails("8d1cc2ad-e097-4b86-90ef-7a27e19fb833", "dc128d28-c45b-411c-98ff-ac7726fbaea4", 20000));
//        KEY_CONFIGS.put("TWERK", new KeyDetails("61308365-9d16-4040-8bb0-2f4a4c69074c", "61308365-9d16-4040-8bb0-2f4a4c69074c", 20000));
//        KEY_CONFIGS.put("POLYSPHERE", new KeyDetails("2aaf5aee-2cbc-47ec-8a3f-0962cc14bc71", "2aaf5aee-2cbc-47ec-8a3f-0962cc14bc71", 3000));
//        KEY_CONFIGS.put("TRIM", new KeyDetails("ef319a80-949a-492e-8ee0-424fb5fc20a6", "ef319a80-949a-492e-8ee0-424fb5fc20a6", 20000));
//        KEY_CONFIGS.put("ZOO", new KeyDetails("b2436c89-e0aa-4aed-8046-9b0515e1c46b", "b2436c89-e0aa-4aed-8046-9b0515e1c46b", 22000));
//        KEY_CONFIGS.put("TILE", new KeyDetails("e68b39d2-4880-4a31-b3aa-0393e7df10c7", "e68b39d2-4880-4a31-b3aa-0393e7df10c7", 20000));
//        KEY_CONFIGS.put("FLUFF", new KeyDetails("112887b0-a8af-4eb2-ac63-d82df78283d9", "112887b0-a8af-4eb2-ac63-d82df78283d9", 120000));
//        KEY_CONFIGS.put("STONE", new KeyDetails("04ebd6de-69b7-43d1-9c4b-04a6ca3305af", "04ebd6de-69b7-43d1-9c4b-04a6ca3305af", 20000));
//        KEY_CONFIGS.put("BOUNCE", new KeyDetails("bc72d3b9-8e91-4884-9c33-f72482f0db37", "bc72d3b9-8e91-4884-9c33-f72482f0db37", 60000));
        KEY_CONFIGS.put("HIDE", new KeyDetails("4bf4966c-4d22-439b-8ff2-dc5ebca1a600", "4bf4966c-4d22-439b-8ff2-dc5ebca1a600", 20000));
    }

    // Function to get appToken and promoId based on the key
    public static KeyDetails getKeyDetails(String key) {
        return KEY_CONFIGS.get(key);
    }

    // Class to hold the details of each key
    public static class KeyDetails {
        private final String appToken;
        private final String promoId;
        private final int timeout;

        public KeyDetails(String appToken, String promoId, int timeout) {
            this.appToken = appToken;
            this.promoId = promoId;

            this.timeout = timeout;
        }

        public String getAppToken() {
            return appToken;
        }

        public String getPromoId() {
            return promoId;
        }

        @Override
        public String toString() {
            return "KeyDetails{" +
                    "appToken='" + appToken + '\'' +
                    ", promoId='" + promoId + '\'' +
                    '}';
        }

        public int getTimeout() {
            return timeout;
        }
    }

}