package ru.timokhina.lesson8;

public class Act {

    int actNumber;
    double actDate;
    String actTitle;

    public Act(int n, double d, String t) {

    }

    public static void main(String[]args) {


    Contract contract = new Contract(1, 6.04, "tesla");
    Act act = new Act(contract.getContractNumber(), contract.getContractDate(), contract.getContractTitle());

        System.out.println("Создан акт под номером " + contract.getContractNumber() +
                " от " + contract.getContractDate() + " с именем " + contract.getContractTitle());

    }
}


