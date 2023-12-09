/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class WorkQueue {
    ArrayList<WorkRequest> listOfRequests;
    
    public WorkQueue(){
        listOfRequests = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getListOfRequests() {
        return listOfRequests;
    }

    public void setListOfRequests(ArrayList<WorkRequest> listOfRequests) {
        this.listOfRequests = listOfRequests;
    }
    
    public WorkRequest addWorkRequest(){
        WorkRequest wr = new WorkRequest();
        listOfRequests.add(wr);
        return wr;
    }
    
    public WorkRequest findWorkRequest(int id){
        for (WorkRequest wr : listOfRequests){
            if (wr.getId() == id){
                return wr;
            }
        }
        return null;
    }
}
