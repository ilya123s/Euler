package tennis.flow;

import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

import tennis.components.TennisComponent;

public class Updater implements Runnable {

    private ConcurrentHashMap<String, TennisComponent> componentMap;

    private Queue<TennisComponent> componentQueue;

    @Override
    public void run() {

    }

}
