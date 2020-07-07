package ru.timokhina.lesson8;

class Contract {

    private int contractNumber;
    private double contractDate;
    private String contractTitle;


    public Contract(int n, double d, String t) {
        contractNumber = n;
        contractDate = d;
        contractTitle = t;
    }

    void setContractNumber(int n) {
        contractNumber = n;
    }

    int getContractNumber() {
        return contractNumber;
    }

    void setContractDate(double d) {
        contractDate= d;
    }

    double getContractDate() {
        return contractDate;
    }

    void setContractTitle(String t) {
        contractTitle = t;
    }

    String getContractTitle() {
        return contractTitle;
    }
}

