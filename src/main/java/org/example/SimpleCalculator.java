package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SimpleCalculator {
    public SimpleCalculator() {
    }

    public List<Integer> tokenize(String input) {
        String delimiter = ",\n";
        String newInput = input;
        if (input.startsWith("//")) {
            String[] split = input.split("\n");
            delimiter = split[0].substring(2);
            newInput = split[1];
        }
        StringTokenizer st = new StringTokenizer(newInput, delimiter, true);
        List<Integer> tokens = new ArrayList<Integer>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (delimiter.equals(",\n")) {
                if (token.equals(",") || token.equals("\n")) {
                    continue;
                }
            } else {
                if (token.equals(delimiter) || token.equals("\n")) {
                    continue;
                }
            }
            tokens.add(Integer.parseInt(token));
        }
        return tokens;
    }

    public int add(String input) {
        if (input.length() == 0) {
            return 0;
        }
        List<Integer> tokens = tokenize(input);
        int sum = 0;
        for (int i = 0; i < tokens.size(); i++) {
            sum += tokens.get(i);
        }
        return sum;
    }

    public int subtract(String input) {
        if (input.length() == 0) {
            return 0;
        }
        List<Integer> tokens = tokenize(input);
        int sum = tokens.get(0);
        for (int i = 1; i < tokens.size(); i++) {
            sum -= tokens.get(i);
        }
        return sum;
    }
}
