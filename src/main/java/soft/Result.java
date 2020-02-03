package soft;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private List<String> matches = new ArrayList<>();
    private List<Integer> lines = new ArrayList<>();
    private int matchesCounter = 0;
    private int currentLine = 1;

    public void addMatch(String match) {
        matches.add(match);
        lines.add(currentLine);
        matchesCounter++;
    }

    public void toNextLine() {
        currentLine++;
    }

    public List<String> getMatches() {
        return matches;
    }

    public int getMatchesCounter() {
        return matchesCounter;
    }

    public List<Integer> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matches.size(); i++) {
            builder.append("[").append(getLines().get(i)).append
                    ("]").append(" - ").append(getMatches().get(i)).append("\n");
        }
        builder.append("Total matches: ").append(getMatchesCounter());
        return builder.toString();
    }
}
