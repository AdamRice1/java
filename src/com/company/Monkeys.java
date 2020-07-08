package com.company;

class Monkeys {

    boolean monkeyBusiness(Monkey[] monkeys) {
        return true;
    }

    static class Monkey {
        String name;
        boolean smile;

        public Monkey(String name, boolean smile) {
            this.name = name;
            this.smile = smile;
        }
    }

    public static void main(String[] args) {
        Monkey monk1 = new Monkey("Rafiqi", false);
        Monkey monk2 = new Monkey("Curious George", true);
        Monkey monk3 = new Monkey("King Kong", false);

        Monkey[] monkeyList = {monk1, monk2, monk3};
        int smiling = 0;
        int notSmiling = 0;

        for (int i = 0; i<monkeyList.length; i++ ) {
            if (monkeyList[i].smile) {
                smiling++;
                System.out.println(monkeyList[i].name + " is smiling ");
            }
            else {
                notSmiling++;
                System.out.println(monkeyList[i].name + " is not smiling ");
            }
        }

        if (smiling>notSmiling) {
            System.out.println("There are more happy monkeys!");
        } else if (smiling<notSmiling) {
            System.out.println("Watch out! More Angry Monkeys!");
        } else {
            System.out.println("It is an even battle for happiness");
        }

    }


}