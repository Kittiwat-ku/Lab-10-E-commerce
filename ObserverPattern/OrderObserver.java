package ObserverPattern;

import DataModels.Order;
/**
 * Interface (Observer)
 */
public interface OrderObserver  {
    void update(Order order);
}
