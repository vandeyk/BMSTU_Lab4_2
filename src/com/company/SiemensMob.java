package com.company;

public abstract class SiemensMob implements Mobile{

    protected String company = "SIEMENS";
    String model_name;
    @Override
    public void Ring() {
        System.out.println("TRR-TRR-TRR");
    }

}
