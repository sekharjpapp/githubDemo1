package com.pixel.ocp;

public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement hm = new HospitalManagement();
        Employee tom = new Nurse(1,"Tom","emergency",true);
        hm.callUpon(tom);
        System.out.println("**********************");
        Employee suazon = new Doctor(2,"Suazon","emergency",true);
        hm.callUpon(suazon);
    }
}
