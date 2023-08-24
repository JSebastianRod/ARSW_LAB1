package edu.eci.arsw.blacklistvalidator;

import java.util.LinkedList;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class BlackListThread extends Thread{
    private int start;
    private int end;
    private String ipaddress;
    private int timesFinded;
    private int checkedList;
    private HostBlacklistsDataSourceFacade blackListServers;
    private LinkedList<Integer> blackLists = new LinkedList<>();
    
    public BlackListThread(String ipaddress,int start, int end, HostBlacklistsDataSourceFacade blackListServers) {
        this.ipaddress = ipaddress;
        this.start = start;
        this.end = end;
        this.blackListServers = blackListServers;
    }

    public int getCheckedList(){
        return checkedList;
    }

    public int getTimesFinded(){
        return timesFinded;
    }

    public LinkedList<Integer> getBlackLists(){
        return blackLists;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            checkedList++;
            if (blackListServers.isInBlackListServer(i, ipaddress)) {
                blackLists.add(i);
                timesFinded++;
            }
        }
    }


}
