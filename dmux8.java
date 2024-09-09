class dmux8{

    static int ina;
    static int dmux1out1;
    static int dmux1out2;

    static int sel1;
    static int sel2;
    static int sel3;
    static int sel4;

    static int result[] = new int[8];

    static void out(){

        dmux dmux1 = new dmux();
        dmux1.ina = ina;
        dmux1.sel = sel1;
        dmux1.out();
        dmux1out1 = dmux1.result1;
        dmux1out2 = dmux1.result2;

        dmux4 dmux41 = new dmux4();
        dmux41.ina = dmux1out1;
        dmux41.sel1 = sel2;
        dmux41.sel2 = sel3;
        dmux41.out();
        result[0] = dmux41.result1;
        result[1] = dmux41.result2;
        result[2] = dmux41.result3;
        result[3] = dmux41.result4;

        dmux4 dmux42 = new dmux4();
        dmux42.ina = dmux1out2;
        dmux42.sel1 = sel2;
        dmux42.sel2 = sel3;
        dmux42.out();
        result[4] = dmux42.result1;
        result[5] = dmux42.result2;
        result[6] = dmux42.result3;
        result[7] = dmux42.result4;







    }
}