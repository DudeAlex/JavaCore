package mitarbeiter;

import java.util.List;

public class Department extends Company {
    private Manager manager;
    private List<Worker> workerList;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }
}
