/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;

/**
 *
 * @author hcadavid
 */
public class Main {

    public static void main(String a[]) {
        long startTime = System.currentTimeMillis();
        HostBlackListsValidator hblv = new HostBlackListsValidator();
        List<Integer> blackListOcurrences = hblv.checkHost("212.24.24.55", 100);
        System.out.println("The host was found in the following blacklists:" + blackListOcurrences);
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);   
    }
}
