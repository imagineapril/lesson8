package ru.timokhina.lesson8;

public abstract class Converter {

    public static void converter()    {
        Contract contract = new Contract(1, 6.04, "tesla");

        Act act = new Act(contract.getContractNumber(), contract.getContractDate(), contract.getContractTitle());
            System.out.println("Создан акт под номером " + contract.getContractNumber() + " от " + contract.getContractDate() + " с именем " + contract.getContractTitle());
        }

        public static void main(String[] args) {
        converter();
        }
    }
