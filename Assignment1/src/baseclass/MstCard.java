package baseclass;

import java.util.List;
public class MstCard {
    private String key;
    private String value;
    private List<String> occurance;


    @Override
    public String toString() {
        return "MstCard [key=" + key + ", value=" + value + ", occurance=" + occurance + "]";
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public List<String> getOccurance() {
        return occurance;
    }
    public void setOccurance(List<String> occurance) {
        this.occurance = occurance;
    }
}
