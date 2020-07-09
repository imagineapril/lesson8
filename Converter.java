package ru.timokhina.lesson8;

public abstract class Converter {

    public static Act converter (Contract contract)    {

        Act act = new Act(contract.getContractNumber(), contract.getContractDate(), contract.getContractTitle());
            System.out.println("Создан акт под номером " + contract.getContractNumber() + " от " + contract.getContractDate() + " с именем " + contract.getContractTitle());
        return act;
    }

        public static void main(String[] args) {
        converter(new Contract(1, 6.04, "tesla"));
        }
    }
