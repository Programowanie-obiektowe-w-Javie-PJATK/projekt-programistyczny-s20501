package histogram.Class;

import java.util.*;

public class HistogramText {

    private  Map<String,Long> histogram;

    public HistogramText(String text){

        // Zamieniam stringa na liste
        List<String> words = Arrays.asList(text.split("\\s+"));

        // Mapowanie duplikatow
        Map<String,Long> counterMap = new HashMap<>();

        for (String element : words) {
            if (counterMap.containsKey(element)) {
                counterMap.put(element, counterMap.get(element) + 1L);
            } else {
                counterMap.put(element, 1L);
            }
        }

        this.histogram = counterMap;
    }

    public String getHistogram() {

        // Konwersja map na string
        StringBuilder sb = new StringBuilder();
        for (String key : histogram.keySet()) {
            String s = key + ": " + histogram.get(key) + "\r\n";
            sb.append(s);
        }
        String mapAsString = sb.toString();
        return mapAsString;
    }

}
