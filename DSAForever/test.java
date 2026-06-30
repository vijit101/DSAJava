
import java.util.HashMap;

public class test {

    public static void main(String[] args) {

    }

    public String getHint(String secret, String guess) {
        int cow = 0;
        int bull = 0;
        int len = secret.length();
        HashMap<Character, Integer> secretSet = new HashMap<>();
        HashMap<Character, Integer> guessSet = new HashMap<>();
        for (int i = 0; i < len; i++) {

            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;

            } else {

                if (secretSet.containsKey(secret.charAt(i))) {
                    secretSet.put(secret.charAt(i), secretSet.get(secret.charAt(i)) + 1);
                    if (guessSet.containsKey(secret.charAt(i))) {
                        guessSet.put(guess.charAt(i), guessSet.get(guess.charAt(i)) + 1);
                    } else {
                        guessSet.putIfAbsent(guess.charAt(i), 1);
                    }

                } else {
                    secretSet.putIfAbsent(secret.charAt(i), 1);
                    guessSet.putIfAbsent(guess.charAt(i), 1);
                }

            }

        }

        for (int i = 0; i < len; i++) {
            Character secretithLetter = secret.charAt(i);
            //Character guessithLetter = guess.charAt(i);
            if (secretSet.containsKey(secretithLetter) && guessSet.containsKey(secretithLetter)) {
                Integer valAtSecretKey = secretSet.get(secretithLetter);
                Integer valAtGuessKey = guessSet.get(secretithLetter);
                if (valAtGuessKey == valAtSecretKey) {
                    cow += valAtGuessKey;
                } else {
                    Integer minVal = Math.min(valAtGuessKey, valAtSecretKey);
                    cow += minVal;
                }
                secretSet.remove(secretithLetter);

            }
        }

        StringBuilder Answer = new StringBuilder(bull + "A" + cow + "B");
        return Answer.toString();
    }

    public String getHintCleanCode(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        HashMap<Character, Integer> secretFreq = new HashMap<>();
        HashMap<Character, Integer> guessFreq = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {

            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {

                secretFreq.put(s, secretFreq.getOrDefault(s, 0) + 1);

                guessFreq.put(g, guessFreq.getOrDefault(g, 0) + 1);
            }
        }

        for (char c : secretFreq.keySet()) {

            if (guessFreq.containsKey(c)) {

                cows += Math.min(
                        secretFreq.get(c),
                        guessFreq.get(c)
                );
            }
        }

        return bulls + "A" + cows + "B";
    }

    public String getHintOptimized(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        int[] count = new int[10];

        for (int i = 0; i < secret.length(); i++) {

            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';

            if (s == g) {
                bulls++;
            } else {

                if (count[s] < 0) {
                    cows++;
                }

                if (count[g] > 0) {
                    cows++;
                }

                count[s]++;
                count[g]--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
