package apps;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class App {

    private Map<String, PageObject> pages;

    protected void init(PageObject... pages) {
        this.pages = Arrays.stream(pages)
                .collect(Collectors.toMap(PageObject::name, pageObject -> pageObject));
    }

    protected PageObject page(String name) {
        return pages.get(name);
    }
}
