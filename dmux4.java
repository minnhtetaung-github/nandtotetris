class dmux4{

    static int ina;
    static int sel1;
    static int sel2;
    static int dmux1out1;
    static int dmux1out2;
    
    static int result1;
    static int result2;
    static int result3;
    static int result4; 
    
    static void out(){

        dmux dmux1 = new dmux();
        dmux1.ina = ina;
        dmux1.sel = sel1;
        dmux1.out();
        dmux1out1 = dmux1.result1;
        dmux1out2 = dmux1.result2;

        dmux dmux2 = new dmux();
        dmux2.ina = dmux1out1;
        dmux2.sel = sel2;
        dmux2.out();
        result1 = dmux2.result1;
        result2 = dmux2.result2;

        dmux dmux3 = new dmux();
        dmux3.ina = dmux1out2;
        dmux3.sel = sel2;
        dmux3.out();
        result3 = dmux3.result1;
        result4 = dmux3.result2;



    }

}