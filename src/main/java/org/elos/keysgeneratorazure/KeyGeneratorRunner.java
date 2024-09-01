package org.elos.keysgeneratorazure;


import org.elos.keysgeneratorazure.config.KeyConfig;
import org.elos.keysgeneratorazure.service.KeysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class KeyGeneratorRunner implements CommandLineRunner {

    private final KeysService keyService;

    @Autowired
    public KeyGeneratorRunner(KeysService keyService) {
        this.keyService = keyService;
    }

    @Override
    public void run(String... args) {
        String initialPrefix = "CAFE";
        if ("TRUE".equals(System.getenv("GENERATING_KEYS"))) {
            while (true) {
                keyService.generateAndStoreKeys(initialPrefix);
                initialPrefix = getNextPrefix(initialPrefix); // Implement logic to get the next prefix
            }
        }  else {
            for (int i = 0; i < 15; i++) {
                System.out.println(i+" ESSESESESE");

            }
        }


    }

    private static final List<String> PREFIXES = List.copyOf(KeyConfig.KEY_CONFIGS.keySet());
    private AtomicInteger currentIndex = new AtomicInteger(0);

    // Method to get the next prefix in sequence
    public String getNextPrefix(String currentPrefix) {
        if (currentPrefix == null || !KeyConfig.KEY_CONFIGS.containsKey(currentPrefix)) {
            // If currentPrefix is null or invalid, start from the first prefix
            currentIndex.set(0);
        } else {
            // Find the current index of the prefix and move to the next
            currentIndex.set(PREFIXES.indexOf(currentPrefix));
            currentIndex.set((currentIndex.get() + 1) % PREFIXES.size()); // Cycle through prefixes
        }
        return PREFIXES.get(currentIndex.get());
    }
}