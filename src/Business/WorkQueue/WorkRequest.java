
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.util.Date;

public abstract class WorkRequest {

   
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Enterprise sendereEnterprise;
   
    public WorkRequest(){
        requestDate = new Date();
    }

   
    public Enterprise getSendereEnterprise() {
       
        return sendereEnterprise;
    }

    public void setSendereEnterprise(Enterprise sendereEnterprise) {
        this.sendereEnterprise = sendereEnterprise;
    }



    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString(){
        return sender.getPerson().getName();
    }
}
