package tennis.flow;

import java.util.LinkedList;

import tennis.components.TennisComponent;

public class Updater implements Runnable {

    private LinkedList<TennisComponent> componentList;

    public Updater(LinkedList<TennisComponent> componentList) {
        this.componentList = componentList;
    }

    public void addComponentToBeUpdated(TennisComponent componentToBeAdded) {
        componentList.add(componentToBeAdded);
    }

    @Override
    public void run() {

        while (true) {
            for (TennisComponent component : componentList) {
                if (component.needsToBeUpdate()) {
                    component.update();
                }
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
