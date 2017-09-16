import com.google.common.base.Functions;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class listToMap {
    class Composite {
        String name;
        String description;

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public Composite(String name, String description) {
            this.name = name;
            this.description = description;
        }
    }

    public HashMap<String, String> listToMap() {
        Stream<Composite> items = IntStream.range(0,4)
                .mapToObj(n -> new Composite(
                        "name-" + n, "description-" + n));

        HashMap<String, String> theMap = new HashMap<>();

        items.forEach(c -> theMap.put(c.getName(), c.getDescription()));

        return theMap;
    }

}
