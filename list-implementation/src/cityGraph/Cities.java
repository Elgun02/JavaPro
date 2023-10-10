package cityGraph;

import java.util.HashMap;
import java.util.Map;

public class Cities {
    private Map<String, Integer> cities;

    public Cities(Map<String, Integer> cities) {
        this.cities = new HashMap<>();
    }

    public Map<String, Integer> getCities() {
        return cities;
    }

    public void setCities(Map<String, Integer> cities) {
        this.cities = cities;
    }
}
