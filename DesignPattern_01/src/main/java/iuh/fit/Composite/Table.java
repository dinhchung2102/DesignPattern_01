package iuh.fit.Composite;

import java.util.ArrayList;
import java.util.List;

 public class Table implements MenuItem {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }
}