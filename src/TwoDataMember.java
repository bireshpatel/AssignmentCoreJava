class TwoDataMember {
    private int param1;
    private int param2;

    TwoDataMember(int var1, int var2) {
        param1 = var1;
        param2 = var2;
    }

    int add(){
        return param2 + param1;
    }

    int sub(){
        return param1 - param2;
    }

    int div(){
        return param1/param2;
    }

    int multi(){
        return param1*param2;
    }
}
