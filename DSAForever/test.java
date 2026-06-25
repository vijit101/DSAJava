
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
}
